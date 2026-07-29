public class UnboundedBinarySearch {

    static int unboundedSearch(int[] nums, int target) {

        int i = 1;

        if(nums[0] ==  target) {
            return 0;
        }

        while (nums[i] < target) {
            i = i * 2;
        }

        if(nums[i] > target) {

            int s = i / 2;
            int e = i;

            while (s <= e) {

                int mid = s + (e-s)/2;

                if(nums[mid] == target) {
                    return mid;
                }
                else if(nums[mid] < target) {
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
                
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // this is not infi.. array but is only for undastanding
        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        System.out.println(unboundedSearch(num, 11));
        
    }
    
}
