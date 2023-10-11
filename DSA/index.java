//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
public class Codec {
    public void strings(TreeNode root, List<String> list){
        if(root == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        strings(root.left, list);
        strings(root.right, list);
    }
    
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        strings(root, list);
        return list.toString();
    }
    public TreeNode builder(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }

        int lastIndex = list.size() - 1;
        String value = list.get(lastIndex);
        list.remove(lastIndex);

        if (value.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = builder(list);
        node.right = builder(list);

        return node;
    }


    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1); 
        String[] elements = data.split(", ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(elements));
        Collections.reverse(list);
    
        return builder(list);
    }
}
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