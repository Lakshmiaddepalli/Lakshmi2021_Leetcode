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
    /*
            1
         /     \
        2       3
          \    /  
           4   5
           
          if both child are null -> leaf node
          if one chile returns a value and other child does not -> then that parent has a lonely child.
           
          May be:
            1. write a
           
    */
    List<Integer> result = new ArrayList<>();
    
    public void checkChild(TreeNode root){
        if(root.left == null && root.right == null){
            return;
        }else if(root.left != null && root.right != null){
            checkChild(root.left);// 2
            checkChild(root.right);// 3
            
        }else if(root.left != null || root.right != null){
            if(root.left != null){
                result.add(root.left.val);
                checkChild(root.left);
            }else{
                result.add(root.right.val);
                checkChild(root.right);
            }
        }
        return;
        
    }
    
    public List<Integer> getLonelyNodes(TreeNode root) {
        checkChild(root);// 1
        return result;
    }
}
