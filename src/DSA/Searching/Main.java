package DSA.Searching;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= scanner.nextInt();
        int data = scanner.nextInt();

        Searching searching = new Searching();
        searching.linearSearch(arr,n,data);
       // int pos = searching.binarySearch(arr,0,n-1,data);
        int pos = searching.binarySearchRecursive(arr,0,n-1,data);
        System.out.println(pos+1);

    }
}
