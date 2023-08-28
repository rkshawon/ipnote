class Solution {
    public int minCost(int n, int[] days, int[] costs, int index, int[] dp){
        if(index>=n){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int i;
        int pass1 = costs[0] + minCost(n, days, costs, index + 1, dp);
        for(i=index; i<n && days[i] < days[index] + 7; i++);
        int pass2 = costs[1] + minCost(n, days, costs, i, dp);
        for(i=index; i<n && days[i] < days[index] + 30; i++);
        int pass3 = costs[2] + minCost(n, days, costs, i, dp);

        dp[index] = Integer.min(pass1, Integer.min(pass2, pass3));
        return dp[index];
        
    }

    public int minCost(int n, int[] days, int[] costs){
        int[] dp = new int[days.length+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;
        for(int k=n-1; k>=0; k--){
            int pass1 = costs[0] + dp[k+1];
            int i;
            for(i=k; i<n && days[i] < days[k] + 7; i++);
            int pass2 = costs[1] + dp[i];
            for(i=k; i<n && days[i] < days[k] + 30; i++);
            int pass3 = costs[2] + dp[i];

            dp[k] = Integer.min(pass1, Integer.min(pass2, pass3));
        }
        return dp[0];
    }
    
    public int mincostTickets(int[] days, int[] costs) {

        return minCost(days.length, days, costs, 0, dp);
    }
}