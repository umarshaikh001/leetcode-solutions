

public class LC70_ClimbingStairs {

    static int climbStairs(int n) {

        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        int ans = climbStairs(n-1) + climbStairs(n-2);
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(climbStairs(6));
        

    }
    
}
