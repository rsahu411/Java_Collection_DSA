package DSA.LinkedList;

public class SinglyLinkedList {

    // 1. Insert at 1st position
    public Node insertAtFirstPosition(Node head,int data)
    {
        Node newNode = new Node(data);

        if(head!=null)
            newNode.next=head;
        head=newNode;
        return head;
    }


    // 2. Insert at last position
    public Node insertAtLastPosition(Node head,int data)
    {
        Node newNode = new Node(data);
        if(head==null)
            return newNode;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }


    // 3. Insert at a specific position
    public Node insertAtPosition(Node head,int data,int pos)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            System.out.println("This is first Node ");
            return newNode;
        }
        if(pos<=0 || pos>size(head)+1)
            System.out.println("Invalid position");
        else if (pos==1)
            return insertAtFirstPosition(head,data);
        else
        {
            Node temp = head;
            while(pos!=2)
            {
               temp=temp.next;
               pos--;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        return head;
    }


    // 4. Deletion at 1st position
    public Node deleteAtFirstPosition(Node head)
    {
        if(head==null)
            System.out.println("Linked list is already empty");
        else
        {
            head=head.next;
        }
        return head;
    }


    // 5. Deletion at last position
    public Node deleteAtLastPosition(Node head)
    {
        if(head==null)
            System.out.println("Linked list is already empty");
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;

        }
        return head;
    }


    // 6. Delete at specific position
    public Node deleteAtPosition(Node head, int pos)
    {
        if(pos<=0 || pos>size(head))
            System.out.println("Invalid Position");
        else if(pos==1)
            return deleteAtFirstPosition(head);
        else
        {
            Node temp=head,prev=null;
            while(pos!=1)
            {
                prev=temp;
                temp=temp.next;
                pos--;
            }
            prev.next=temp.next;
        }
        return head;
    }


    // 7. Print linkedList
    public void printLinkedList(Node head)
    {
        if(head==null)
            System.out.println("List is Null");
        else
        {
            while(head!=null)
            {
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }


    // 8. size of a linked list
    public int size(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }


    // 9. Reverse a linked list
    public Node reverseLinkedList(Node head)
    {
        Node prev=null, current=head, next=null;
        while(current!=null)
        {
          next=current.next;
          current.next=prev;
          prev=current;
          current=next;
        }
        head = prev;
        return head;
    }
}
