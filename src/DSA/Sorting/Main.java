package DSA.Sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= scanner.nextInt();

        Sort sort = new Sort();
//        sort.bubbleSort(arr);
//        sort.insertionSort(arr);
//        sort.selectionSort(arr);
//        sort.mergeSort(arr,0,n-1);
//        sort.rotateArr(arr,7,5);
//        sort.countingSort(arr,n);
//        sort.radixSort(arr,n);
        sort.quickSort(arr,0,n-1);
        sort.print(arr);
    }
}
