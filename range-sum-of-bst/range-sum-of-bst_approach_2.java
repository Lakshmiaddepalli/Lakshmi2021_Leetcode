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
    private int sum;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root,low,high);
        return sum;
    }
    
    public void dfs(TreeNode root,int low,int high){
        if(root == null){
            return;
        }
        
        if(root.val <= high && root.val >= low){
            sum += root.val;
        }
        
        if (root.val > low){
        dfs(root.left,low,high);
        }
        if (root.val < high){
        dfs(root.right,low,high);
        }
    }
    
}
