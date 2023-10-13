package DSA.DP;

public class DpProblems {

    // fibonacci series - Top-Down ->  recursion + memorization - TC-O(n), SC=O(n)
    public int fibonacciNumber(int n, int[] arr)
    {
        // step1 - array creation of n+1 length

        if(n<=1)
            return n;
        // step3
        if(arr[n]!=0)
        {
            return arr[n];
        }

        // step2
        arr[n]= fibonacciNumber(n-1,arr) + fibonacciNumber(n-2,arr);
        return arr[n];
    }


    // fibonacci series - Bottom-up -> Tabular - TC-O(n), SC=O(n)
    public int fibonacciTabular(int n)
    {
        int[] arr = new int[n+1];

        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n];
    }


}
