package DSA.Sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i]= scanner.nextInt();

        Sort sort = new Sort();
//        sort.bubbleSort(arr);
//        sort.insertionSort(arr);
//        sort.selectionSort(arr);
//        sort.mergeSort(arr,0,n-1);
//        sort.rotateArr(arr,7,5);
//        sort.countingSort(arr,n);
//        sort.radixSort(arr,n);
//        sort.quickSort(arr,0,n-1);
//        sort.print(arr);



        // Questions

        // Merge two sorted array into one array using extra space
//        int n=8;
//        int[] arr1 = {1,3,5,6,7,9,11,13};
//        int m=4;
//        int[] arr2 = {2,4,6,8};
//        int[] ans = new int[n+m];
//        ans = sort.MergeTwoSortedArrays(arr1,arr2,n,m);
//        System.out.println("Merge of two sorted array in one sorted array ");
//        for(int i:ans)
//        {
//            System.out.print(i+" ");
//        }



        // Check if array is sorted and rotated
        int n=6;
        int[] arr = {7,8,1,2,3,4};
        boolean ans = sort.sortedAndRotated(arr,n);
        System.out.println("Array is sorted and rotated "+ans);
    }
}
