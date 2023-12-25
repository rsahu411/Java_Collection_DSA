package DSA.LinkedList;

import java.util.HashMap;
import java.util.Map;

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
        if(head==null || head.next==null)
        {
            return head;
        }
        Node prev=null, current=head, forward=null;
        while(current!=null)
        {
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        head = prev;
        return head;
    }


    // 10. Reverse of linked list using recursion
    public Node reverseListByRecursion(Node head, Node curr, Node prev)
    {
        // base case -> end of linked list condition
        if(curr==null)
        {
            head = prev;
            return head;
        }

        // Reverse the remaining list
        Node forward = curr.next;
        Node res = reverseListByRecursion(head,forward,curr);
        curr.next = prev;

        return res;
    }


    // 11. Reverse of linked list using recursion optimise
    public Node reverseRecursionOptimise(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node remainingList = reverseRecursionOptimise(head.next);

        head.next.next = head;  // 2nd node link reverse
        head.next = null;       // 1st node link reverse

        return remainingList;
    }



    // 12. Find middle of linked list
    public Node findMiddle(Node head)
    {
        int length = size(head)/2;
        Node temp=head;
        while(length!=0)
        {
            temp=temp.next;
            length--;
        }
        return temp;
    }


    // Method 2 find middle
    public Node findMiddle2(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node slow=head, fast=head.next;
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
            }
            slow=slow.next;
        }
        return slow;
    }




    // Reverse List in K group
    public  Node reverseKGroup(Node head,int k)
    {
        // step 1 base case
        if(head==null)
        {
            return null;
        }

        // step-2 reverse first k group
        Node prev=null;
        Node curr=head;
        Node next=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }


        // step-3 connect with remaining list
        if(next!=null)
        {
            head.next=reverseKGroup(next,k);
        }

        // step-4 return head of reverse list
        return prev;
    }
    public  Node kReverse(Node head, int k) {
        // Write your code here.
        int length= size(head);

        // when length is multiple of k
        if(length%k==0)
        {
            return reverseKGroup(head,k);
        }

        // when length is not multiple of k
        int pos = length - length%k;

        // Break list in two part one is multiple of k
        // another is rest list
        Node first = head, second=null;
        while(pos!=1 && first!=null)
        {
            second=first.next;
            first=second;
            pos--;
        }
        if(first!=null)
        {
            second=first.next;
            first.next=null;
        }

        Node firstKReverse = reverseKGroup(head,k);

        Node temp=firstKReverse;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=second;

        return firstKReverse;
    }





    // Detect and Remove Loop - by Floyd Algorithm
    // 1. Detect loop in linked list
    public boolean detectLoop(Node head)
    {
        if(head==null || head.next==null)
        {
            return false;
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
                return true;
            }
        }
        return false;
    }



    // Sorted list of 0s, 1s, 2s
    // Method-1
    public Node sortZeroOneTwo(Node head)
    {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        // count 0s,1s,2s
        Node temp= head;
        while(temp!=null)
        {
            if(temp.data==0)
                zeroCount++;

            else if(temp.data==1)
                oneCount++;

            else if(temp.data==2)
                twoCount++;

            temp=temp.next;
        }

        // Replace list value with 0s,1s,2s in increasing order
        temp=head;
        while(temp!=null)
        {
            if(zeroCount!=0)
            {
                temp.data=0;
                zeroCount--;
            }
            else if(oneCount!=0)
            {
                temp.data=1;
                oneCount--;
            }
            else if(twoCount!=0)
            {
                temp.data=2;
                twoCount--;
            }
            temp=temp.next;
        }
        return head;
    }


    // Method-2
    public Node sortZeroOneTwo2(Node head)
    {
        Node zeroHead = new Node(-1); // create with dummy data
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        // create separate list of 0s, 1s, 2s
        Node temp=head;
        while(temp!=null)
        {
            int value = temp.data;
            if(value==0)
            {
                zeroTail.next=temp;
                zeroTail=temp;
            }
            else if(value==1)
            {
                oneTail.next=temp;
                oneTail=temp;
            }
            else if(value==2)
            {
                twoTail.next=temp;
                twoTail=temp;
            }
            temp=temp.next;
        }

        // Merge the 3 list
        // If 1s list is non-empty -> check because if 1s is not present in input list then 0s connect with 2s
        if(oneHead.next!=null)
        {
            zeroTail.next=oneHead.next;
        }
        else // 1s list is empty
        {
            zeroTail.next=twoHead.next;
        }
        oneTail.next = twoHead.next;
        twoTail.next=null;

        head=zeroHead.next;
        return head;
    }





    // Merge two sorted linked list
    public Node mergeList(Node first, Node second)
    {
        // If first node have only one element, then merge with second list
        if(first.next == null)
        {
            first.next = second;
        }

        Node curr1 = first;
        Node next1 = curr1.next;
        Node curr2 = second;
        Node next2 = curr2.next;

        // while first list next and second list curr is not null
        while (next1 != null && curr2 != null)
        {
            // check if list 2 curr data is in between curr and next of 1 list and place curr2 in between of curr1 and next1
            if((curr2.data >= curr1.data) && (curr2.data <= next1.data))
            {
                // update node links
                curr1.next = curr2;
                next2 = curr2.next;
                curr2.next = next1;

                // update pointers
                curr1 = curr2;
                curr2 = next2;
            }
            else {
                curr1 = next1;
                next1 = next1.next;

                // if next1 is end and list 2 has some nodes
                if (next1 == null) {
                    curr1.next = curr2;  // put all list2 node in the end of list1
                    return first;
                }
            }
        }
//        while(next1==null && curr2!=null)
//
        return first;
    }


    public Node mergeTwoList(Node first, Node second)
    {
        if(first==null)
        {
            return second;
        }
        if(second==null)
        {
            return first;
        }

        // Choose list whose first node data is less than other one
        if(first.data <= second.data)
        {
            return mergeList(first,second);
        }
        else
        {
            return mergeList(second,first);
        }
    }




    // Add data of two linked list

    public Node addLists(Node first, Node second)
    {
        int carry=0;

        Node ansHead=null;

        while(first!=null || second!=null || carry!=0)
        {
            int val1=0;
            if(first!=null)
            {
                val1= first.data;
            }

            int val2=0;
            if(second!=null)
            {
                val2= second.data;
            }

            int sum = carry + val1 + val2;
            int digit = sum%10;

            ansHead = insertAtLastPosition(ansHead,digit);

            carry = sum/10;

            if(first!=null)
            {
                first=first.next;
            }

            if(second!=null)
            {
                second=second.next;
            }
        }
        return ansHead;
    }
    public Node addTwoLists(Node first, Node second)
    {
        if(first==null)
        {
            return second;
        }
        if(second==null)
        {
            return first;
        }
        // step-1 reverse the lists
        first= reverseLinkedList(first);
        second= reverseLinkedList(second);

        // step-2 add data of two lists
        Node ans = addLists(first,second);

        // step-3 reverse the resultant list
        ans= reverseLinkedList(ans);

        return ans;
    }





    // Merge Sort of linked list

    public Node middleFind(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow;
    }
    public Node merge(Node left, Node right)
    {
        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;
        }

        Node ans = new Node(-1); // final list with dummy data
        Node temp=ans;

        while(left!=null && right!=null)
        {
            if(left.data < right.data)
            {
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }

        // if left list is still not null
        while(left!=null)
        {
            temp.next = left;
            temp = left;
            left = left.next;
        }

        // if right list is still not null
        while(right!=null)
        {
            temp.next = right;
            temp = right;
            right = right.next;
        }

        // remove dummy data
        ans = ans.next;
        return ans;
    }
    public Node mergeSort(Node head)
    {
        // step 1 - base case
        if(head==null || head.next==null)
        {
            return head;
        }


        // step 2 - find middle to divide list in two half
        Node middle = middleFind(head);
        Node left = head;
        Node right=middle.next;
        middle.next=null;


        // step 3 - recursive call
        left = mergeSort(left);
        right = mergeSort(right);

        // step 4 - merge left and right in sorted form
        Node ans = merge(left,right);

        return ans;
    }





    // Remove duplicate data in sorted Linked List
    public Node removeSortedDuplicate(Node head)
    {
        if(head==null || head.next==null)   // 2 5 5 5 6
        {
            return head;
        }

        Node curr = head;
        Node next = null;
        while(curr.next!=null)
        {
            next = curr.next;
            if(curr.data==next.data)
            {
                curr.next=next.next;
            }
            else
            {
                curr=next;
            }
        }

        return head;
    }





    // Remove duplicates from unsorted linked list
    public Node removeUnsortedDuplicates(Node head)
    {
        // Your code here

        if(head==null || head.next==null)
        {
            return head;
        }

        Node curr=head;
        Map<Integer,Boolean> map = new HashMap<>();

        while(curr!=null)
        {
            map.put(curr.data,false);
            curr=curr.next;
        }

        curr=head;
        Node prev=null;
        while(curr!=null)
        {
            if(map.get(curr.data)==true)
            {
                prev.next = curr.next;
            }
            else
            {
                map.put(curr.data,true);
                prev=curr;
            }
            curr=prev.next;
        }

        return head;
    }
}
