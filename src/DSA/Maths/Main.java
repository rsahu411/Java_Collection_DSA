package DSA.Maths;


public class Main {

    public static void main(String[] args) {


        MathsProblem mathsProblem = new MathsProblem();

        // Is prime number
//        int n=39;
//        boolean ans = mathsProblem.isPrime(n);
//        System.out.println(n+ " prime number: "+ans);


        // Sieve of eratosthenes - prime number less than n
//        int num=100;
//        System.out.println("Prime number 1 to "+num);
//        mathsProblem.eratosthenesPrimeNumber(num);



        // All divisor of a number
//        int number = 12;
//        System.out.println("Divisor of "+number +" is ");
//        mathsProblem.divisor(number);



        // GCD of two number
        int a=60;
        int b=90;
        int ans= mathsProblem.gcd(a,b);
        System.out.println("GCD of "+a+" and "+b+" is ");
        System.out.println(ans);


        // Method 2 of gcd
        int ans1= mathsProblem.gcd2(a,b);
        System.out.println("GCD of "+a+" and "+b+" is ");
        System.out.println(ans1);


        // Decimal to binary conversion
        long n = 16;
        String str= mathsProblem.decToBinary(n);
        System.out.println("Binary representation is "+str);

//        int res = Integer.parseInt(str,2);
//        System.out.println(res);

    }


}
