public class RightShiftArrayByOnePosition {
      static int[] rightShiftArrayByOnePosition(int nums[]) {

        int n=nums.length;
        int first = nums[n-1];

        for(int i=n-1;i>0;i--) {

             nums[i] =  nums[i-1];
            

        }

        nums[0] = first;

        return nums;
    }
    public static void main(String[] args) {
          int arr[] = {1,2,3,4,5};

        int ans[] = rightShiftArrayByOnePosition(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
