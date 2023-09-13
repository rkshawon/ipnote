// /73. Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row = false, col = false;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i==0) row =true;
                    if(j==0) col =true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(row){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i] = 0; 
            } 
        }
        if(col){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0; 
            } 
        }

    }
}
//128. Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }

        int result = 0, i= 0, temp = 0, j=1;

        while(i<nums.length){
            if(!set.contains(nums[i] - 1)){
                if(set.contains(nums[i]+j)){
                    temp++;
                    j++;
                }else{
                    i++;
                    j=1;
                    if(temp>=result){
                        result=temp +1 ;
                    }
                    temp=0;
                }
            }else{
                i++;
            }

        }
        return result;
    }
}