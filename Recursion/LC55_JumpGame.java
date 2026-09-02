public class LC55_JumpGame {

    static boolean solve(int[] nums, int index) {

        // base case
        if(index == nums.length-1) {
            return true;
        }

        if(index >= nums.length) {
            return false;
        }

        if(nums[index] == 0) {
            return false;
        }


        // Recursion Call 
        
        //steps of jums nums[2] so jump max 2 if 1 and 2

        //we start always 0 index element if zero index value is [3] so jump index of 1,2,3
        int jumpValue = nums[index];

        // If value is false so return false if not so they return recAns Value
        boolean overAllAns = false;

        // using for loop we jump at jumpValue
        for(int jump=1;jump<=jumpValue;jump++) {

        // why [index + jump] index = 0 jum=1 so call recusion of if jump=2 index=2 value.
        boolean recAns = solve(nums, index + jump);

            // // This show error in LeetCode RunTime in (TLE)
            // return recAns || overAllAns;

            // improve if recAns is true so they return true in this loop if not so loop end.
            if(recAns) {
                return true;
            }
        }

        return overAllAns;

    }

    static boolean canJump(int[] nums) {

        int index = 0;
        boolean ans = solve(nums,index);
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
        
    }
    
}
