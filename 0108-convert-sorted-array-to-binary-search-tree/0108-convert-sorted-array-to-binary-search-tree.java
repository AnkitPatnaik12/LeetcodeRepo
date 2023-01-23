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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(0,nums.length-1,nums);
    }
    public TreeNode createTree(int l,int h,int []nums)
    {
        if(l>h)
            return null;
        int mid=l+(h-l)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createTree(l,mid-1,nums);
        root.right=createTree(mid+1,h,nums);
        return root;
    }
}