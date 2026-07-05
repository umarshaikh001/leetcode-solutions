public class FindSumOfPositiveAndNegativeValues {

    static void find_SumOf_PositiveAnd_NegativeValues(int nums[]) {
        int positive =0;
        int nagative = 0;

        for(int i : nums) {
            if (i > 0) {
                positive += i;
            }

            else {
                nagative += i;
            }
        }

        System.out.println( "Positive :" + positive);
        System.out.println("Nagative :" + nagative);

    }

    public static void main(String[] args) {

         int arr[] = {-1,-2,-3,5,4,56};
        find_SumOf_PositiveAnd_NegativeValues(arr);
        
    }
    
}
