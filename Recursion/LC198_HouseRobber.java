public class LC198_HouseRobber {

    static int solve(int[] nums, int index) {

        // importan note
        // This code show Exep in run time becuse Time Complexity
        // This code is for undstanding recusion
        // (Error - TLE)

        // base case
        if(index >= nums.length) {
            return 0;
        }

        // 1 case hum solve karenge baki recusion sambhal lega
        // include ki call karo and exclude ko call karo jo bhi max aaaye.
        // osey ans var main store karo or return karo
        int include = nums[index] + solve(nums, index+2);
        int exclude = 0 + solve(nums, index+1);
        int ans = Math.max(include, exclude);
        return ans;
    }

    static int rob(int[] nums) {

        int index = 0;
        int ans = solve(nums, index);

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,4,9};
        System.out.println(rob(nums));
        
    }
    
}
