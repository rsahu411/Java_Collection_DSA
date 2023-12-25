package DSA.LinkedList;

import java.util.ArrayList;

public class Main {


    static DoublyNode doubleHead = null;
    static DoublyNode doubleTail = null;
    public static void main(String[] args) {

        // Singly LinkedList
//        System.out.println("Singly Linked List Operation");
//
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        Node head=null;
//
//        head = singlyLinkedList.insertAtFirstPosition(head,2);
//        head = singlyLinkedList.insertAtFirstPosition(head,0);
//        head = singlyLinkedList.insertAtFirstPosition(head,6);
//        head = singlyLinkedList.insertAtFirstPosition(head,-5);
//        singlyLinkedList.printLinkedList(head);
//
//        head = singlyLinkedList.insertAtLastPosition(head,9);
//        head = singlyLinkedList.insertAtLastPosition(head,-7);
//        singlyLinkedList.printLinkedList(head);
//
//        head = singlyLinkedList.insertAtPosition(head,13,4);
//        singlyLinkedList.printLinkedList(head);

//        head = linkedList.deleteAtFirstPosition(head);
//        head = linkedList.deleteAtLastPosition(head);
//        head = singlyLinkedList.deleteAtPosition(head,8);
//        singlyLinkedList.printLinkedList(head);

//        int size = singlyLinkedList.size(head);
//        System.out.println("Size of singly linked list is "+size);

//        head = singlyLinkedList.reverseLinkedList(head);
//        singlyLinkedList.printLinkedList(head);
//
//        Node prev= null;
//        Node curr = head;
//        head = singlyLinkedList.reverseListByRecursuion(head,curr,prev);
//        singlyLinkedList.printLinkedList(head);
//        head = singlyLinkedList.reverseRecursionOptimise(head);
//        singlyLinkedList.printLinkedList(head);
//        System.out.println();


        // find middle of linked list
//        System.out.println("Middle linked list ");
////        Node temp = singlyLinkedList.findMiddle(head);
//        Node temp = singlyLinkedList.findMiddle2(head);
//        singlyLinkedList.printLinkedList(temp);



        // Detect loop in a linked list
//        System.out.println("Check whether loop is present or not ");
//        boolean res = singlyLinkedList.detectLoop(head);
//        System.out.println(res);



        // Sort List of 0s,1s,2s
//        Node head= null;
//        head=singlyLinkedList.insertAtFirstPosition(head,0);
//        head=singlyLinkedList.insertAtFirstPosition(head,1);
//        head=singlyLinkedList.insertAtFirstPosition(head,2);
//        head=singlyLinkedList.insertAtLastPosition(head,1);
//        head=singlyLinkedList.insertAtLastPosition(head,0);
//        head=singlyLinkedList.insertAtLastPosition(head,2);
//        head=singlyLinkedList.insertAtLastPosition(head,1);
//        System.out.println("List of 0s, 1s, 2s is");
//        singlyLinkedList.printLinkedList(head);
//
//        System.out.println("Sorted List of 0s, 1s, 2s is");
////        head=singlyLinkedList.sortZeroOneTwo(head);
//        head=singlyLinkedList.sortZeroOneTwo2(head);
//        singlyLinkedList.printLinkedList(head);





        // Merge two sorted linked list
//        Node head1 = singlyLinkedList.insertAtFirstPosition(null,1);
//        head1 = singlyLinkedList.insertAtLastPosition(head1,5);
//        head1 = singlyLinkedList.insertAtLastPosition(head1,3);
//        Node head2 = singlyLinkedList.insertAtFirstPosition(null,2);
//        head2 = singlyLinkedList.insertAtLastPosition(head2,4);
       // head2 = singlyLinkedList.insertAtLastPosition(head2,5);

//        head1 = singlyLinkedList.mergeTwoList(head2,head1);
//       singlyLinkedList.printLinkedList(head1);



        // Add data of two linked list
//        System.out.println("Sum of two linked list is ");
//        Node ans = singlyLinkedList.addTwoLists(head1, head2);
//        singlyLinkedList.printLinkedList(ans);



        // Merge sort of linked list
//        System.out.println("Merge sort is");
//        head1 = singlyLinkedList.insertAtLastPosition(head1,-2);
//        head1 = singlyLinkedList.insertAtLastPosition(head1, 4);
//        singlyLinkedList.printLinkedList(head1);
//        head1 = singlyLinkedList.mergeSort(head1);
//        singlyLinkedList.printLinkedList(head1);




        // Remove duplicate data from sorted linked list
        Node head = singlyLinkedList.insertAtLastPosition(null,2);
        head = singlyLinkedList.insertAtLastPosition(head, 5);
        head = singlyLinkedList.insertAtLastPosition(head,2);
        head = singlyLinkedList.insertAtLastPosition(head,5);
        head = singlyLinkedList.insertAtLastPosition(head,1);
        singlyLinkedList.printLinkedList(head);

//        Node ans = singlyLinkedList.removeSortedDuplicate(head);
//        System.out.println("Remove duplicate data in sorted list ");
//        singlyLinkedList.printLinkedList(ans);





        // Remove duplicates from unsorted linked list
        System.out.println("Remove duplicates from unsorted list");
        Node ans = singlyLinkedList.removeUnsortedDuplicates(head);
        singlyLinkedList.printLinkedList(ans);



        // Double LinkedList
//        System.out.println("Doubly Linked List Operation");
//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//
//        doubleHead = doublyLinkedList.insertAtFirstPosition(doubleHead,12);
//        doubleHead = doublyLinkedList.insertAtFirstPosition(doubleHead,20);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);
//
//        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,7);
//        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,16);
//        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,-35);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);
//
//        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,8,1);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);
//        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,6,2);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);
//        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,24,8);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);
//
//        doubleHead = doublyLinkedList.deleteAtFirstPosition(doubleHead);
//        doubleHead = doublyLinkedList.deleteAtLastPosition(doubleHead);
//        doubleHead = doublyLinkedList.deleteAtPosition(doubleHead,6);
//        doublyLinkedList.printDoublyLinkedList(doubleHead);

        // Reverse of doubly linked list
//        DoublyNode temp1 = doublyLinkedList.reverseDoublyLinkedList(doubleHead);
//        doublyLinkedList.printDoublyLinkedList(temp1);






        // Circular Linked list

//        CircularLinkedList circularList = new CircularLinkedList();
//
//        System.out.println("Circular linked list");
//        Node tail = null;
//
//        tail = circularList.insertAfterSearchElement(tail,6,0);
//        tail = circularList.insertAfterSearchElement(tail,9,6);
//        tail = circularList.insertAfterSearchElement(tail, 2,9);
//        tail = circularList.insertAfterSearchElement(tail,12,6);
//        tail = circularList.insertAfterSearchElement(tail,1,12);
//        tail = circularList.insertAfterSearchElement(tail,-24,2);
//        circularList.printCircularLinkedList(tail);


//        tail = circularList.deleteByDataValue(tail,9);
//        tail = circularList.deleteByDataValue(tail,6);
//        tail = circularList.deleteByPosition(tail,1);
//        circularList.printCircularLinkedList(tail);

//        Node rev= circularList.reverse(tail);
//        circularList.printCircularLinkedList(rev);



        // Detect loop in circular linked list
//        System.out.println("Check whether loop is present or not ");
//        circularList.printCircularLinkedList(tail);
//        Node res = circularList.detectLoop(tail);
//        if(res!=null)
//            System.out.println("Loop is present in list and intersectionNode is "+res.data);
//        else
//            System.out.println("Loop is not present in list");
//
//        Node startNode = circularList.getStartNode(tail);
//        System.out.println("Loop start node is "+startNode.data);



        // Size of circular linked list
//        int size= circularList.size(tail);
//        System.out.println("Size of circular linked list is "+size);
//
//
//        // Split circular list into two circular list
//        ArrayList<Node> ans = new ArrayList<>();
//        ans = circularList.splitIntoTwo(tail);
//        ans.forEach(circularList::printCircularLinkedList);
    }
}
