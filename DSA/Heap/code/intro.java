// create , delete, heapify
import java.util.*;

public class MyClass {
    public static void heapify(List<Integer> array, int i) {
        int smallest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int size = array.size();

        if (leftChild < size && array.get(leftChild) < array.get(smallest)) {
            smallest = leftChild;
        }

        if (rightChild < size && array.get(rightChild) < array.get(smallest)) {
            smallest = rightChild;
        }

        if (smallest != i) {
            // Swap the elements at indices i and smallest
            int temp = array.get(i);
            array.set(i, array.get(smallest));
            array.set(smallest, temp);

            heapify(array, smallest);
        }
    }

    public static void insert(List<Integer> array, int num) {
        int size = array.size();
        if (size == 0) {
            array.add(num);
        } else {
            array.add(num);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(array, i);
            }
        }
    }
    
    public static void delete(List<Integer> array, int num) {
        int size = array.size();
        int j = 0; 
        
        while(num != array.get(j)){
            j++;
        }
        
        int temp = array.get(j);
        array.set(j, array.get(size-1));
        array.set(size-1, temp);
        array.remove(size-1);
        
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, i);
        }
    }

    public static void main(String args[]) {
        List<Integer> array = new ArrayList<>();
        insert(array, 10);
        insert(array, 20);
        insert(array, 15);
        insert(array, 25);
        insert(array, 35);
        insert(array, 55);
        System.out.println(array);
        delete(array, 25);
        System.out.println("After Delete: "+array);
    }
}