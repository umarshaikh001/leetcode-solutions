public class LC1981_MinimizeTheDifference {

    static int solve(int[][] mat, int target,int sum, int row) {

        // base case
        if(row >= mat.length) {

            // invalid row index
            // sum is ready
            //calculate the diff between target and sum
            //store and return min diff
            return Math.abs(sum - target);
        }

        // for store minimum Value
        int mini = Integer.MAX_VALUE;

        // main row index par ho , isme multiple col
        // par value hai , and main har ek column ko one by one consider 
        // karunga and bar bar answer ka minimum nikal ta rahga 

        for(int num : mat[row]) {

            int ans = solve(mat, target, sum+num, row+1);
             mini = Math.min(ans, mini);
        }

        return mini;
    }

    static int minimizeTheDifference(int[][] mat, int target) {

        // for  calculate sum
        int sum = 0;

        // for row index
        int row = 0;

        int ans = solve(mat,target,sum,row);
        return ans;
       
    }

    public static void main(String[] args) {
        
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minimizeTheDifference(mat, 9));
    }
    
}
