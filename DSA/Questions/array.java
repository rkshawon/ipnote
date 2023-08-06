// Amazon- Positon of a number of inifinite array.[not allowed to use array.length]
//array index out of bound is not measures as it is infinite array.
public class MyClass {
    public static void main(String args[]) {
        int[] array = {2,4,6,7,8,9,12,15,19,22,25,28,29,30,34,35,38,39,40,42,45,49};
        int target = 34, start = 0, end = 1;
        while(target>array[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        System.out.println(binarySearch(array,start, end, target));
    }
    static int binarySearch (int[] array, int start, int end, int target){
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target < array[mid]){
                end = mid - 1;
            }else if(target>array[mid]){
                start = mid + 1;
            }else{
                res = mid;
                start++;end--;
            }
        }
        return res;
    }
}

// Number of time array rotated using binary search

public class MyClass {
    public static void main(String args[]) {
        int[] array = {4,5,6,0,1,2,3};
        int pivot = findPivot(array);
        System.out.println(pivot + 1);
    }
    static int findPivot (int[] array,){
        int start = 0, end = array.length-1;
        int res = -1;
       while(start <= end){
        int mid = start + (end - start) / 2;
        if(array[mid] > array[mid + 1]){
            return res = mid;
        }
        if(array[mid] < array[mid - 1]){
            return res = mid - 1;
        }
        if(array[mid] < array[end]){
            end = mid - 1;
        }
        if(array[mid] > array[start]){
            start = mid + 1;
        }
       }
        return res;
    }
}