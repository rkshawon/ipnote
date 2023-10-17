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

//https://leetcode.com/problems/rotting-oranges/
class Pair{
    int row;
    int col;
    int currTime;
    Pair(int row, int col, int currTime){
        this.row = row;
        this.col = col;
        this.currTime = currTime;
    }
}
class Solution {

    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int visited[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int counter = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }
                if(grid[i][j] == 1){
                    counter ++;
                }
            }
        }
        int tm = 0, ct = 0;
        int drow[] = {-1,0,+1,0};
        int dcol[] = { 0,1, 0,-1};

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int cTime = q.peek().currTime;
            tm = Math.max(tm, cTime);
            q.remove();
            for(int i = 0; i<4; i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1 ){
                    q.add(new Pair(nrow, ncol, cTime+1));
                    visited[nrow][ncol] = 2;
                    ct++;
                }
            }
        }
        if(ct != counter){
            return -1;
        }
        return tm;

    }
}