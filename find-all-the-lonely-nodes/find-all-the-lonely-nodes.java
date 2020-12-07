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
    
    List<Integer> ls;
    
    public List<Integer> getLonelyNodes(TreeNode root) {
        ls = new ArrayList<Integer>();
        dfs(root);
        return ls;
    }
    
    public void dfs(TreeNode root){
        
        if(root == null){
            return;
        }
        
        if(root.right == null && root.left != null){
            ls.add(root.left.val);
        }
        
        if(root.left == null && root.right != null){
            ls.add(root.right.val);
        }
        
        dfs(root.left);
        dfs(root.right);
    }
    
}
