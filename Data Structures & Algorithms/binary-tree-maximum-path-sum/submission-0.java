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
    int maxSum=0;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        solve(root);
        return maxSum;
        
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        int path1=l+r+root.val;
        int path2=root.val+Math.max(l,r);
        int path3=root.val;
        maxSum=Math.max(maxSum,Math.max(path1,Math.max(path2,path3)));
        return Math.max(path2,path3);

    }
}
