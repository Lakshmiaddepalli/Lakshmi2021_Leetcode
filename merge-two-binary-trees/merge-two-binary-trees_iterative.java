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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return t2;
        }

        Stack<TreeNode[]> st = new Stack<TreeNode[]>();
        
        st.push(new TreeNode[]{t1,t2});
        
        while(!st.isEmpty()){
            
            TreeNode[] t = st.pop();
            
            if(t[0]==null || t[1]==null){
                continue;
            }
            
            t[0].val += t[1].val;
            
            if(t[0].left==null){
                t[0].left = t[1].left;
            }else{
                st.push(new TreeNode[]{t[0].left,t[1].left});
            }
            
            if(t[0].right == null){
                t[0].right = t[1].right;
            }else{
                st.push(new TreeNode[]{t[0].right,t[1].right});
            }
            
        }
        
        return t1;
    }
}
