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
    public int sumEvenGrandparent(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        return dfs(root, root.left, 0) + dfs(root, root.right,0);
    }
    
    public int dfs(TreeNode grandparent, TreeNode parent, int sum){
        
        if(grandparent == null || parent == null){
            return sum;
        }
        
        if(grandparent.val%2 == 0 && parent.left!=null){
            sum += parent.left.val;
        }
        
        if(grandparent.val%2 == 0 && parent.right!=null){
            sum += parent.right.val;
        }
        
        sum = dfs(parent,parent.left,sum);
        sum = dfs(parent,parent.right,sum);
        
        return sum;
        
    }
}
