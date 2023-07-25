package DSA.Sorting;

public class Sort {

    // Print array
    public void print(int[] arr)
    {
        for(int item : arr)
            System.out.print(item+" ");
    }


    public int max(int[] arr, int n)
    {
        int max=arr[0];
        for(int i=1; i<n;i++)
            if(max<arr[i])
                max=arr[i];
        return max;
    }


    // 1. Bubble DSA.Searching.Sorting.Sort
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
            }
            if(flag==0)
                break;
        }
    }


    // 2. Insertion DSA.Searching.Sorting.Sort
    public void insertionSort(int[] arr)
    {
        int n= arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }


    // 3. Selection DSA.Searching.Sorting.Sort
    public void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i =0;i<n-1;i++)
        {
            int min =i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            if(min!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }




    // 4. Quick DSA.Searching.Sorting.Sort
    public int partition(int[] arr, int lb, int ub)
    {
        int pivot=arr[lb],start=lb,end=ub;
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
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    public void quickSort(int[] arr, int lb, int ub)
    {
        if(lb<ub)
        {
            int loc = partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }




    // 5. Merge DSA.Searching.Sorting.Sort
    public void mergeSort(int[] arr,int left, int right)
    {
        if(left<right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[left+i];
        for(int j=0;j<n2;j++)
            R[j]=arr[mid+1+j];

        int i=0,j=0,k=left;
        while (i<n1 && j<n2)
        {
            if (L[i]<R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while (i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }

    }



    // 6. Radix DSA.Searching.Sorting.Sort
    public void radixSort(int[] arr, int n)
    {
        int max = max(arr,n);
        for(int pass=1;(max/pass)>0;pass=pass*10)
            radixCount(arr,n,pass);
    }

    // Radix Count
    public void radixCount(int[] arr, int n, int pass)
    {
        int[] count = new int[10];
        int[] brr = new int[n];

        for(int i=0;i<n;i++)
            ++count[(arr[i]/pass)%10];

        for(int i=1;i<10;i++)
            count[i]=count[i]+count[i-1];

        for(int i=n-1;i>=0;i--)
            brr[--count[(arr[i]/pass)%10]]=arr[i];

        for(int i=0;i<n;i++)
            arr[i] = brr[i];
    }


    // 7. Counting DSA.Searching.Sorting.Sort-      T.C- O(n)
    public void countingSort(int[] arr, int n)
    {
        int k = max(arr,n);
        int[] count = new int[k+1];
        int[] brr = new int[n];

        for(int i=0;i<n;i++)        // place the no. of repeating value in count
            ++count[arr[i]];

        for(int i=1;i<=k;i++)     // maintain the count value acc. to index of arr
            count[i]=count[i]+count[i-1];

        for(int i=n-1;i>=0;i--)
            brr[--count[arr[i]]]=arr[i];


        for(int i=0;i<n;i++)
            arr[i]=brr[i];

    }

 }
