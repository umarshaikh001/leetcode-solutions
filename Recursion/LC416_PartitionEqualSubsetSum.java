public class LC416_PartitionEqualSubsetSum {

    static boolean solve(int[] nums, int target, int index) {

        // base case
        if(target == 0) {
            return true;
        }

        if(target < 0) {
            return false;
        }

        if(index >= nums.length) {
            return false;
        }


        boolean inClude = solve(nums, target - nums[index], index+1);
        boolean exClude = solve(nums, target, index+1);
        return inClude || exClude;
    }


    static boolean canPartition(int[] nums){

        int index = 0;
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

         if((sum & 1) == 1) {
            return false;
        }
        
        int target = sum / 2;

        boolean ans = solve(nums, target, index);
        return ans;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
    
}
