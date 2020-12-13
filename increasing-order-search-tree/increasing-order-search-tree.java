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
    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList();
         dfs(root, vals);
        System.out.println(vals);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for(int v:vals){
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
         return ans.right;
    }
    
    public void dfs(TreeNode valnode, List<Integer> vals){
        if(valnode == null){
            return;
        }
        dfs(valnode.left,vals);
        vals.add(valnode.val);
        dfs(valnode.right,vals);
    }
}
