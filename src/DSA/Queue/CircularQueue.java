package DSA.Queue;

public class CircularQueue {
    int size;
    int front;
    int rear;
    int arr[];
    CircularQueue()
    {
        super();
    }
    CircularQueue(int n)
    {
        this.size=n;
        this.front=-1;
        this.rear=-1;
        this.arr = new int[n];
    }

    // 1. Push or Enqueue
    public void push(int data)
    {
        // 1. check queue is full or not
        if((front==0 && rear==size-1) || (front!=0 && rear==(front-1)%(size-1)))
        {
            System.out.println("Queue is already full");
        }
        // 2. if data is first element
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }
        // 3. if left side of queue is vacant and right size is full
        else if(front!=0 && rear==size-1)
        {
            rear=0;
        }
        // 4. normal condition
        else
        {
            rear++;
        }
        arr[rear]=data;
    }


    // 2. Pop or dequeue
    public int pop()
    {
        // 1. check queue is empty or not
        if(front==-1)
        {
            return -1;
        }
        int res = arr[front];
        // 2. if Queue has only 1 element
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        // 3. if front is at last element and left side of queue element exists
        else if(front==size-1)
        {
            front=0;
        }
        // normal condition
        else
        {
            front++;
        }

        return res;
    }

    // Print
    public void print()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
        }
//        System.out.println("Front is "+front);
//        System.out.println("Rear is "+rear);
        else {
            int temp=front;
            System.out.println("Circular Queue is ");
            while(temp!=-1 && temp<=rear) {
                System.out.print(arr[temp] + " ");
                temp++;
            }
            System.out.println();
        }
    }

}
