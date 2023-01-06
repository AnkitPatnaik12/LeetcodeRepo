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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1,hm);
        
    }
    public TreeNode build(int[] preorder,int[] inorder,int sporder,int eporder,int siorder,int eiorder,HashMap<Integer,Integer> hm)
    {
        if(sporder>eporder||siorder>eiorder)
            return null;
        TreeNode root=new TreeNode(preorder[sporder]);
        int inr=hm.get(preorder[sporder]);
        int numsleft=inr-siorder;
        root.left=build(preorder,inorder,sporder+1,sporder+numsleft+1,siorder,inr-1,hm);
        root.right=build(preorder,inorder,sporder+numsleft+1,eporder,inr+1,eiorder,hm);
        return root;
    }
}