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