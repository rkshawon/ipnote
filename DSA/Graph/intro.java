//adjacent matrix
class HelloWorld {
    public static void main(String[] args) {
        int n = 4, m= 4;
        int[][] adj = new int[n+1][m+1];
         //edge 1--2
         adj[1][2] = 1;  // just this make directed
         adj[2][1] = 1;  //adding this makes directed
         
         //edge 2--3
         adj[2][3] = 1;
         adj[3][2] = 1;
         
         //edge 3--4
         adj[4][3] = 1;
         adj[3][4] = 1;

         //if auto
         adj[u][v] = 1;
         adj[v][u] = 1;
    }
}

//adjacent list
//other same as above 
// for weigth edges add {} or [] instead of number in ArrayList
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int n = 4, m= 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


        for(int i=0;i<=n;i++)
            adj.add(new ArrayList<Integer>());

            adj.get(0).add(1);
            adj.get(1).add(0);

            adj.get(1).add(2);
            adj.get(2).add(1);  

            adj.get(2).add(3);
            adj.get(3).add(2);  

            adj.get(3).add(4);
            adj.get(4).add(3);
            
            adj.get(4).add(1);
            adj.get(1).add(4);
        
        for(int i=0;i<=n;i++){
            System.out.println(i+": "+ adj.get(i));
        }
    }
}