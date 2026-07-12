import java.util.ArrayList;
import java.util.List;
public class WavePrint {

    static List<Integer> wavePrint(int matrix[][]) {
        List<Integer> output = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int col=0;col<m;col++) {

            if((col & 1 ) ==1) {
                for(int row=0;row<n;row++) {
                   output.add(matrix[row][col]);
                }
            }
            else {
                for(int row=n-1;row>=0;row--) {
                    output.add(matrix[row][col]);

                }
            }
           
           
        }
        return output;
        
    }

   
    public static void main(String[] args) {
          int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(wavePrint(nums) + " ");
        
    }
}
    

