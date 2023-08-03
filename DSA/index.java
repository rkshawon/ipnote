//1672
class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i=0; i<accounts.length; i++){
            int amount = 0;
            for(int j=0; j<accounts[i].length; j++){
                amount+=accounts[i][j];
            }
            if(amount>res){
                res = amount;
            }
        }
        return res;
    }
}

//744

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1, len = letters.length;
        int mid = start + (end - start)/2;
        
        while(start<=end){
            if(letters[mid] > target){
                end = mid - 1 ; 
            }
            else{
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
         return letters[start%len];
    }
}