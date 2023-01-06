/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null)
            return res;
       Queue<TreeNode> temp=new LinkedList<>();
       temp.add(root);
       int c=0;
       while(!temp.isEmpty())
       {
           int count=temp.size();
           List<Integer> b=new ArrayList<Integer>();
           for(int i=0;i<count;i++)
           {
               if(temp.peek().left!=null)
                   temp.add(temp.peek().left);
               if(temp.peek().right!=null)
                   temp.add(temp.peek().right);
               b.add(temp.peek().val);
               temp.poll();
           }
           if(c%2!=0)
               Collections.reverse(b);
           res.add(b);
           c++;
       }
        return res;
    }
}