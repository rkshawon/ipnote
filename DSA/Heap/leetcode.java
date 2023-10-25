//https://leetcode.com/problems/find-k-closest-elements/
//658
import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int diffA = Math.abs(a - x);
                int diffB = Math.abs(b - x);
                if (diffA == diffB) {
                    return b - a; 
                }
                return diffB - diffA; 
            }
        );

        for (int num : arr) {
            pq.offer(num);
            System.out.println(pq);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> res = new ArrayList<>(pq);
        Collections.sort(res);

        return res;
    }
}
