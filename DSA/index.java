//https://leetcode.com/problems/number-of-provinces/
class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[node] = true;

        for(int it : adj.get(node)){
            if(!visited[it]){
                dfs(it, adj, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;

        for(int i = 0;i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i!=j) {
                    adj.get(i+1).add(j+1);
                }
            }
        }
        
        int res = 0;
        boolean[] visited = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            if(!visited[i]){
                res++;
                dfs(i, adj, visited);
            }
            
        }
        return res;
    }
}