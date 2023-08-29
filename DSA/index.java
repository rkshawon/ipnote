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

//1402
class Solution {
    // public int solve(int[] arr, int index, int time, int[][] dp){
    //     if(index >= arr.length){
    //         return 0;
    //     }
    //     if(dp[index][time] != 0){
    //         return dp[index][time];
    //     }
    //     int include = (arr[index]*(time+1)) + solve(arr, index+1, time+1, dp);
    //     int exclude = solve(arr, index+1, time, dp);
    //     dp[index][time] = Math.max(include, exclude);
    //     return dp[index][time];
    // }
    public int solve(int[] arr){
        int[][] dp = new int[arr.length+1][arr.length+1];
        for(int index = arr.length-1; index>=0; index--){
            for(int time=index; time>=0; time--){
                int include = (arr[index]*(time+1)) + dp[index+1][time+1];
                int exclude = dp[index+1][time];
                dp[index][time] = Math.max(include, exclude);
            }
        }
        return dp[0][0];
    }

    public int maxSatisfaction(int[] arr) {
        Arrays.sort(arr);
        return solve(arr);
    }
}