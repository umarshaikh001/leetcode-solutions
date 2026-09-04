public class GFG_SubsequencesWithSumK {

    static  boolean solve(int[] nums, int k, int sum, int index) {

        if(index >= nums.length) {

            // agar aapka base case hit ho gaya hai.
            // matlab aap ka sum ready hai 
            // sum ready hai check kar lo target ke satha os hissab se true false return kar do.

            if(sum == k) {
                return  true;
            }
            else {
                return  false;
            }
        }

        // index ki value nikalo sum ke andaer add kar ne ki liye.
        int indexValue = nums[index];

        // Recusion Call karo InClude ko call karo ExClude call karo.
        boolean include = solve(nums, k, sum + indexValue, index+1);
        boolean exclude = solve(nums, k, sum, index+1);

        // agar include ya exclude 2 main se 1 bhi side se true aaye toh true return kar do.
        boolean finalAns = include || exclude;
        return  finalAns;
    }

    static  boolean subSequencesSum(int[] nums,int k) {

        int index = 0;
        int sum = 0;

        boolean ans = solve(nums,k,sum,index);
        return  ans;
    }

    public static void main(String[] args) {

        int[] nums =  {1, 2, 3};
        System.out.println(subSequencesSum(nums, 3));
        
    }
    
}
