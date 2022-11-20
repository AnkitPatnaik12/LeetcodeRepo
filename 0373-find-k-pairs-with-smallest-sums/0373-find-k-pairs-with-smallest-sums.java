class Solution {
 public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // Corner cases
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return null;
        }
        int m = nums1.length;
        int n = nums2.length;
        // Use best-first search with min-heap to make the running time O(k log k)
        
        // Create min-heap for the possible candidates, with space O(max(m, k))
        PriorityQueue<Cell> minHeap = new PriorityQueue<>(m, new MyComparator());
        
        // Create the list for result
        List<List<Integer>> res = new ArrayList<>();
        
        // Initialize min-heap with the cells in the first column
        for (int i = 0; i < m; i++) {
            minHeap.offer(new Cell(i, 0, nums1[i] + nums2[0]));
        }
        
        // Some test cases have k > m*n; some have m*n > Integer.MAX_VALUE which becomes negative
        for (int i = 1; i <= (m*n > 0 ? Math.min(m*n, k) : k); i++) {
            // Extract the i-th smallest sum and add the corresponding pair to the result
            Cell cur = minHeap.poll();
            int x = cur.x;
            int y = cur.y;
            List<Integer> curPair = new ArrayList<>();
            curPair.add(nums1[x]);
            curPair.add(nums2[y]);
            res.add(curPair);
            
            // Examine the cell on the right
            if (y + 1 < n) {
                minHeap.offer(new Cell(x, y + 1, nums1[x] + nums2[y + 1]));
            }
        }
        
        return res;
    }
    
    // To store the indices in both arrays and the corresponding sum
    class Cell {
        int x;
        int y;
        int val;    // nums1[x] + nums2[y]
        public Cell(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
    
    // To define the sorting priority in min-heap
    class MyComparator implements Comparator<Cell> {
        @Override
        public int compare(Cell c1, Cell c2) {
            if (c1.val == c2.val) {
                return 0;
            }
            return c1.val < c2.val ? -1 : 1;
        }
    }
}