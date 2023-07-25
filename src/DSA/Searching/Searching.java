package DSA.Searching;

public class Searching {


    // 1. Linear Search
    public void linearSearch(int[] arr, int n,int data)
    {
        int flag=0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==data)
            {
                System.out.println("Element found at position: "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Element not found");
    }


    // 2. Binary Search
    public int binarySearch(int[] arr, int left, int right, int data)
    {
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]==data)
                return mid;
            else if (arr[mid]<data)
                left=mid+1;
            else
                right=mid-1;
        }
        return 0;
    }


    public int binarySearchRecursive(int[] arr, int left, int right, int data)
    {
        if(left<=right)
        {
            int mid = left + (right-left)/2;
            if(arr[mid]==data)
                return mid;
            else if(arr[mid]<data)
                return binarySearchRecursive(arr,mid+1,right,data);
            else
                return binarySearchRecursive(arr,left,mid-1,data);
        }
        return 0;
    }
}
