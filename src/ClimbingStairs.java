public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        if (n >= 2){
            dp[2] = 2;
        }

    if (n >= 3){
        for (int i = 3; i < dp.length; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
    }



        return dp[n];
    }

}
