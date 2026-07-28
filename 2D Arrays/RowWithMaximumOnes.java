public class RowWithMaximumOnes {

    static int getFirestOcuIndex(int[][] matrix, int rowIndex) {

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int occurrenceIndex = -1;

        if(matrix[rowIndex][totalCol-1] == 0) {
            return totalCol;
        }
        else {

            int s = 0;
            int e = totalCol - 1;

            while (s <= e) {
                int mid = s + (e-s)/2;

                if(matrix[rowIndex][mid] == 0) {
                    s = mid + 1;
                }
                else {
                    occurrenceIndex = mid;
                    e = mid - 1;
                }
                
            }

        }
        return occurrenceIndex;
    }

    static int firstOneIndex(int[][] matrix) {

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int maxOnes = -1;
        int maxRowIndex = -1;

        for(int row=0;row<totalRow;row++) {

            int firstOcuranceValue = getFirestOcuIndex(matrix, row);
            int oneCount = totalCol - firstOcuranceValue ;

            if(oneCount != 0 && oneCount > maxOnes) {
                maxOnes = oneCount;
                maxRowIndex = row;
            }
        }
        return maxRowIndex;
    }

    public static void main(String[] args) {

          int [][] mat = {{0,0,0,1},{0,0,1,1},{0,0,0,1},{0,1,1,1}};
        System.out.println(firstOneIndex(mat));
        
    }
    
}
