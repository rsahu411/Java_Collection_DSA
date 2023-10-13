package DSA.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        QueueArr q = new QueueArr(5);

        // Implementation of queue
//        q.push(3);
//        q.push(7);
//        q.push(6);
//        q.push(17);
//        q.push(30);
//        q.print();
//
//        System.out.println("Front element is "+q.front());
//        System.out.println("Pop element is "+q.pop());
//        System.out.println("Is Stack empty: "+ q.isEmpty());
//        q.print();
//
//        System.out.println("Front element is "+q.front());
//        System.out.println("Pop element is "+q.pop());
//        System.out.println("Is Stack empty: "+ q.isEmpty());
//        q.print();
//
//        System.out.println("Front element is "+q.front());
//        System.out.println("Pop element is "+q.pop());
//        System.out.println("Is Stack empty: "+ q.isEmpty());
//        q.print();
//
//        System.out.println("Front element is "+q.front());
//        System.out.println("Pop element is "+q.pop());
//        System.out.println("Is Stack empty: "+ q.isEmpty());
//        q.print();
//
//        System.out.println("Front element is "+q.front());
//        System.out.println("Pop element is "+q.pop());
//        System.out.println("Is Stack empty: "+ q.isEmpty());
//        q.print();
//        System.out.println("Pop element is "+q.pop());



        // Queue using stack
        // Method - 1
//        System.out.println("Pop element is "+q.deQueue());
//        q.enQueue(2);
//        q.enQueue(4);
//        q.enQueue(9);
//        q.enQueue(12);
//        q.enQueue(43);
//        System.out.println("Pop element is "+q.deQueue());
//        System.out.println("Pop element is "+q.deQueue());
//        System.out.println("Pop element is "+q.deQueue());
//        System.out.println("Pop element is "+q.deQueue());
//        System.out.println("Pop element is "+q.deQueue());


        // Method - 2
        System.out.println("Pop element is "+q.deQueue1());
        q.enQueue1(5);
        q.enQueue1(9);
        q.enQueue1(16);
        q.enQueue1(24);
        System.out.println("Pop element is "+q.deQueue1());
        System.out.println("Pop element is "+q.deQueue1());
        System.out.println("Pop element is "+q.deQueue1());



        // Queue Reversal
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(7);
//        queue.add(8);
//        queue.add(18);
//        queue.add(67);
//        queue.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();

//        q.queueReversal(queue);
//        System.out.println("Reversal Queue is ");
//        queue.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();



        // Reverse first k elements from queue
//        int k=3;
//        q.reverseFirstKElements(queue,k);
//        System.out.println("First k reverse elements is ");
//        queue.forEach(e-> System.out.print(e+" "));
//        System.out.println();




        // First non-repeating character in a stream
//        String str = "aabcd";
//        String ans = q.firstNonRepeating(str);
//        System.out.println(ans);



        // Circular Tour
//        int[] petrol = {6,7,4,10,6,5};
//        int[] distance = {5,6,7,8,6,4};
//        int start = q.tour(petrol,distance);
//        System.out.println("Start point is "+start);



        // First negative element in k size window
//        ArrayList<Integer> res = new ArrayList<>();
//        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
//        int k=3;
//        res = q.printFirstNegativeInteger(arr,k);
//        res.forEach(ele-> System.out.print(ele+" "));
//        System.out.println();


        // Implementation of circular queue
//        CircularQueue cq = new CircularQueue(5);
//
//        cq.print();
//        cq.push(34);
//        cq.push(9);
//        cq.push(13);
//        cq.push(2);
//        cq.push(-7);
//        cq.print();
//        System.out.println("Pop element is "+ cq.pop());
//        System.out.println("Pop element is "+ cq.pop());
//        cq.print();
//        cq.push(0);
//        cq.print();



        // InterLeave the first half of queue with second half
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);
//        queue.add(19);
//        queue.add(20);
        System.out.println("Interleave of queue is ");
        q.interLeaveQueue(queue);
        queue.forEach(ele-> System.out.print(ele+" "));
        System.out.println();



    }
}
