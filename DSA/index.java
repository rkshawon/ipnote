class Solution {
    // public int triangle(int[] values, int i, int j, int[][] dp){
    //     if(i+1==j){
    //         return 0;
    //     }
    //     if(dp[i][j] != 0){
    //         return dp[i][j];
    //     }
    //     int ans = Integer.MAX_VALUE;
    //     for(int k=i+1; k<j;k++){
    //         int mul = values[i] * values[j] * values[k] ;
    //         ans = Math.min(ans, mul + triangle(values, i, k, dp) + triangle(values, k, j, dp));
    //     }
    //     dp[i][j] = ans;
    //     return dp[i][j];
    // }

    public int triangle(int[] values){
        int n = values.length;
        int[][] dp = new int[n][n];

        for(int i = n-1; i>=0; i--){
            for(int j = i+2; j<n ; j++){

                int ans = Integer.MAX_VALUE;

                for(int k=i+1; k<j;k++){

                    int mul = values[i] * values[j] * values[k] ;
                    ans = Math.min(ans, mul + dp[i][k] + dp[k][j]);

                }
                dp[i][j] = ans;
            }
        }
        return dp[0][n-1];
    }

    public int minScoreTriangulation(int[] values) {
        return triangle(values);
    }
}