public class LC198_HouseRobber {

    static int solve(int[] arr, int index) {

        // importan note
        // This code show Exep in run time becuse Time Complexity
        // This code is for undstanding recusion
        // (Error - TLE)

        // base case
        if(index >= arr.length) {
            return 0;
        }

        // 1 case hum solve karenge baki recusion sambhal lega
        // include ki call karo and exclude ko call karo jo bhi max aaaye.
        // osey ans var main store karo or return karo
        int include = arr[index] + solve(arr, index+2);
        int exclude = 0 + solve(arr, index+1);
        int ans = Math.max(include, exclude);
        return ans;
    }

    static int rob(int[] arr) {

        int index = 0;
        int ans = solve(arr, index);

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,4,9};
        System.out.println(rob(nums));
        
    }
    
}
