package DSA.Queue;

import javax.swing.*;
import java.util.*;
import java.util.Deque;

public class QueueArr {
    int size;
    int front;
    int rear;
    int[] arr;

    QueueArr()
    {
        super();
    }
    QueueArr(int size)
    {
        this.size=size;
        this.front=0;
        this.rear=0;
        this.arr = new int[size];
    }

    // 1. Push
    public void push(int data)
    {
        if(front==0 && rear==size)
        {
            System.out.println("Queue is full");
        }
        else
        {
            arr[rear]=data;
            rear++;
        }
    }

    // 2. Pop
    public int pop()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            int res = arr[front];
            front++;
            return res;
        }
    }

    // 3. Check whether queue is empty or not
    public boolean isEmpty()
    {
        if(front==rear)
            return true;

        return false;
    }

    // 4. Front element
    public int front()
    {
        if(front==rear)
        {
            return -1;
        }
        return arr[front];
    }


    // 5. print
    public void print() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            int temp = front;
            System.out.println("Queue is ");
            while (temp != rear) {
                System.out.print(arr[temp] + " ");
                temp++;
            }
            System.out.println();
        }
    }



    // Queue using stack ->
    Stack<Integer> s1 = new Stack<>(); // for push()
    Stack<Integer> s2 = new Stack<>(); // for pop()

    // push -> TC-O(1)
    public void enQueue(int data)
    {
        s1.push(data);
    }

    // Pop -> TC-O(n)
    public int deQueue()
    {
        if(s1.empty())
            return -1;

        while(!s1.isEmpty())
        {
            int top = s1.peek();
            s1.pop();
            s2.push(top);
        }

        int res = s2.peek();
        s2.pop();

        while(!s2.empty())
        {
            int top = s2.peek();
            s2.pop();
            s1.push(top);
        }

        return res;
    }


    Stack<Integer> newS1 = new Stack<>();
    Stack<Integer> newS2 = new Stack<>();

    // push -> TC-O(n)
    public void enQueue1(int data)
    {
        while(!newS1.empty())
        {
            int top = newS1.peek();;
            newS1.pop();
            newS2.push(top);
        }

        newS2.push(data);

        while(!newS2.empty())
        {
            int top = newS2.peek();
            newS2.pop();
            newS1.push(top);
        }
    }

    // pop -> TC-O(1)
    public int deQueue1()
    {
        if(newS1.empty())
        {
            return -1;
        }
        int res = newS1.peek();
        newS1.pop();
        return res;
    }



    // Queue Reversal
    public void queueReversal(Queue<Integer> queue)
    {
        // create a stack and copy queue in it
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
        {
            int top = queue.peek();
            queue.remove();
            stack.push(top);
        }

        while(!stack.empty())
        {
            int top= stack.peek();
            stack.pop();
            queue.add(top);
        }
    }



    // Reverse first k elements from queue
    public void reverseFirstKElements(Queue<Integer> queue, int k)
    {
        // pop first k elements from queue and placed in a stack
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++)
        {
            int top = queue.peek();
            queue.remove();
            stack.push(top);
        }

        // fetch elements from stack put in queue
        while(!stack.isEmpty())
        {
            int top= stack.peek();
            stack.pop();
            queue.add(top);
        }

        // fetch first (n-k) elements from queue and put it back of queue
        int t= queue.size()-k;
        while(t!=0)
        {
            int top= queue.peek();
            queue.remove();
            queue.add(top);
            t--;
        }
    }


    // First negative element in k size window
    public ArrayList<Integer> printFirstNegativeInteger(int[] arr, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // process on 1 k size window
        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
                deque.add(i);
        }

        // store 1 negative element from k size window
        if(!deque.isEmpty())
            ans.add(arr[deque.peek()]);
        else
            ans.add(0);

        // process on remaining part of array
        for(int i=k;i<arr.length;i++)
        {
            // remove previous element (that is out from k size window) from deque
            if(!deque.isEmpty() && i-deque.peek()>=k)
                deque.remove();

            if(arr[i]<0)
                deque.add(i);

                if(!deque.isEmpty())
                ans.add(arr[deque.peek()] );
            else
                ans.add(0);
        }
        return ans;
    }


    // First non-repeating character in a stream
    public String firstNonRepeating(String str)
    {
        Map<Character,Integer> count = new HashMap<>();
        char c='a';
        for(int i=1;i<=26;i++)
        {
            count.put(c,0);
            c++;
        }
        Queue<Character> queue = new LinkedList<>();
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            // increase count of character
            int val = count.get(ch)+1;
           // val=val+1;
            count.put(ch,val);

            // push into the queue
            queue.add(ch);

            while(!queue.isEmpty())
            {
                if(count.get(queue.peek())>1)
                {
                    // repeating character
                    queue.remove();
                }
                else
                {
                    // Non-repeating character
                    ans.append(queue.peek());
                    break;
                }
                if(queue.isEmpty())
                {
                    ans.append('#');
                }
            }
        }
        return ans.toString();
    }



    // Circular tour
    /* Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
       1. The amount of petrol that every petrol pump has.
       2. Distance from that petrol pump to the next petrol pump.
       Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
     */

    public int tour(int[] petrol, int[] distance)
    {
        int deficit=0;
        int balance=0;
        int start=0;

        for(int i=0;i<petrol.length;i++)
        {
            balance+=petrol[i]-distance[i];
            if(balance<0)
            {
                deficit+=balance;
                start=i+1;
                balance=0;
            }
        }
        if(deficit+balance>=0)
            return start;

        return -1;
    }


    // Interleave the first half of the queue with second half
    public void interLeaveQueue(Queue<Integer> queue)
    {
        Queue<Integer> q1 = new LinkedList<>();

        int i=1, n = queue.size();
        while(i <= n/2)
        {
            int top = queue.remove();
            q1.add(top);
            i++;
        }
        while(!q1.isEmpty())
        {
            int top1 = q1.remove();
            queue.add(top1);
            int top2 = queue.remove();
            queue.add(top2);
        }
    }
}
