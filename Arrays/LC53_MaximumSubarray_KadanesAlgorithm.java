public class LC53_MaximumSubarray_KadanesAlgorithm {

     static int maxSubArray(int nums[]) {

        int n = nums.length;
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            sum += nums[i];

            maxValue = Math.max(maxValue, sum);
            if(sum <0) {
            sum =0;
        }
        }

        
        return maxValue;
    }
    public static void main(String[] args) {

          int nums[] = {-1,1,2,-3,4,4,-9};
        System.out.println(maxSubArray(nums));
        
    }
    
}
