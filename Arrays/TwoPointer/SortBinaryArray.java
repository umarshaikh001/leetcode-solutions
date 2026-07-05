package TwoPointer;

public class SortBinaryArray {

     static int[] sortBinaryArray(int nums[]) {

        int n = nums.length;
        int start = 0;
        int end = n -1;

        while (start <= end) {

            if(nums[start] == 1 && nums[end] == 0) {
                nums[start] =0;
                nums[end] = 1;
            }

            if(nums[start] == 0) {
                
                start++;
            }

            if(nums[end] == 1) {
                
                end--;

            }
            
        }
        return nums;
    }
    
    public static void main(String[] args) {
        
    }
    
}
