//410. Split Array Largest Sum
class Solution {
    public int splitArray(int[] nums, int k) {
        int start =0, end =0;
        for(int i = 0; i<nums.length; i++){
            start = Math.max(nums[i], start);
            end  += nums[i]; 
        }

        while(start<end){
            int piece=1, total = 0;
            int mid = start + (end - start )/2;
            
            for(int num: nums){
                if(total+ num>mid){
                    total = num;
                    piece++;
                }else{
                    total += num;  
                }
            }
            if(piece>k){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}