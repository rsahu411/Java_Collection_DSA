package DSA.DP;

public class Main {

    public static void main(String[] args) {

        DpProblems problems = new DpProblems();
        int n=7;
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }

        // Fibonacci number

//        int res = problems.fibonacciNumber(n,dp);
//        System.out.println(res);

//        int res = problems.fibonacciTabular(n);
//        System.out.println(res);

//        int res = problems.fibonacciSpaceOptimization(n);
//        System.out.println(res);


        // Minimum cost to climbing stairs
        int[] cost = {1,2,3,4,5,6,7};
//        int ans = (int)Math.min(problems.minCost1(cost,n-1,dp), problems.minCost1(cost,n-2,dp));
//        System.out.println("Minimum cost is "+ ans);

//        int ans = problems.minCost2(cost,n);
//        System.out.println("Minimum cost is "+ans);

        int ans = problems.minCost3(cost,n);
        System.out.println("Minimum cost is "+ans);
    }
}
