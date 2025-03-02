import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for(int i = 1; i <= dp.length -1; i++){
            dp[i] = amount + 1;

            for (int c : coins){
                if (i - c >= 0){

                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);

                }


            }

        }

        if (dp[amount] != amount + 1){
            return dp[amount];
        }

        return -1;

        }



}
