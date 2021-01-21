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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t == null){
            return true;
        }
        if(s==null){
            return false;
        }
        if(issame(s,t)){return true;}
        return isSubtree(s.left,t) || isSubtree(s.right,t);
            
    }
    
    public boolean issame(TreeNode s, TreeNode t){
      if(s==null && t == null){
            return true;
        }
       if(s==null || t == null){
            return false;
        } 
        if((s.val != t.val)){return false;}
        return (issame(s.left,t.left) && issame(s.right,t.right));
    }
}
