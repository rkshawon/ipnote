//https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
class Solution {
    public void getInorder(TreeNode node, List<Integer> list) {
        if(node == null){
            return ;
        };
        getInorder(node.left, list);
        list.add(node.val);
        getInorder(node.right, list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         if(root==null){
             return list;
         }
         getInorder(root, list);
         return list;
    }
}
//https://leetcode.com/problems/binary-tree-preorder-traversal/
class Solution {
    public void getOrderList(TreeNode node, List<Integer> list) {
        if(node == null){
            return ;
        };
        list.add(node.val);
        getOrderList(node.left, list);
        getOrderList(node.right, list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root==null){
             return list;
         }
         getOrderList(root, list);
         return list;
    }
}
//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
class Solution {
    public void getOrderList(TreeNode node, List<Integer> list) {
        if(node == null){
            return ;
        };
        getOrderList(node.left, list);
        getOrderList(node.right, list);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root==null){
             return list;
         }
         getOrderList(root, list);
         return list;
    }
}