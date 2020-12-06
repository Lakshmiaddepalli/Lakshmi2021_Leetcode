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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int sum = 0;
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        if (root != null){
            st.push(root);
        }
        
        while(!st.isEmpty()){
        
            TreeNode nodeval = st.pop();
            if(nodeval != null){
                if(nodeval.val >= low && nodeval.val <= high){
                    sum += nodeval.val; 
                }
            
                if(nodeval.val > low){
                    st.push(nodeval.left);
                }
            
                if(nodeval.val < high){
                    st.push(nodeval.right);
                }
            }
        }
        return sum;
    }
}
