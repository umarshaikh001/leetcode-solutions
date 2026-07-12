public class SelectionSort_SortAnArray {

    static int[] selectionSort(int nums[]) {

        int n = nums.length;

        for(int i=0;i<n-1;i++) {
            int minValue = i;
            for(int j=i+1;j<n;j++) {

                if(nums[j] <nums[minValue]) {
                    int temp = nums[j];
                    nums[j] = nums[minValue];
                    nums[minValue] = temp;
                    
                }
            }
            
        }
        return nums;
    }
    public static void main(String[] args) {

         int nums[] = {4,5,6,1,2};
        int ans[] = selectionSort(nums);

      for(int i : ans) {
        System.out.print(i + " ");
      }
        
    }
    
}
