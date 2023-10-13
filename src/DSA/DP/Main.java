package DSA.DP;

public class Main {

    public static void main(String[] args) {

        DpProblems problems = new DpProblems();
        int n=15;
        int[] arr = new int[n+1];
//        int res = problems.fibonacciNumber(n,arr);
//        System.out.println(res);

        int res = problems.fibonacciTabular(n);
        System.out.println(res);
    }
}
