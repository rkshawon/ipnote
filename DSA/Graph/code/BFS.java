//bfs search 
//adj given already
link: https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bfs_of_graph
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v+1];
        ArrayList<Integer> res = new ArrayList<>();
        
        visited[0] = true;
        q.add(0);
        
        while(!q.isEmpty()){
            int val = q.poll();
            res.add(val);
            for(Integer it: adj.get(val)){
                if(!visited[it]){
                    q.add(it);
                    visited[it] = true;
                }
            }
        }
        return res;
    }
}
//detect Cycle in undirected graph using BFS
// in line 52 means if visited why are u not my parent only my parent is allow visited in my list.
//ther is a Pair class in java but not working right now for me.
class Pair{
    int first;
    int second;
    Pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}
class Solution {
    public boolean checkCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        visited[src] = true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int adjNode: adj.get(node)){
                if(!visited[adjNode]){
                    q.add(new Pair(adjNode, node));
                    visited[adjNode] = true;
                    
                }else if(parent != adjNode){
                    return true;
                }
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v+1];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(checkCycle(i, adj, visited)) return true;
            }
        }
        return false;
    }
}

//detect Cycle in undirected graph using DFS
class Solution {
    public boolean checkCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[node] = true;
        for(int adjNode: adj.get(node)){
            if(!visited[adjNode]){
                if(checkCycle(adjNode, node, adj, visited)){
                    return true;
                }
            }else if(parent != adjNode){
                return true;
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v+1];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(checkCycle(i, -1, adj, visited)) return true;
            }
        }
        return false;
    }
}





//Bipartite Graph
class Solution
{
    public boolean bfs(int val, ArrayList<ArrayList<Integer>>adj, int[] color){
        color[val] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(val);
        while(!q.isEmpty()){
            int num = q.poll();
            for(int n:adj.get(num)){
                if(color[n] == 0){
                    if(color[num] == 1)
                        color[n] = -1;
                    else
                        color[n] = 1;
                    q.add(n);
                }
                if(color[n] == color[num]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[V];
        
        for(int i = 0; i<V; i++){
            if(color[i] == 0){
                if(!bfs(i, adj, color)){
                    return false; 
                }
            }
        }
        return true;
    }
}