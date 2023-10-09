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