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
    public int countNodes(TreeNode root) {
        ArrayList<Integer> po=new ArrayList<>();
        preorder(root,po);
        return po.size();
    }
    public void preorder(TreeNode root,ArrayList<Integer> porder)
    {
        if(root==null)
            return;
        porder.add(root.val);
        preorder(root.left,porder);
        preorder(root.right,porder);
        
    }
}