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
    
    class state{
    double sum;
    double nodecount;
    double average;
    
    state(double sum, double nodecount, double average){
        this.sum = sum;
        this.nodecount = nodecount;
        this.average = average;
    }
}
    public double maximumAverageSubtree(TreeNode root) {
       return  max(root).average;
    }
    
    public state max(TreeNode root){
        
        if(root == null){
            return new state(0.0,0.0,0.0);
        }
        
        state leftval = max(root.left);
        state rightval = max(root.right);
        

        
        double totalsum = leftval.sum + rightval.sum + root.val;
        double totalnodecount = leftval.nodecount + rightval.nodecount + 1;
        double totalaverage = Math.max((1.0 * (totalsum)) / totalnodecount, // average for current node
                Math.max(rightval.average, leftval.average) // max average from child nodes
        );
        
        return new state(totalsum,totalnodecount,totalaverage);
        
    }
}