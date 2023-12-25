package DSA.LinkedList;

public class DoublyLinkedList {


    // 1. Insert at first position
    public DoublyNode insertAtFirstPosition(DoublyNode head, int data)
    {
        DoublyNode newNode = new DoublyNode(data);

        if(head!=null)
        {
            head.prev=newNode;
            newNode.next=head;
        }
        head=newNode;

        return head;
    }


    // 2. Insert at last position
    public DoublyNode insertAtLastPosition(DoublyNode head, int data)
    {
        DoublyNode newNode =  new DoublyNode(data);
        if(head==null)
            return newNode;

        DoublyNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;

        return head;
    }


    // 3. Insert at a specific position
    public DoublyNode insertAtPosition(DoublyNode head, int data,int pos)
    {
        DoublyNode newNode = new DoublyNode(data);
        if(head==null)
        {
            System.out.println("This is first Node");
            return newNode;
        }

        if (pos<=0 || pos>size(head)+1)
            System.out.println("Invalid position");
        else if (pos==1)
                return insertAtFirstPosition(head,data);
        else {

            DoublyNode temp=head;
            while(pos!=2)
            {
                temp=temp.next;
                pos--;
            }
            newNode.prev=temp;
            newNode.next=temp.next;
            if(temp.next!=null)
            {
                temp.next.prev=newNode;
            }
            temp.next=newNode;

        }
        return head;
    }


    // 4. Deletion at 1st position
    public DoublyNode deleteAtFirstPosition(DoublyNode head)
    {
        if(head==null)
            System.out.println("Linked list is already empty");
        else if(head.next==null)
        {
            return null;
        }
        else
        {
            head=head.next;
            head.prev=null;
        }
        return head;
    }


    // 5. Deletion at last position
    public DoublyNode deleteAtLastPosition(DoublyNode head)
    {
        if(head==null)
            System.out.println("Linked list is already empty");
        else if(head.next==null)
        {
            return null;
        }
        else
        {
            DoublyNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.prev.next=null;
        }
        return head;
    }


    // 6. Delete at specific position
    public DoublyNode deleteAtPosition(DoublyNode head, int pos)
    {
        if(pos<=0 || pos>size(head))
        {
            System.out.println("Invalid Position");
            return head;
        }

        if(pos==1)
            return deleteAtFirstPosition(head);
        else
        {
            DoublyNode temp=head;
            while(pos!=1)
            {
                temp=temp.next;
                pos--;
            }
            if(temp.next==null)
            {
                temp.prev.next=null;
            }
            else
            {
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }

        }
        return head;
    }


    // 7. Print DoublyLinkedList
    public void printDoublyLinkedList(DoublyNode head)
    {
        if(head==null)
            System.out.println("List is null");
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


    // 8. Size of doubly linked list
    public int size(DoublyNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }


    // 9. Reverse of doubly linked list
    public DoublyNode reverseDoublyLinkedList(DoublyNode head)
    {
       if(head==null || head.next==null)
       {
           return head;
       }

       DoublyNode previous=null, current=head;

       while(current!=null)
       {
           previous = current.prev;
           current.prev = current.next;
           current.next = previous;

           // Now pre and next of node are interchange
           // so current points to pre of current
           current=current.prev;
       }
       head = previous.prev;
       return head;
    }
}
