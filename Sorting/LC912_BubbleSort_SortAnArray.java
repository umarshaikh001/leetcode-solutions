

public class LC912_BubbleSort_SortAnArray {

    static int[] bubbleSort(int nums[]) {

        int n = nums.length;

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {

                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {

        int nums[] = {4,5,6,1,2};
        int ans[] = bubbleSort(nums);
        
        for(int i : ans) {
        System.out.print(i + " ");
     }
        
    }
    
}
