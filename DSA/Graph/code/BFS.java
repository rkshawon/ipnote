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