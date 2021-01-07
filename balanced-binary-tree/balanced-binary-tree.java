/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(height(root.left) - height(root.right)) > 1){
            return false;
        }else{
             return isBalanced(root.left) && isBalanced(root.right); 
            }
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int max_left = height(root.left);
            int max_right = height(root.right);
            return 1 + Math.max(max_left, max_right);
        }
    }
}
