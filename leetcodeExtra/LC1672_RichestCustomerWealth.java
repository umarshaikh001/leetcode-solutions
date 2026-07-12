public class LC1672_RichestCustomerWealth {

     static int  maximumWealth(int matrix[][]) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int maxValue = Integer.MIN_VALUE;

         for(int row=0;row<n;row++) {
            
            int sum =0;
            for(int col=0;col<m;col++) {
             sum += matrix[row][col];
            }
            
            maxValue = Math.max(maxValue, sum);
        }
        
        return maxValue;
    }
    public static void main(String[] args) {
         int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(maximumWealth(nums) + " ");
        
    }
    
}
