public class FindMaximumValueInArray {

     static int findMaximumValueInArray(int nums[]) {

       
        int max =0;

        for(int i : nums) {
            if(i > max || i < max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {

         int arr[] = {1,2,3,4,8};

        System.out.println(findMaximumValueInArray(arr));
        
    }
    
}
