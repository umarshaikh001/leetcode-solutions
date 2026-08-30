public class LC322_CoinChange {

    static int solve(int[] coins, int amount) {

        // important note 
        // This code throw error of (TLE)
        // This code  is undstanding for ( All Possible combinaction pattern)

        // base case 
        // if amount value are zero so return zero
        if(amount == 0) {
            return 0;
        }

        // if amount value is (-) so return max value
        if(amount < 0) {
            return Integer.MAX_VALUE;
        }

        // This mini value store minimum coins

        int mini = Integer.MAX_VALUE;

        // all coins are used.
        // why becuse of we are check all posoible combinaction
        for(int coin : coins) {
            // we store recusion answer to this  .
            int recursionAns = solve(coins, amount - coin);

            // check if value is max so skip that part if amount < 0 
            // so they return - value so we handle this
            if(recursionAns == Integer.MAX_VALUE) {
                continue;
            }
            // else retun coin count 
            else {
                int cointCount = recursionAns + 1;
              mini = Math.min(cointCount, mini);
            }


        }

        return mini;
    }


    static int coinChange(int[] coins, int amount) {

        int ans = solve(coins,amount);
        // if value are - and not valid os wew return -1 
        if(ans == Integer.MAX_VALUE) {
            return -1;
        }
        else {
        return ans;
        }
    }

    public static void main(String[] args) {

      int[] coins = {10,20};
      System.out.println(coinChange(coins, 50));
        

    }
    
}
