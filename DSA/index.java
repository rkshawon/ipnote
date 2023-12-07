https://leetcode.com/problems/sliding-window-maximum/submissions/1084498226/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len-k+1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i<len; i++){
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
            if(i+1>=k){
                result[i+1-k] = dq.peek();

                if(!dq.isEmpty() && dq.peek() == nums[i+1-k]){
                    dq.pollFirst();
                }
            }
        }
        return result;
    }
}

https://leetcode.com/problems/combinations/
import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combineHelper(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private void combineHelper(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            combineHelper(n, k - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
