public class LC2187_RotiPrata_MinimumTimeToCompleteTrips {

    static boolean isValidAns(int[] rank , int n , int minTime) {

        int totalPrath = 0;
        
        for(int i=0;i<rank.length;i++) {
             int time = 0;
            int j = 1;

            while(true) {
           

             time = time + (rank[i]*j);

             if(time > minTime) {
                break;
             }
             totalPrath++;
             j++;

             if(totalPrath == n) {
                return true;
             }

            }
        }
            return false;
     }


     static int minimumTimeToCook(int rank[] , int n) {

        int s = 1;
        int minRank = Integer.MAX_VALUE;

        for(int r : rank) {
            minRank = Math.min(r, minRank);
        }

        int e = minRank*(n*(n+1)/2);
        int ans = -1;

        while (s <= e) {

            int mid = s + (e-s)/2;

            if(isValidAns(rank , n , mid)) {

                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] rank = {1,2,3};
        System.out.println(minimumTimeToCook(rank, 6));

        
    }
    
    
}
