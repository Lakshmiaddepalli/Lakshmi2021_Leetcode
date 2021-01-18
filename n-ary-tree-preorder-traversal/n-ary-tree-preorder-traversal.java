/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
​
class Solution {
    public List<Integer> preorder(Node root) {
        // Instantiated the list
      List<Integer> result = new LinkedList<>();
        
      //if root == null then return result
        if(root == null){
          return result;
        }
    
    //helper function
        helper(root, result);
    
        return result;
    }
​
​
public void helper(Node root, List<Integer> result){
    result.add(root.val); 
     if(root.children!=null){
      for(Node c: root.children){
         helper(c,result);
     }
     
    }
}
}
