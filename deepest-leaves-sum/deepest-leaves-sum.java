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
    public int deepestLeavesSum(TreeNode root) {
        int depth = 0; 
        int currdepth;
        int deepestsum = 0;
        
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root,0));
        
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> nodeval = stack.pop();
            TreeNode node = nodeval.getKey();
            currdepth = nodeval.getValue();
            
            if(node.left == null && node.right == null){
                if(depth < currdepth){
                   deepestsum = node.val;
                   depth = currdepth; 
                }else if(depth == currdepth){
                   deepestsum += node.val; 
                }
            }else{
                if(node.right!=null){
                    stack.push(new Pair(node.right,currdepth + 1));
                }
                if(node.left!=null){
                    stack.push(new Pair(node.left,currdepth + 1));
                }
                
            }
        }
        return deepestsum;
    }
}