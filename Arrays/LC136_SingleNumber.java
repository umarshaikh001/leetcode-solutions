public class LC136_SingleNumber {

    static int findUniqueElement(int nums[]) {
      

        int unique = 0;

        for(int i : nums) {
            unique ^= i;
        }
        return unique;
    }

    public static void main(String[] args) {
         int arr[] = {6,9,10,5,9,6,5};
        System.out.println(findUniqueElement(arr));
        
    }
    
}
