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

//build heap from array// Time Complexity: O(n)
public class MinHeapBuilder {
    public static void buildMinHeap(int[] array) {
        int lastNonLeaf = (array.length / 2) - 1;

       
        for (int i = lastNonLeaf; i >= 0; i--) {
            heapify(array, i);
        }
    }

    public static void heapify(int[] array, int i) {
        int size = array.length;
        int smallest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < size && array[leftChild] < array[smallest]) {
            smallest = leftChild;
        }

        if (rightChild < size && array[rightChild] < array[smallest]) {
            smallest = rightChild;
        }

        if (smallest != i) {
        
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;

            heapify(array, smallest);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};
        buildMinHeap(array);

        System.out.println("Min-Heap: " + Arrays.toString(array));
    }
}
//Heap sort //TcO(n)
public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build a max heap from the input array
        buildMaxHeap(array);

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element in the unsorted portion of the array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call maxHeapify on the reduced heap
            maxHeapify(array, 0, i);
        }
    }

    public static void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(array, i, n);
        }
    }

    public static void maxHeapify(int[] array, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            maxHeapify(array, largest, n);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        heapSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
