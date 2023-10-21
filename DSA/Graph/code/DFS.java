//dfs search 
//adj given already
link: https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=dfs_of_graph

class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V+1];
        ArrayList<Integer> res = new ArrayList<>();
        visited[0] = true;
        dfs(0, visited, adj, res);
        return res;
    }
    public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res){
        visited[node] = true;
        res.add(node);
        for(Integer it: adj.get(node)){
            if(!visited[it]){
                dfs(it, visited, adj, res);
            }
        }
    }
}
//Detect cycle in a directed graph
class Solution {
    public boolean dfs(int v, int[] path, int[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[v] = 1;
        path[v] = 1;
        for(int i: adj.get(v)){
            if(visited[i] == 0){
               if(dfs(i, path, visited, adj)){
                   return true;
               }
           }else{
               if(path[i] == 1) return true;
           }
        }
        path[v] = 0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
       int[] visited = new int[v];
       int[] path = new int[v];
       for(int i = 0; i<v; i++){
           if(visited[i] == 0){
               if(dfs(i, path, visited, adj)){
                   return true;
               }
           }
       }
       return false;
    }
}
//Bipartite Graph
class Solution
{
    public boolean dfs(int num, int c, ArrayList<ArrayList<Integer>>adj, int[] color){
        color[num] = c;

        for(int n:adj.get(num)){
            if(color[n] == 0){
                if(!dfs(n, 1-c, adj, color)){
                    return false;
                }
            }
            if(color[n] == color[num]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[V];
        
        for(int i = 0; i<V; i++){
            if(color[i] == 0){
                if(!dfs(i, 0, adj, color)){
                    return false; 
                }
            }
        }
        return true;
    }
}