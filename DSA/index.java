//41. First Missing Positive
class Solution {
    
    public int firstMissingPositive(int[] arr) {
        int i = 0, len = arr.length;
        while (i<len){
            int index = arr[i]-1;
            if(arr[i] > 0 && arr[i]<= len && arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
               i++; 
            }
        }
       
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }
}


1295. Find Numbers with Even Number of Digits

class Solution {
    int even(int num){
        int n=0;
        while(num>0){
            num = num/10;
            n++;
        }
        return n;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int num: nums ){
            if(even(num) % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
//2022. Convert 1D Array Into 2D Array

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) {
            return new int[0][0];
        }
        int[][] array = new int[m][n];
        int i=0;
            for(int j=0;j<m;j++){
                for( int k=0;k<n;k++){
                    array[j][k] = original[i];
                    i++;
                }
            }
        return array;
    }
}