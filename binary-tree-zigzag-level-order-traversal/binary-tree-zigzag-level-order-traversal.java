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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        // Creating an result array
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root==null){
            return result;
        }
        
        ArrayDeque<TreeNode> deque = new ArrayDeque<TreeNode>();
        
        deque.addFirst(root);
        
        List<Integer> temp = null;
        
        while(!deque.isEmpty()){
            
            temp = new ArrayList<Integer>();
            int sizeofdeque = deque.size();
            result.add(temp);
            
            while(sizeofdeque > 0){
                
                TreeNode node = deque.removeFirst();
                temp.add(node.val);
                
                
                if(node.left!=null){
                    deque.addLast(node.left);
                }
                if(node.right!=null){
                    deque.addLast(node.right);
                }
                sizeofdeque--;
            }
            
            int sizeofdeque_val = deque.size();
            
            if(sizeofdeque_val > 0){
               temp = new ArrayList<Integer>(); 
               result.add(temp);
            }
            
            while(sizeofdeque_val > 0){
                TreeNode node = deque.removeLast();
                temp.add(node.val);
                
                if(node.right!=null){
                    deque.addFirst(node.right);
                }
                if(node.left!=null){
                    deque.addFirst(node.left);
                }
                sizeofdeque_val--;
            }
            
            
        }
            return result;
    }
    
}