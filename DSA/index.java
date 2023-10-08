
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/
class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Node leftMost = root;
        while(leftMost.left != null){
            Node curr = leftMost;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}

//https://leetcode.com/problems/binary-tree-right-side-view/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i<len; i++){
                TreeNode node = queue.poll();
                if(i==len-1){
                    result.add(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return result;
    }
}
//https://leetcode.com/problems/cousins-in-binary-tree/
class Solution {
    public TreeNode findNode(TreeNode root, int num){
        if(root == null || root.val == num) {
            return  root;
        }
        TreeNode n = findNode(root.left, num);
        if(n!=null){
            return n;
        }
        return findNode(root.right, num);
    }
    public boolean isShibling(TreeNode node, TreeNode x, TreeNode y){
        if(node == null) return false;
        return (node.left == y && node.right == x )|| (node.left == x && node.right == y )
        || isShibling(node.left, x, y) || isShibling(node.right, x, y);
    }
    public int level(TreeNode node, TreeNode num, int lvl){
        if(node == null) return 0;
        if(node == num){
            return lvl;
        }
        int l = level(node.left, num, lvl+1);
        if(l!=0){
            return l;
        }
        return level(node.right, num, lvl+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        return (level(root, xx, 0) == level(root, yy, 0) && !isShibling(root, xx, yy))? true :false;
    }
}