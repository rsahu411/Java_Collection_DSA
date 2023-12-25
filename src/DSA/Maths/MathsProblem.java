package DSA.Maths;

import java.util.ArrayList;

public class MathsProblem {



    // Is prime number
    public boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;

        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }


    // Sieve of eratosthenes - prime number less than n - O(n*log(log n))
    public void eratosthenesPrimeNumber(int n)
    {
        boolean[] primeArr = new boolean[n+1];

        primeArr[0]=false;
        primeArr[1]=false;

        // assign true from 2 to n-1
        for(int i=2;i<n;i++)
        {
            primeArr[i]=true;
        }

        for(int i=2;i<n;i++)
        {
            if(primeArr[i])
            {
                System.out.print(i+" ");
                for(int j=2*i;j<n;j=j+i)
                {
                    primeArr[j]=false;
                }
            }
        }
    }



    // Hw- Segmented sieve for prime number



    // All divisor of a number - O(n) - sqrt(n)
    public void divisor(int num)
    {
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                if(num/i==i)
                    System.out.print(i+" ");
                else
                    System.out.print(i+" "+num/i+" ");
            }
        }
    }



    // Gcd of two number
    public int gcd(int a, int b)
    {
        // base case
        if(b==0)
        {
            return a;
        }

        return gcd(b,a%b);
    }


    // Method 2
    public int gcd2(int a, int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;

        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }




    // Decimal to binary
    public String decToBinary(long n)
    {
        StringBuilder str= new StringBuilder();
        for(int i=31;i>=0;i--)
        {
            long k=n>>i;
            //System.out.println("k is "+k);
            if((k&1)==1)
                str.append('1');
            else
                str.append('0');
        }
        return str.toString();
    }

}
