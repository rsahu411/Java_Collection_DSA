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
        return -1;
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





    // First and last occurrences of a number
    public int firstOccurrences(int[] arr, int n, int key)
    {
        int start=0;
        int end=n-1;
        int ans=-1;

        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }


    public int lastOccurrences(int[] arr, int n, int key)
    {
        int start=0;
        int end=n-1;
        int ans=-1;

        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }

    public int[] firstAndLastOccurrences(int[] arr, int n, int key)
    {
        int[] ans = new int[2];
        ans[0]= firstOccurrences(arr,n,key);
        ans[1]= lastOccurrences(arr,n,key);

        return ans;
    }





    // Find a pivot element in rotated sorted array - {7,8,9,1,2,3}
    public int getPivot(int[] arr, int n)
    {
        int start=0;
        int end=n-1;

        while(start<end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] >= arr[0])
            {
                start = mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }


    // Search in rotated sorted array
    // 1. get pivot - index through which arr is rotated
    // 2. pivot divided array in two parts
    // 3. apply condition and find in which parts element is present

    public int searchRotatedArray(int[] arr, int n, int key)
    {
        int pivot = getPivot(arr,n);

        if(key >= arr[pivot] && key <= arr[n-1])
        {
            return binarySearch(arr,pivot,n-1,key);
        }
        else
        {
            return binarySearch(arr,0,pivot-1,key);
        }
    }





    // Square root of a number - O(log n)

    public long getSqrtInteger(Long n)
    {
        long start=0;
        long end=n;
        long ans=-1;

        while(start<=end)
        {
            long mid = start + (end - start)/2;
            long square = mid*mid;
            if(square==n)
            {
                return mid;
            }
            else if(square < n)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }



    public double getSqrtFraction(Long n, int precision, long integerPart)
    {
        double factor=1;
        double ans=integerPart;

        for(int i=0;i<precision;i++)
        {
            factor=factor/10;
             double j =ans;
             while(j*j<n)
             {
                 ans=j;
                 j=j+factor;
             }
        }
        return ans;
    }





    // Books distribution among n students
    // condition - 1. Every student has at least one book.
    //             2. Every book is allotted to students
    //             3. Books are allotted in continuous manner
    // find maximum number pages allotted to a student is minimum
    public int allocateBooks(int[] pages, int n, int student)
    {
        int start=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=pages[i];
        }
        int end=sum;                  // create a search space
        int ans=-1;

        while(start<=end)
        {
            int mid= start + (end - start)/2;

            if(isPossible(pages,n,student,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] pages, int n, int student, int mid)
    {
        int studentCount=1;
        int pagesSum=0;

        for(int i=0;i<n;i++)
        {
            if(pagesSum + pages[i] <= mid)
            {
                pagesSum+=pages[i];
            }
            else
            {
                studentCount++;
                if(studentCount > student || pages[i]>mid)
                {
                    return false;
                }
                pagesSum=pages[i];
            }
        }
        return true;
    }




    // Peak index in mountain array - {3,4,5,1,2}
    public int peakIndex(int[] arr, int n)
    {
        int start=0;
        int end=n-1;

        while(start<end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return start;
    }

}
