package DSA.LinkedList;

public class Main {


    static DoublyNode doubleHead = null;
    static DoublyNode doubleTail = null;
    public static void main(String[] args) {

        // Singly LinkedList
        System.out.println("Singly Linked List Operation");

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node head=null;
        head = singlyLinkedList.insertAtFirstPosition(head,2);
        head = singlyLinkedList.insertAtFirstPosition(head,0);
        head = singlyLinkedList.insertAtFirstPosition(head,6);
        head = singlyLinkedList.insertAtFirstPosition(head,-5);
        singlyLinkedList.printLinkedList(head);

        head = singlyLinkedList.insertAtLastPosition(head,9);
        head = singlyLinkedList.insertAtLastPosition(head,-7);
        singlyLinkedList.printLinkedList(head);

        head = singlyLinkedList.insertAtPosition(head,13,4);
        singlyLinkedList.printLinkedList(head);

//        head = linkedList.deleteAtFirstPosition(head);
//        head = linkedList.deleteAtLastPosition(head);
        head = singlyLinkedList.deleteAtPosition(head,8);
        singlyLinkedList.printLinkedList(head);
        int size = singlyLinkedList.size(head);
        System.out.println("Size of singly linked list is "+size);
        head = singlyLinkedList.reverseLinkedList(head);
        singlyLinkedList.printLinkedList(head);

        System.out.println();


        // Double LinkedList
        System.out.println("Doubly Linked List Operation");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();


        doubleHead = doublyLinkedList.insertAtFirstPosition(doubleHead,12);
        doubleHead = doublyLinkedList.insertAtFirstPosition(doubleHead,20);
        doublyLinkedList.printDoublyLinkedList(doubleHead);

        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,7);
        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,16);
        doubleHead = doublyLinkedList.insertAtLastPosition(doubleHead,-35);
        doublyLinkedList.printDoublyLinkedList(doubleHead);

        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,8,1);
        doublyLinkedList.printDoublyLinkedList(doubleHead);
        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,6,2);
        doublyLinkedList.printDoublyLinkedList(doubleHead);
        doubleHead = doublyLinkedList.insertAtPosition(doubleHead,24,8);
        doublyLinkedList.printDoublyLinkedList(doubleHead);

        doubleHead = doublyLinkedList.deleteAtFirstPosition(doubleHead);
        doubleHead = doublyLinkedList.deleteAtLastPosition(doubleHead);
        doubleHead = doublyLinkedList.deleteAtPosition(doubleHead,6);
        doublyLinkedList.printDoublyLinkedList(doubleHead);


    }
}
