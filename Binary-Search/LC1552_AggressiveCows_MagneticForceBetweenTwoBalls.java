public class LC1552_AggressiveCows_MagneticForceBetweenTwoBalls {

    static boolean isValidAns(int position[],int k, int maxLength) {

        int cows =1;
        int lastPosition =0;

        for(int i=0;i<position.length;i++) {

            if(position[i] -position[lastPosition] >= maxLength) {
                cows++;
                lastPosition =i;

                if(cows == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static int findAns(int position[],int k) {

        int n = position.length;
        int s =0;
        int e = position[n-1] - position[0];
        int ans =-1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if(isValidAns(position,k,mid)) {
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
        int nums[]={1,2,4,8,9};
        System.out.println(findAns(nums, 3));
    }
    
}
