public class LC518_Coin_Change_II {

    static int solve(int amount, int[] coins, int index) {

        // important Note .
        // This code Show me The error of TLE.
        // This code for undstanding for How Recusion Work.

        // base case
        if(amount == 0) {
            return 1;
        }

        // If Amount -1 so This is Not Valid 
        if(amount < 0) {
            return 0;
        }

        // If all coints are used but amount stil pending so This is Base case
        if(index >= coins.length) {
            return 0;
        }

        // Recursion
        // 1 case hum solve karenge baki Recursion sambhal lega.
        // Include and ExClude call.

        // agar main 
        int inCludeAns = solve(amount - coins[index], coins, index);
        int exCludeAns = solve(amount, coins, index+1);
        int finalAns = inCludeAns + exCludeAns;
        return finalAns;

    }


    static int change(int amount, int[] coins){

        int index = 0;
        int ans = solve(amount,coins,index);
        return ans;
    }   

    public static void main(String[] args) {

        int coins[] = {1,2,5};
        System.out.println(change(5, coins));
        
    }
    
}
