//Implementing Dijkstra Algorithm
class Pair {
    int node;
    int distance;

    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

class Solution {

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        int[] visited = new int[V];
        Arrays.fill(visited, Integer.MAX_VALUE); 
        visited[S] = 0; 

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        pq.add(new Pair(S, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int dis = current.distance;

            for (ArrayList<Integer> neighbor : adj.get(node)) {
                int adjNode = neighbor.get(0);
                int weight = neighbor.get(1);

                if (dis + weight < visited[adjNode]) {
                    visited[adjNode] = dis + weight;
                    pq.add(new Pair(adjNode, visited[adjNode]));
                }
            }
        }

        return visited;
    }
}
