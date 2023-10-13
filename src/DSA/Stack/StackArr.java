package DSA.Stack;

import java.util.*;

public class StackArr {

    public int top;
    public int size;
    public int[] arr = new int[size];

    StackArr(int size)
    {
        this.size=size;
        this.top=-1;
        this.arr = new int[size];
    }

    StackArr()
    {
        super();
    }

    // Push
    public void push(int data)
    {
        if(size-top > 1)
        {
            top++;
            arr[top]=data;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }

    // Print
    public void print()
    {
        int x=top;
        if(x>=0)
        {
            while(x!=-1)
            {
                System.out.print(arr[x]+" ");
                x--;
            }
            System.out.println();
        }
        else
        {
            System.out.println("Stack is empty");
        }

    }

    // Pop
    public void pop()
    {
        if(top>=0)
        {
            top--;
        }
        else
        {
            System.out.println("Stack Underflow");
        }
    }

    // Peek
    public int peek()
    {
        if(top>=0)
        {
            return arr[top];
        }
        else
        {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // isEmpty
    public boolean empty()
    {
        if(top==-1)
            return true;

        return false;
    }


    // Reverse of String
    public String reverse(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }

        String ans = "";
        while(!stack.empty())
        {
            char ch = stack.peek();
            ans+=ch;
            stack.pop();
        }

        return ans;
    }


    // Delete middle element from stack
    public void deleteMiddle(Stack<Integer> stack, int count, int size)
    {
        if(count==size/2)
        {
            stack.pop();
            return;
        }

        int ele = stack.peek();
        stack.pop();

        // Recursive call
        deleteMiddle(stack,count+1,size);

        // Add again element on backtracking
        stack.push(ele);
    }


    // Insert element at bottom
    public void insertAtBottom(Stack<Integer> stack, int element)
    {
        // base case
        if(stack.empty())
        {
            stack.push(element);
            return;
        }

        int num = stack.peek();
        stack.pop();

        // Recursive call
        insertAtBottom(stack,element);

        // Back Tracking
        stack.push(num);
    }


    // Reverse a stack using recursion
    public void reverseStack(Stack<Integer> stack)
    {
        // base case
        if(stack.empty())
        {
            return;
        }

        int num = stack.peek();
        stack.pop();
        reverseStack(stack);

        // insert element at bottom
        insertAtBottom(stack,num);
    }


    // Sort a Stack

    public void sortStack(Stack<Integer> stack)
    {
        // base case
        if(stack.empty())
            return;

        int num = stack.peek();
        stack.pop();

        // recursive call
        sortStack(stack);

        sortInsert(stack,num);
    }

    // Sort Insert Method
    public void sortInsert(Stack<Integer> stack, int num)
    {
        // base case
        if(stack.empty() || stack.peek() < num)
        {
            stack.push(num);
            return;
        }

        int data = stack.peek();
        stack.pop();

        // recursive call
        sortInsert(stack,num);

        stack.push(data);
    }


    // Minimum cost to make expression valid
    // Valid exp- {}, {{}}, {}{}, {{}{{}}}
    public int toMakeValidExp(String str)
    {
        // if length of string is odd then impossible to make valid
        if(str.length()%2==1)
        {
            return -1;
        }

        // Remove valid parenthesis and store remaining string in stack
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='{')
                stack.push(ch);

            else {

                // ch=='}'
                if(!stack.empty() && stack.peek()=='{')     // {}
                    stack.pop();                            // 3 condition - 1. {{{{{..... - length- a
                else                                        //               2. }}}}}}..... - length- b
                    stack.push(ch);                         //               3. ..}}}{{{...
            }
        }

        int a=0,b=0;
        while(!stack.empty())
        {
            if(stack.peek()=='{')
                a++;
            else
                b++;

            stack.pop();
        }

        return (a+1)/2 + (b+1)/2;
    }


