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