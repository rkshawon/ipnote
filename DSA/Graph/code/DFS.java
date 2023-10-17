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