    // Next Smaller element -> i/p- {2,1,4,3}, o/p- {1,-1,3,-1}
    public List<Integer> nextSmall(int[] arr, int n)
    {
        List<Integer> ans  = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            ans.add(-1);
        }
        stack.push(-1);

        for(int i=n-1;i>=0;i--)
        {
            int curr = arr[i];
            // to find smaller peek value than curr in stack
            while(stack.peek()>=curr)
            {
                stack.pop();
            }
            // ans is peek value of stack which is less than curr value
            ans.set(i,stack.peek());
            stack.push(curr);
        }
        return ans;
    }



    // Maximum area of histogram
    public int largestRectangle(ArrayList<Integer> heights)
    {
        int n= heights.size();
        int[] next = new int[n];
        next = nextSmallElement(heights,n);

        int[] prev = new int[n];
        prev = prevSmallElement(heights,n);

        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int l=heights.get(i);
            // all elements of arr are same
            if(next[i]==-1)
            {
                next[i]=n;
            }
            int b = next[i]-prev[i]-1;
            int area = l*b;
            maxArea= Math.max(area,maxArea);
        }

        return maxArea;
    }

    private int[] prevSmallElement(ArrayList<Integer> heights, int n) {

        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i=0;i<n;i++)
        {
            int curr = heights.get(i);
            while(stack.peek()!=-1 && heights.get(stack.peek())>=curr )
            {
                stack.pop();
            }
            ans[i]= stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] nextSmallElement(ArrayList<Integer> heights, int n) {

        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i=n-1;i>=0;i--)
        {
            int curr = heights.get(i);
            while(stack.peek()!=-1 && heights.get(stack.peek())>=curr )
            {
                stack.pop();
            }
            ans[i]= stack.peek();
            stack.push(i);
        }
        return ans;
    }



    // Get min -> TC- O(1), SC- O(1)

    Stack<Integer> stack = new Stack<>();
    int min= Integer.MAX_VALUE;

    // push
    public void push1(int data)
    {
        if(stack.empty())
        {
            stack.push(data);
            min=data;
        }
        else
        {
            if(data<min)
            {
                stack.push(2*data-min);
                min=data;
            }
            else
            {
                stack.push(data);
            }
        }
    }

    // pop
    public  int pop1()
    {
        if(stack.empty())
            return -1;

        int top = stack.peek();
        if(top<min)
        {
            int res = min;
            min= 2*min-top;
            stack.pop();
            return res;
        }
        else
        {
            stack.pop();
            return top;
        }
    }

    // top element
    public int top1()
    {
        if(stack.empty())
            return -1;
        int top = stack.peek();
        if(top>min)
            return top;
        else
            return min;
    }

    // get min
    public int min1()
    {
        if(stack.empty())
            return -1;
        return min;
    }




    // Implement stack using two queue

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push -> TC-O(n)
    public void pushByTwoQueue(int data)
    {
        // 1. push data into q2
        q2.add(data);

        // 2. push all the elements from q1 to q2;
        while(!q1.isEmpty())
        {
            int top = q1.remove();
            q2.add(top);
        }

        Queue<Integer> q =q1;
        q1=q2;
        q2=q;
    }


    // Pop -> TC-(1)
    public int popByTwoQueue()
    {
        if(q1.isEmpty())
            return -1;

        return q1.remove();
    }


    // Peek element
    public int peekByTwoQueue()
    {
        if(q1.isEmpty())
            return -1;

        return q1.peek();
    }


    // Is empty stack
    public boolean isEmptyByTwoQueue()
    {
        if(q1.isEmpty())
            return true;

        return false;
    }


    // Implement stack using one queue
    Queue<Integer> q = new LinkedList<>();
    public void pushByOneQueue(int data)
    {
        // 1. push data to queue
        q.add(data);

        // 2. pop front element and push to same queue at end
        for(int i=0;i<q.size();i++)
        {
            int top = q.remove();
            q.add(top);
        }

    }








}
