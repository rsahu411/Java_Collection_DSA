package DSA.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        StackArr stack = new StackArr(5);
        StackArr s = new StackArr();

//        stack.push(10);
//        stack.push(15);
//        stack.push(12);
//        stack.push(22);
//        stack.push(24);
//        stack.push(8); // overflow
//
//        stack.print();
//
//        System.out.println("Peek element "+stack.peek());
//        stack.pop();
//        System.out.println("Peek element "+stack.peek());
//        stack.pop();
//        System.out.println("Peek element "+stack.peek());
//        stack.pop();
//        System.out.println("Peek element "+stack.peek());
//        if(stack.empty())
//            System.out.println("Stack is empty");
//        else
//            System.out.println("Stack is not empty");


        // Reverse of String
//        String str = stack.reverse("Rishabh");
//        System.out.println(str);


        // Delete middle element from stack
//        Stack<Integer> st = new Stack<>();
//        st.push(15);
//        st.push(47);
//        st.push(34);
//        st.push(89);
//        st.push(3);
//        st.push(5);
//        st.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();
//
//
//        s.deleteMiddle(st,0, st.size()-1);
//        st.forEach(ele-> System.out.print(ele+" "));
//
//
//        // Insert an element at bottom
//        s.insertAtBottom(st, 10);
//        System.out.println("Inset at Bottom ");
//        st.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();
//
//
//        // Reverse a stack using recursion
//        s.reverseStack(st);
//        System.out.println("Reverse a stack ");
//        st.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();
//
//        s.sortStack(st);
//        System.out.println("Sort a stack ");
//        st.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();


        // Cost to make valid parenthesis
//        String str = "}}}}}}{{{{";
//        int res = s.toMakeValidExp(str);
//        System.out.println("Cost is "+res);


        // Next smaller element
//        int[] arr = {2,1,4,3};
//        int n=4;
//        List<Integer> ans = new ArrayList<>();
//        ans = s.nextSmall(arr,n);
//        ans.forEach(ele-> System.out.print(ele+" "));


        // Largest Rectangle - hard
//        ArrayList<Integer> heights = new ArrayList<>();
//        heights.add(2);
//        heights.add(1);
//        heights.add(5);
//        heights.add(6);
//        heights.add(2);
//        heights.add(3);
//        heights.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();
//        int area = s.largestRectangle(heights);
//        System.out.println("Area "+ area);


        // get min
//        s.push1(5);
//        s.push1(3);
//        s.push1(2);
//        s.push1(1);
//        s.push1(4);
//
//        System.out.println("top element is "+ s.top1());
//        System.out.println("min element is "+s.min1());
//        System.out.println("Pop element is "+ s.pop1());
//
//        System.out.println("top element is "+ s.top1());
//        System.out.println("min element is "+s.min1());
//        System.out.println("Pop element is "+ s.pop1());
//
//        System.out.println("top element is "+ s.top1());
//        System.out.println("min element is "+s.min1());
//        System.out.println("Pop element is "+ s.pop1());
//
//        System.out.println("top element is "+ s.top1());
//        System.out.println("min element is "+s.min1());
//        System.out.println("Pop element is "+ s.pop1());
//
//        System.out.println("top element is "+ s.top1());
//        System.out.println("min element is "+s.min1());
//        System.out.println("Pop element is "+ s.pop1());




        // Implement stack using two queue
        System.out.println("Pop element is "+ s.popByTwoQueue());
        s.pushByTwoQueue(12);
        s.pushByTwoQueue(20);
        s.pushByTwoQueue(5);
        s.pushByTwoQueue(40);
        s.pushByTwoQueue(9);
        System.out.println("Top element is "+ s.peekByTwoQueue());
        System.out.println("Pop element is "+ s.popByTwoQueue());
        System.out.println("Pop element is "+ s.popByTwoQueue());
        System.out.println("Pop element is "+ s.popByTwoQueue());
        System.out.println("Top element is "+ s.peekByTwoQueue());
        

    }
}
