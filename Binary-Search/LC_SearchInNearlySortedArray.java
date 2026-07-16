public class LC_SearchInNearlySortedArray {

    static int searchNearlySorted(int[] nums , int target) {

        int n =  nums.length;
        int s = 0;
        int e = n-1;

        while (s <= e) {

            int mid = s + (e-s)/2;

            if(mid - 1 >= 0 && mid - 1 == target) {
                return mid - 1;
            }

             if(mid + 1 < n  && mid + 1 == target) {
                return mid + 1;
            }

             if( mid  == target) {
                return mid ;
            }

            if(nums[mid] > target) {
                 e = mid - 1;
            }
            else {
                s =  mid + 1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {3,5,10,9,11};
        System.out.println(searchNearlySorted(nums, 3));
    }
    
}
