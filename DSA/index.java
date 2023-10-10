//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

class Solution {
    public void flatten(TreeNode root) {
        TreeNode node = root;
        while(node!=null){
            if(node.left != null){
                TreeNode temp = node.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = node.right;
                node.right = node.left;
                node.left = null;
            }
            node = node.right;
        }
    }
}
//https://leetcode.com/problems/validate-binary-search-tree/
public class Solution {
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
//https://www.youtube.com/watch?v=EiScA8DlzLA&list=RDvsN1aImsEAY&index=26
class Solution {
    public TreeNode findAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = findAncestor(root.left, p, q);
        TreeNode right = findAncestor(root.right, p, q);
        if(left !=null && right != null) return root;
        if(left !=null) return left;
        if(right !=null) return right;
        return null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findAncestor(root, p, q);
    }
}