public class BinarySearchUsingRecursion {

    static int binarySearch(int[] arr, int target, int s, int e){

        // base case
        if(s > e) {
            return -1;
        }

        // processing part

        // calculate mid
        int mid = s + (e-s)/2;

        // check mid is equal to target if not so moving left right according < > 
        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return binarySearch(arr, target, s, mid - 1);
        }
        else {
            return binarySearch(arr, target, mid + 1, e);
        }

        // // 2 method to  check mid value and move right left.
        // // this is more line of code.

        // if(arr[mid] == target) {
        //     return mid;
        // }

        // if(arr[mid] > target) {
        //     e = mid - 1;
        // }
        // else {
        //     s = mid + 1;
        // }

        // return binarySearch(arr, target, s, e);
    }

    public static void main(String[] args) {
        
        int[] arr = {10,20,22,28,30,33,36,39,40,44,48};
        System.out.println(binarySearch(arr, 0, 0, arr.length-1));
    }
    
}
