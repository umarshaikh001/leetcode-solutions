import java.util.Arrays;
import java.util.List;

public class LC120_Triangle {

    static  int solve(List<List<Integer>> triangle,int rowIndex , int colIndex) {

         // important note This code is give error (TLE)
        // becuse this code time cos..
        // We Are improve Time Complexcity to learn (DP)
        // This code undrstanding for (Recursion)


        // base case
        if(rowIndex == triangle.size()-1){
            // if you reach last index 
            // so return them 
            return  triangle.get(rowIndex).get(colIndex);
        }

        int downAns = solve(triangle, rowIndex+1, colIndex) ;
        int daigonalAns = solve(triangle, rowIndex+1, colIndex+1);

        int ans = triangle.get(rowIndex).get(colIndex) + Math.min(downAns, daigonalAns);
        return  ans;
    }


    static int minimumTotal(List<List<Integer>> triangle){

        int rowIndex = 0;
        int colIndex = 0;

        int ans = solve(triangle,rowIndex,colIndex);
        return  ans;
    }

    public static void main(String[] args) {

        //int[][] triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
        // This List Method not applicable to this method (List<List<Integer>> becuse triangle is int[][])
        // This leetcode solution but i am solve using int[][] triangle to return 
         List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(minimumTotal(triangle));
        
    }
    
}
