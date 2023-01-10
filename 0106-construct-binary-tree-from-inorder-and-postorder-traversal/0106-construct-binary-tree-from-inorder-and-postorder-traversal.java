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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
        
        
    }
    public TreeNode build(int inorder[],int is,int ie,int postorder[],int ps,int pe,HashMap<Integer,Integer> hm)
    {
        if(is>ie||ps>pe)
        {
            return null;
        }
        int rootind=hm.get(postorder[pe]);
        TreeNode root=new TreeNode(postorder[pe]);
        int leftsub=rootind-is;
        root.left=build(inorder,is,rootind-1,postorder,ps,ps+leftsub-1,hm);
        root.right=build(inorder,rootind+1,ie,postorder,ps+leftsub,pe-1,hm);
        return root;
    }
}