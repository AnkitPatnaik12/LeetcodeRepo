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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> temp=new LinkedList<>();
        int leftvalue=0;
        temp.add(root);
        while(!temp.isEmpty()){
            int size=temp.size();
            for(int i=0;i<size;i++)
            {    
                TreeNode node=temp.poll();
                if(i==0&&node!=null)
                    leftvalue=node.val;
                if(node.left!=null)temp.add(node.left);
                if(node.right!=null)temp.add(node.right);
            }
        }
        return leftvalue;
        
    }
}