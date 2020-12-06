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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        // declaring sum variable as zero
        int sum = 0;
        
        //declaring a stack for BFS
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        //Checking if a root value is null or not
        if (root != null){
            st.push(root);
        }
        
        // loop through the stack while it is not empty
        while(!st.isEmpty()){
            
            // pop out the value from the stack
            TreeNode nodeval = st.pop();
            
            // checking if the nodeval is not null
            if(nodeval != null){
                
                // checking if the nodeval is between low and high
                if(nodeval.val >= low && nodeval.val <= high){
                    sum += nodeval.val; 
                }
                
                // if nodeval is higher the low value recurse to the left
                if(nodeval.val > low){
                    st.push(nodeval.left);
                }
            
                // if nodeval is lower the high value recurse to the right
                if(nodeval.val < high){
                    st.push(nodeval.right);
                }
            }
        }
        
        //return sum value
        return sum;
    }
}
