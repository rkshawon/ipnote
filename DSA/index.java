//https://leetcode.com/problems/path-sum/
class Solution {
    public boolean target(TreeNode root, int sum) {
        if(root == null ) return false;
        if(root.val == sum && root.left == null && root.right == null) {
            return true;
        }
        return  target(root.left, sum-root.val) || target(root.right, sum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return target(root, targetSum);
    }
}