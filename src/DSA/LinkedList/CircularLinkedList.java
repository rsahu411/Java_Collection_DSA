package DSA.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;

public class CircularLinkedList {


    // 1. Insertion at beginning
    public Node insertAfterSearchElement(Node tail, int data, int searchElement)
    {
        Node newNode = new Node(data);
        // If tail is empty
        if(tail==null)
        {
            tail=newNode;
            newNode.next=tail;
            return tail;
        }
        // If tail is not empty
        else
        {
            // Assume that searched element is present in list
            Node temp = tail;        // used to search a search element in list after which newNode is placed
            while(temp.data!=searchElement)
            {
                temp=temp.next;
            }
            newNode.next= temp.next;
            temp.next = newNode;
        }
        return tail;
    }




    // 2. Delete a node in circular linked list by value
    public Node deleteByDataValue(Node tail, int value)
    {
        // If list is empty
        if(tail==null)
        {
            System.out.println("Please check it list is already empty");
            return null;
        }
        else
        {
            // Assume "value" is present in the list
            Node prev = tail;
            Node curr = prev.next;

            while(curr.data!=value)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next = curr.next;

            // for 1 node list  ->  current and previous at same position
            if(curr==prev)
            {
                tail = null;
            }
            // delete 1 node for greater than one node
            if(tail==curr)
            {
                tail=prev;
            }
        }
        return tail;
    }





    // 4. Delete a node in circular linked list by position
    public Node deleteByPosition(Node tail, int position)
    {
        // If list is empty
        if(tail==null)
        {
            System.out.println("Please check it list is already empty");
            return null;
        }
        else if(position==1)
        {
            return deleteByDataValue(tail,tail.data);
        }
        else
        {
            Node prev = tail;
            Node curr = prev.next;

            // for 1 node list
            if(curr==prev)
            {
                return null;
            }

            while(position!=2)
            {
                prev = curr;
                curr = curr.next;
                position--;
            }
            prev.next = curr.next;

            return tail;
        }
    }




    // 3. Traversal of circular linked list
    public  void printCircularLinkedList(Node tail) {
        if (tail == null) {
            System.out.println("Circular linked list is empty");
        } else {
            Node temp = tail;

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;

            } while (temp != tail);
            System.out.println();
        }
    }



    // Reverse circular linked list
    public  Node reverse(Node head)   // 6 12 1 9 2 -24
    {
        //Add your code here
        if(head==null || head.next==head)
        {
            return head;
        }
        Node curr=head.next, prev=head, next=null;
        while(curr!=head)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // All reversed except head because start from head.next
        // Here is reversed and points to last node;
        head.next=prev;
        return prev;
    }




    // Detect Loop in circular Linked list - TC- O(n), SC- O(n)
    public boolean detectLoopBYMap(Node head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }

        HashMap<Node,Boolean> visited = new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            if(visited.get(temp))
            {
                return true;
            }
            visited.put(temp,true);
            temp=temp.next;
        }
        return false;
    }




    // Detect and Remove Loop - by Floyd Algorithm
    // 1. Detect loop in linked list
    public Node  detectLoop(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node slow=head, fast=head;
        while(slow!=null && fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
            }
            slow=slow.next;

            // if slow and fast point to a same node that means loop is present in linked list
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;
    }


    // Get starting node where loop is start
    public Node getStartNode(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node intersectionNode = detectLoop(head);    // where slow and fast are equal in detect loop method
        // If intersection is null, when loop is not present
        if(intersectionNode==null)
        {
            return null;
        }

        Node slow=head;
        while(slow!=intersectionNode)
        {
            slow=slow.next;
            intersectionNode=intersectionNode.next;
        }
        return slow;
    }


    // Remove the loop if detected by floyd's algorithm
    public Node removeLoop(Node head)
    {
        if(head==null)
        {
            return null;
        }

        Node startLoopNode = getStartNode(head);
        // if loop is not present then there is not starting node of loop
        if(startLoopNode==null)
        {
            return head;
        }
        Node temp=startLoopNode;
        while(temp.next!=startLoopNode)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }




    // Split a circular list into two circular linked list
    public int size(Node head)
    {
        int count=0;
        Node temp=head;
        while(temp.next!=head)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ArrayList<Node> splitIntoTwo(Node head)
    {
        int length= size(head);
        int middle= length/2+1;

        Node first=head, second=null;
        while(middle!=1)
        {
            first=first.next;
            middle--;
        }
        second=first.next;
        first.next=head;

        Node temp=second;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=second;

        ArrayList<Node> ans = new ArrayList<>();
        ans.add(head);
        ans.add(second);
        return ans;
    }
}
