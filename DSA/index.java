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