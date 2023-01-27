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
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        return sumNum(root,0);
        
        
    }
    public int sumNum(TreeNode root,int sum)
    {
        if(root==null)
            return 0;
       if(root.left==null&&root.right==null)
           return sum*10+root.val;
      return sumNum(root.left,sum*10+root.val)+sumNum(root.right,sum*10+root.val);
        
    }
}