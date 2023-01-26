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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE,level=0,count=0;
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {   TreeNode node=q.poll();
                sum+=node.val;
              if(node.left!=null)
                  q.add(node.left);
              if(node.right!=null)
                 q.add(node.right);
               
            }
            count++;
            if(sum>max)
            {
                max=sum;
                level=count;
            }
            sum=0;
        }
        return level;
        
    }
}