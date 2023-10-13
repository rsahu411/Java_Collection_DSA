package DSA.Recursion;

import java.lang.reflect.Array;
import java.util.*;

public class Problems {


    // Print numbers from 1 to n
    public void printIncOrder(int n){

        if(n<=0)
            return;

        printIncOrder(n-1);
        System.out.print(n+" ");
    }


    // Print numbers from n to 1;
    public void printDscOrder(int n){

        if(n<=0)
            return;

        System.out.print(n+" ");
        printDscOrder(n-1);
    }

    // Print sum of first n natural numbers
    public void sumNaturalNumber(int n, int sum){

        if(n==0) {
            System.out.print(sum);
            return;
        }
        sum=sum+n;
        sumNaturalNumber(n-1,sum);
    }

    // Print factorial of number n
    public int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }


    //Print the fibonacci sequence till nth term
    public void fibonacciSequence(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }

        int c = a+b;
        System.out.print(c+" ");
        fibonacciSequence(b,c,n-1);
    }


    // nth term in fibonacci series
    public int nthTermFibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return nthTermFibonacci(n-1)+nthTermFibonacci(n-2);
    }


    // Print x^n (Stack height=n)
    public int calPower(int x, int n)
    {
        if(x==0)
            return 0;
        if(n==0)
            return 1;

        return x*calPower(x,n-1);
    }


    // Print x^n (Stack height=log(n))
    public int calPowerEfficient(int x, int n)
    {
        if(x==0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }

        int res = calPowerEfficient(x,n/2)*calPowerEfficient(x,n/2);
        // if n is odd
        if(n%2==1)
            return x*res;
        // if n is even
        return res;
    }


    // Linear Search of element in array
    public boolean isLinearSearch(int[] arr, int idx, int data)
    {
        if (idx == arr.length) {
            return false;
        }

        if (arr[idx] == data)
        {
            return true;
        }
        return isLinearSearch(arr,idx+1,data);
    }


    // Binary search of element in array
    public boolean isBinarySearch(int[] arr, int left, int right, int data)
    {
        if(left<=right)
        {
            int mid= left + (right-left)/2;
            if(arr[mid]==data)
                return true;
            else if (arr[mid]<data)
                return isBinarySearch(arr,mid+1,right,data);
            else
                return isBinarySearch(arr,left,mid-1,data);
        }

        return false;
    }


    // Find array is sorted or not
    public boolean isArraySorted(int[] arr, int idx)
    {
        if(idx==arr.length-1)
            return true;

        boolean res = isArraySorted(arr,idx+1);
        return res && arr[idx] <= arr[idx + 1];
    }


    // Reverse a string
    public String reverse(String str)
    {
        if(str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }


    // Check is Palindrome or not
    public boolean isPalindrome(String str, int i, int j)
    {
        if(i>j)
            return true;

        if(str.charAt(i)==str.charAt(j))
        {
            return isPalindrome(str,i+1,j-1);
        }
        else
        {
            return false;
        }

    }


    // Bubble sort
    public void bubbleSort(int[] arr, int n)
    {
        if(n==1 || n==0)
            return;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }


    // Merge sort
    public void merge(int[] arr, int left, int mid, int right)
    {
        int n1=mid+1-left;
        int n2=right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

//        for(int i=0;i<n1;i++)
//        {
//            L[i] = arr[left+i];
//        }

        //  sort form above loop
        System.arraycopy(arr, left, L, 0, n1);

//        for(int j=0;j<n2;j++)
//        {
//            R[j] = arr[j+mid+1];
//        }
        System.arraycopy(arr,mid+1,R,0,n2);

        int i=0,j=0,k=left;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            }
            else
            {
                arr[k++]=R[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
    }

    public void mergeSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }



    // Inversion count in array using merge sort
    public int mergeCount(int[] arr, int left, int mid, int right)
    {
        int n1=mid+1-left;
        int n2=right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr,mid+1,R,0,n2);

        int i=0,j=0,k=left, inversion=0;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            }
            else
            {
                arr[k++]=R[j++];
                inversion += (mid+1)-(left+i);
            }
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
        return inversion;
    }

    public int mergeSortCount(int[] arr, int left, int right)
    {
        int count=0;
        if(left<right)
        {
            int mid = left + (right-left)/2;
            count+= mergeSortCount(arr,left,mid);
            count+= mergeSortCount(arr,mid+1,right);
            count+= mergeCount(arr,left,mid,right);
        }

        return count;
    }



    // Quick sort
    public int partition(int[] arr, int lb, int ub)
    {
        int pivot=arr[lb], start=lb, end=ub,temp=0;

        while(start<end)
        {
            while(arr[start]<=pivot && start<ub)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        temp = arr[lb];// pivot
        arr[lb]=arr[end];
        arr[end]=temp;

        return end;  // correct position of pivot- in left side all elements smaller than pivot
                     // and right side all elements greater than pivot
    }

    public void quickSort(int[] arr, int lb, int ub)
    {
        if(lb<ub)
        {
            int loc = partition(arr, lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }



    // Subsets problem -> i/p - {1,2,3}, o/p - {},{1},{2},{3}.{1,2},{1,3},{2,3},{1,2,3}
    // Logic - include/ exclude
    public void subSets(List<Integer> arr, List<Integer> output, int idx, List<List<Integer>> ans)
    {
        if(idx>=arr.size())
        {
            ans.add(new ArrayList<>(output));
            return;
        }

        // exclude current element - arr.get(idx)
         

        // include current element = arr.get(idx)
        int element = arr.get(idx);
        output.add(element);
        subSets(arr,output,idx+1,ans);
        output.remove(output.size()-1);
    }


    // Subsequence of string -> i/p  "abc", o/p -> {" ", "a", "b", "c", "ab", "ac", "bc", abc"}
    public void subsequence(String str, int idx, String output, ArrayList<String> ans)
    {
        if(idx>=str.length())
        {
            ans.add(output);
            return;
        }

        subsequence(str,idx+1,output,ans);

        char ch = str.charAt(idx);
        output+=ch;
        subsequence(str, idx+1, output, ans);
    }


    // Phone keypad number to string
    public void phoneKeypad(String digits, int idx, String output, ArrayList<String> ans, String[] keypadMapping)
    {
        if(idx>=digits.length())
        {
            ans.add(output);
            return;
        }

        int num = (int)digits.charAt(idx)-'0';
        String mappingValue = keypadMapping[num];

        for(int i=0;i<mappingValue.length();i++)
        {
            output+=mappingValue.charAt(i);
            phoneKeypad(digits,idx+1,output,ans,keypadMapping);
            output=output.substring(0,output.length()-1);
        }
    }



    // Permutation of int array -> i/p-> {1,2,3}, o/p-> {{1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}};
    public void permutation(ArrayList<Integer> num, int idx, ArrayList<ArrayList<Integer>> ans)
    {
        if(idx>=num.size())
        {
            ans.add(new ArrayList<>(num));
            return;
        }

        for(int i=idx;i<num.size();i++)
        {
            int temp = num.get(idx);
            num.set(idx,num.get(i));
            num.set(i,temp);

            permutation(num,idx+1,ans);

            // backtracking
            temp = num.get(idx);
            num.set(idx,num.get(i));
            num.set(i,temp);
        }

    }


    // Theorem to find prime number from 1 to n - O(n*log(log n))
    public void  sieveOfEratosthenes(int n)
    {
        boolean[] arr = new boolean[n+1];
        arr[0]=false;
        arr[1]=false;

        for(int i=2;i<=n;i++)
        {
            arr[i]=true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++)
        {
            if(arr[i])
            {
                System.out.print(i+" ");
            }
        }
    }


    // Brute force algorithm
    public int gcd(int a, int b)
    {
        if(Math.min(a,b)==0)
            return Math.max(a,b);

        int ans=0;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                ans=Math.max(ans,i);
            }
        }

        return ans;
    }


    // Euclid algorithm - gcd recursion
    public int gcdRecursion(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
