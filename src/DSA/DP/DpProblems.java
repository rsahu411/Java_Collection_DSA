package DSA.DP;

public class DpProblems {

    // fibonacci series - Top-Down ->  recursion + memorization - TC-O(n), SC=O(n)
    public int fibonacciNumber(int n, int[] dp)
    {
        // step1 - array creation of n+1 length

        if(n<=1)
            return n;
        // step3
        if(dp[n]!=-1)
        {
            return dp[n];
        }

        // step2
        dp[n]= fibonacciNumber(n-1,dp) + fibonacciNumber(n-2,dp);
        return dp[n];
    }


    // fibonacci series - Bottom-up -> Tabular - TC-O(n), SC=O(n)
    public int fibonacciTabular(int n)
    {
        int[] dp = new int[n+1];

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }


    // fibonacci series - Space optimization - TC-O(n), SC=O(1)
    public int fibonacciSpaceOptimization(int n)
    {
        if(n==0)
            return 0;

        int prev1=1;
        int prev2=0;

        for(int i=2;i<=n;i++)
        {
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }


    // Minimum cost to climbing stairs
    // Top-down approach ->  TC-O(n), SC=O(n)
    public int minCost1(int[] cost, int n, int[] dp)
    {
        // base case
        if(n==0)
            return cost[0];
        if(n==1)
            return cost[1];

        // step-3
        if(dp[n]!=-1)
        {
            return dp[n];
        }

        dp[n] = cost[n] + (int)Math.min(minCost1(cost,n-1,dp),minCost1(cost,n-2,dp));

        return dp[n];
    }


    // Bottom-up - Tabular approach -> TC-O(n), SC=O(n)
    public int minCost2(int[] cost, int n)
    {
        // step-1
        int[] dp = new int[n+1];

        // step-2
        dp[0]=cost[0];
        dp[1]=cost[1];

        // step-3
        for(int i=2;i<n;i++)
        {
            dp[i] = cost[i] + (int)Math.min(dp[i-1],dp[i-2]);
        }
        return (int) Math.min(dp[n-1],dp[n-2]);
    }


    // Minimum cost - space optimization -> TC-O(n), SC=O(1)
    public int minCost3(int[] cost, int n)
    {
        int prev2=cost[0];
        int prev1=cost[1];

        // step-3
        for(int i=2;i<n;i++)
        {
            int curr = cost[i] + (int)Math.min(prev1,prev2);
            prev2=prev1;
            prev1=curr;
        }
        return (int) Math.min(prev1,prev2);
    }


}
