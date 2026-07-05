

public class Average_of_Array {

    static int AvarageOFArray(int nums[]) {
        int n = nums.length;
        int sum = 0;

        for(int i : nums) {
            sum += i;
        }

        int ans =  sum / n;
        return ans;
    }
    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5};
        System.out.println(AvarageOFArray(nums));
        
    }
    

    
}
