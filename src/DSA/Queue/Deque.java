package DSA.Queue;

public class Deque {

    int size;
    int front;
    int rear;
    int[] arr ;
    // Initialize your data structure.
    public Deque(int n)
    {
        this.size=n;
        this.front=-1;
        this.rear=-1;
        this.arr= new int[n];
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int data)
    {
        // check deque is empty or not
        if((front==0 && rear==size-1) || (front!=0 && rear==(front-1)%(size-1)))
        {
            return false;
        }
        // if data is 1st element in deque
        if(front==-1)
        {
            front=0;
            rear=0;
        }
        // to maintain cyclic nature
        else if(front==0)
        {
            front=size-1;
        }
        // normal condition
        else
        {
            front--;
        }
        arr[front]=data;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x)
    {
        // check deque is empty or not
        if((front==0 && rear==size-1) || (front!=0 && rear==(front-1)%(size-1)))
        {
            return false;
        }
        // if data is 1st element in deque
        if(front==-1)
        {
            front=0;
            rear=0;
        }
        // to maintain cyclic nature
        else if(front!=0 && rear==size-1)
        {
            rear=0;
        }
        // normal condition
        else
        {
            rear++;
        }
        arr[rear]=x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront()
    {
        // if deque is empty
        if(front==-1)
        {
            return -1;
        }
        // if deque has only one element
        int res = arr[front];
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        // to maintain cyclic nature
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

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear()
    {
        // if deque is empty
        if(front==-1)
        {
            return -1;
        }
        int res = arr[rear];

        // if deque has only one element
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        // to maintain cyclic nature
        else if(rear==0)
        {
            rear=size-1;
        }
        // normal condition
        else
        {
            rear--;
        }

        return res;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront()
    {
        if(front==-1)
        {
            return -1;
        }
        return arr[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear()
    {
        if(front==-1)
        {
            return -1;
        }
        return arr[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty()
    {
        if(front==-1)
        {
            return true;
        }

        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull()
    {
        if((front==0 && rear==size-1) || (front!=0 && rear==(front-1)%(size-1)))
        {
            return true;
        }
        return false;
    }
}
