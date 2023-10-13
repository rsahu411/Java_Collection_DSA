package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Problems problems = new
                Problems();
//        problems.printIncOrder(5);
//        problems.printDscOrder(5);
//        problems.sumNaturalNumber(5,0);

//        int calFactorial = problems.factorial(6);
//        System.out.println(calFactorial);

//        int a=0,b=1;
//        System.out.print(a+" "+b+" ");
//        int n=7;
//        problems.fibonacciSequence(a,b,n-2);

//        int nthTerm= problems.nthTermFibonacci(6);
//        System.out.println(nthTerm);
//
//        int x=2,n=5;
//        int res=problems.calPower(x,n);
//        System.out.println(res);
//
//        int res1=problems.calPowerEfficient(x,n);
//        System.out.println(res1);


        int[] arr = {2,4,6,8,10,12};
        int data = 13;
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        boolean res = problems.isLinearSearch(arr,0,data);
        boolean res = problems.isBinarySearch(arr,0, arr.length-1,data);
        if(res)
            System.out.println("Element is found");
        else
            System.out.println("Element is not found");


//        int[] arr = {1,2,3,4,5,6,4,8};
//        boolean res = problems.isArraySorted(arr,0);
//        System.out.println(res);


//        String str = "Geeks For Geeks";
//        String reverse = problems.reverse(str);
//        System.out.println(reverse);


//        String str= "abbccbba";
//        boolean res = problems.isPalindrome(str,0,str.length()-1);
//        if(res)
//            System.out.println("It is palindrome");
//        else
//            System.out.println("It is not Palindrome");

//        int[] arr = {4,1,16,98,3,0};
//        problems.bubbleSort(arr,arr.length);
//        for(int e:arr)
//        {
//            System.out.print(e+" ");
//        }


//        int[] arr = {38,27,43,9,82,10,1,25,99,54,93};
//        problems.mergeSort(arr,0,arr.length-1);
//        for(int e:arr)
//        {
//            System.out.print(e+" ");
//        }


//        int[] arr = { 1, 20, 6, 4, 5 };
//        int count=problems.mergeSortCount(arr,0,arr.length-1);
//        System.out.println(count);



//        int[] arr = {38,27,43,9,82,10,1,25,99,54,93};
//        problems.quickSort(arr,0,arr.length-1);
//        for(int e:arr)
//        {
//            System.out.print(e+" ");
//        }


//        List<Integer> arr =  new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        List<Integer> output = new ArrayList<>();
//        List<List<Integer>> ans = new ArrayList<>();
//        problems.subSets(arr,output,0,ans);
//
//
//        for(List<Integer> list: ans )
//        {
//            System.out.print("[");
//            for(Integer item: list)
//            {
//                System.out.print(item+" ");
//            }
//            System.out.print("]");
//            System.out.println();
//        }


//
//        String str="abc";
//        String output="";
//        ArrayList<String> ans = new ArrayList<>();
//        problems.subsequence(str,0,output,ans);
//        for(String item: ans)
//        {
//            System.out.print(item+" ");
//        }



//        String digits ="793";
//        String output="";
//        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        ArrayList<String> ans = new ArrayList<>();
//        problems.phoneKeypad(digits,0,output,ans,mapping);
//        for(String item:ans)
//        {
//            System.out.print(item+" ");
//        }



//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        problems.permutation(arr,0,ans);
//        for(ArrayList<Integer> list: ans)
//        {
//            for(Integer item: list)
//            {
//                System.out.print(item+" ");
//            }
//            System.out.println();
//        }


        problems.sieveOfEratosthenes(100);
//        int ans = problems.gcd(100,25);
        int ans = problems.gcdRecursion(100,80);
        System.out.println(ans);
    }
}
