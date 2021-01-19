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
    public int maxDepth(Node root) {
        
        int maxheight = 0;
        
        if(root == null){
            return 0;
        }else{
            for(Node c: root.children){
             int heightofchild = maxDepth(c);
             maxheight = Math.max(heightofchild,maxheight);
            }
        }
        
        return (maxheight + 1);
    }
}
