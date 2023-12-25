package DSA.Searching;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i]= scanner.nextInt();
//        int data = scanner.nextInt();

        Searching searching = new Searching();
//        searching.linearSearch(arr,n,data);
       // int pos = searching.binarySearch(arr,0,n-1,data);
//        int pos = searching.binarySearchRecursive(arr,0,n-1,data);
//        System.out.println(pos+1);



        // First and last occurrences of a number
//        int[] arr = {1, 3, 4, 4, 4, 5, 5, 5, 5};
//        int n=9;
//        System.out.println("Array is ");
//        for(Integer x:arr)
//        {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        int res[] = searching.firstAndLastOccurrences(arr,n,5);
//        System.out.println("First occurrence is "+res[0]);
//        System.out.println("Last occurrence is "+res[1]);




        // Find pivot in rotated sorted array
//        int[] arr = {7,8,9,1,2,3};
//        System.out.println("Array is ");
//        for(Integer item : arr)
//        {
//            System.out.print(item+" ");
//        }
//        System.out.println();
//        int pivot = searching.getPivot(arr,6);
//        System.out.println("Pivot element is "+arr[pivot]);




        // Search in rotated sorted array
//        int key = 2;
//        int ele = searching.searchRotatedArray(arr,6,key);
//        System.out.println("index of key in rotated sorted array "+ele);




        // Square root of a number
//        long num = 111111;
//        long root = searching.getSqrtInteger(num);
//        System.out.println("Approximate of square root of "+num+" is "+root);
//        int precision =3;
//        double ans = searching.getSqrtFraction(num,precision,root);
//        System.out.println("Square root of "+num+ " is "+ans);




        // Books distribution among n students
//        int pages[] = {10,20,30,40};
//        int n = 4;
//        int student = 2;
//        int result = searching.allocateBooks(pages,n,student);
//        System.out.println("Minimum of maximum number pages allotted to a student "+ result);



        // Peak index in mountain array
        int arr[] = {3,4,5,1};
        int n = 4;
        int peak = searching.peakIndex(arr,n);
        System.out.println("Peak index is "+peak);
        System.out.println("Element at peak index "+arr[peak]);
    }
}
