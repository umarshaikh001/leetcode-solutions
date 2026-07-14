public class EKO_SPOJ {

    static boolean isValidAns(int trees[], int m , int maxHeight) {

        int totalWoodColleaction = 0;

        for(int i =0;i<trees.length;i++) {

            if(trees[i] >= maxHeight) {
                int currentWoodCollection = trees[i] - maxHeight;
                totalWoodColleaction += currentWoodCollection;
            }
            
        }
        if(totalWoodColleaction >= m) {
                return true;
            }
            else {
                return false;
            }
    }

    static int Eko(int trees[] , int m) {

        int s = 0;
        int maxi = 0;

        for(int i : trees) {
            maxi = Math.max(i, maxi);
        }

        int e = maxi;
        int ans = -1;

        while (s <= e) {

            int mid  = s +(e-s)/2;

            if(isValidAns(trees,m,mid)) {

                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid -1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int trees[] = {20,15,10,17};
        System.out.println(Eko(trees, 7));
    }
    
}
