/**
 * Definition for Node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node random;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right, Node random) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *         this.random = random;
 *     }
 * }
 */

class Solution {
    public NodeCopy copyRandomBinaryTree(Node root) {
        Map<Node, NodeCopy> copy = new HashMap<Node,NodeCopy>();
        dfscopy(root,copy);
        dfsconnect(root,copy);
        return copy.get(root);
    }
    
    public void dfscopy(Node node, Map<Node, NodeCopy> copy){
        
        //root value is null
        if(node == null){
            return;
        }
        
        //create a copy of the node
        NodeCopy n = new NodeCopy(node.val);
        // put the copy of the node in the hashmap
        copy.put(node,n);
        //dfs for left child
        dfscopy(node.left,copy);
        //dfs for right child
        dfscopy(node.right,copy);
    }
    
    public void dfsconnect(Node node, Map<Node, NodeCopy> copy){
        if(node == null){
            return;
        }
        
        if(node.left != null){
            copy.get(node).left = copy.get(node.left);
        }
        
        if(node.right != null){
            copy.get(node).right = copy.get(node.right);
        }
        
        if(node.random != null){
            copy.get(node).random = copy.get(node.random);
        }
        
        dfsconnect(node.left,copy);
        dfsconnect(node.right,copy);
        
    }
}