public class LC268_MissingNumber {

     static int findMissingElement(int nums[]){

        int n = nums.length;
        int missing = 0;
        


        for(int i : nums) {
            missing ^= i;

        }

        for(int i=1;i<=n;i++) {
            missing ^= i;
        }
        return missing;
    }

    public static void main(String[] args) {

         int arr[] = {0,1,2,3,5};

        System.out.println(findMissingElement(arr));
        
    }
    
}
