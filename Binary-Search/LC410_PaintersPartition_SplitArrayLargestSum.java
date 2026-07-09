public class LC410_PaintersPartition_SplitArrayLargestSum {

     static boolean isValidAns(int boards[] , int k, int maxLength) {

        int paintersCount = 1;
        int paintedLength =0;

        for(int i=0;i<boards.length;i++) {

            if(paintedLength + boards[i] <= maxLength) {
                paintedLength +=  boards[i];
            }
            else {
              paintersCount++;

              if(paintersCount > k || boards[i] > maxLength) {
                return false;
              }
              else {
                paintedLength =0;
                paintedLength +=  boards[i];
              }
            }
        }

        return true;

    }

     static int minTime(int [] boards,int k) {

        int n = boards.length;
        int s =0;
        int sum=0;
        int ans = -1;

        for(int i=0;i<n;i++) {
            sum += boards[i];
        }
        int e = sum;

        while (s <= e) {
            int mid = s +(e-s)/2;

            if(isValidAns(boards,k,mid)) {
                ans = mid;
                e = mid -1;
            }
            else {
                s = mid +1;
            }
            
        }
        return ans;

    }   
    public static void main(String[] args) {
        
          int   nums[] = {1,5,9,15,20};
      System.out.println(minTime(nums, 2));
    }
    
}
