public class LC74_SearchA2DMatrix {

    static boolean searchMatrix(int[][] nums, int target) {

        int row = nums.length;
        int col = nums[0].length;

        int n = row * col;

        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s +(e-s)/2;

            int rowIndex = mid / col;
            int colIndex = mid % col;

            if(nums[rowIndex][colIndex] == target) {

            }
            else if(nums[rowIndex][colIndex] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[][] nums = {{1,2,5},{7,8,9},{12,15,20}};
        System.out.println(searchMatrix(nums, 1));
}
}
