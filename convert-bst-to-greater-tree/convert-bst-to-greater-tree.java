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
    int pre = 0;
    
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        
        convertBST(root.right);
        root.val = root.val + pre;
        pre = root.val;
        convertBST(root.left);
        return root;
    }
}