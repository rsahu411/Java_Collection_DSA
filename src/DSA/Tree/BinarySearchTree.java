package DSA.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class DLLNode{
    Node head;
}
public class BinarySearchTree {


    // Create binary search tree  -  TC- O(Height) or O(n)
    public Node insertIntoBST(Node root, int data) {
        // base case
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertIntoBST(root.left, data);
        } else {
            root.right = insertIntoBST(root.right, data);
        }
        return root;
    }

    public Node buildBST(Node root) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data for binary search tree");
        int data = scanner.nextInt();

        while (data != -1) {
            root = insertIntoBST(root, data);
            data = scanner.nextInt();
        }

        return root;
    }


    // Level order traversal
    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }


    // Inorder traversal
    public void inorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }


    // Preorder traversal
    public void preorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }


    // Postorder traversal
    public void postorderTraversal(Node root) {
        // base case
        if (root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }


    // Search in BST - recursion -   TC- O(Height) or O(n)
    public boolean searchInBST(Node root, int target) {
        // base case
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        } else if (root.data > target) {
            return searchInBST(root.left, target);
        } else {
            return searchInBST(root.right, target);
        }
    }


    // Method-2 Iterative
    public boolean searchInBSTIterative(Node root, int target) {
        Node curr = root;

        while (curr != null) {
            if (curr.data == target) {
                return true;
            } else if (curr.data > target) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return false;
    }


    // Minimum value in BST
    public Node minimumValue(Node root) {
        // base case
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root;
        }

        return minimumValue(root.left);
    }


    // Maximum value in BST
    public Node maximumValue(Node root) {
        // base case
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root;
        }

        return maximumValue(root.right);
    }


    // Deletion in BST  -  TC- O(H) or O(n)
    public Node deleteFromBST(Node root, int value) {
        // base case
        if (root == null) {
            return null;
        }

        if (root.data == value) {
            // now delete node
            // 0 child case
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 child case for both left and right
            // left child case
            else if (root.left != null && root.right == null) {
                return root.left;
            }
            // right child case
            else if (root.left == null && root.right != null) {
                return root.right;
            }

            // 2 child case - either find max value in left tree or find min value in right tree and replace
            else {
                int min = minimumValue(root.right).data;
                root.data = min;
                root.right = deleteFromBST(root.right, min);
                return root;
            }
        } else if (root.data > value) {
            root.left = deleteFromBST(root.left, value);
        } else {
            root.right = deleteFromBST(root.right, value);
        }

        return root;
    }


    // Check Tree is BST or not -> Method 2 - find Inorder traversal and check sorted or not
    public boolean isBST(Node root, int min, int max) {
        // base case
        if (root == null) {
            return true;
        }

        if (root.data >= min && root.data <= max) {
            boolean left = isBST(root.left, min, root.data);
            boolean right = isBST(root.right, root.data, max);

            return left && right;
        }
        return false;
    }

    public boolean checkBST(Node root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        return isBST(root, min, max);
    }


    // Kth minimum Node in binary search tree
    public int kthMinimumTreeSolver(Node root, int k, Index index) {
        // base case
        if (root == null) {
            return -1;
        }

        // L
        int left = kthMinimumTreeSolver(root.left, k, index);
        if (left != -1) {
            return left;
        }

        // N
        index.idx++;
        if (index.idx == k) {
            return root.data;
        }

        // R
        return kthMinimumTreeSolver(root.right, k, index);
    }

    public int kthMinimumTree(Node root, int k) {
        Index index = new Index(0);
        return kthMinimumTreeSolver(root, k, index);
    }


    // Kth maximum Node in binary search tree -> TC- O(n), SC- O(H)
    public int kthMaximumTreeSolver(Node root, int k, Index index) {
        // base case
        if (root == null) {
            return -1;
        }

        // L
        int right = kthMaximumTreeSolver(root.right, k, index);
        if (right != -1) {
            return right;
        }

        // N
        index.idx++;
        if (index.idx == k) {
            return root.data;
        }

        // R
        return kthMaximumTreeSolver(root.left, k, index);
    }

    public int kthMaximumTree(Node root, int k) {
        Index index = new Index(0);
        return kthMaximumTreeSolver(root, k, index);
    }


    // Predecessor and Successor of node in inorder traversal
    public ArrayList<Integer> predecessorAndSuccessor(Node root, int key) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        // search key element in tree
        Node temp = root;
        int predecessor = -1;
        int successor = -1;

        while (temp.data != key) {
            if (temp.data > key) {
                successor = temp.data;
                temp = temp.left;
            }
            if (temp.data < key) {
                predecessor = temp.data;
                temp = temp.right;
            }
        }

        // find predecessor in left tree which is maximum value
        Node leftTree = temp.left;
        while (leftTree != null) {
            predecessor = leftTree.data;
            leftTree = leftTree.right;
        }

        // find successor in right tree which is minimum value
        Node rightTree = temp.right;
        while (rightTree != null) {
            successor = rightTree.data;
            ;
            rightTree = rightTree.left;
        }
        ans.add(predecessor);
        ans.add(successor);

        return ans;
    }


    // LCA of BST
    public Node LCAinaBST(Node root, Node child1, Node child2) {
        // base case
        if (root == null) {
            return null;
        }

        if (root.data > child1.data && root.data > child2.data) {
            return LCAinaBST(root.left, child1, child2);
        }
        if (root.data < child1.data && root.data < child2.data) {
            return LCAinaBST(root.right, child1, child2);
        }

        // if( root.data > child1 && root.data < child2) -> return root
        // if( root.data < child1 && root.data > child2) -> return root
        return root;
    }


    // Sum of two nodes in BST is equal to target value
    public void inorderList(Node root, ArrayList<Integer> ans) {
        // base case
        if (root == null) {
            return;
        }

        inorderList(root.left, ans);
        ans.add(root.data);
        inorderList(root.right, ans);
    }

    public boolean twoSumInBST(Node root, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        inorderList(root, ans);

        int i = 0, j = ans.size() - 1;
        while (i < j) {
            int sum = ans.get(i) + ans.get(j);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }


    // Flatten BST to a sorted list
    public void inorderNodeList(Node root, ArrayList<Node> inorderList) {
        // base case
        if (root == null) {
            return;
        }

        inorderNodeList(root.left, inorderList);
        inorderList.add(root);
        inorderNodeList(root.right, inorderList);
    }

    public Node flatten(Node root) {
        ArrayList<Node> ans = new ArrayList<>();
        inorderNodeList(root, ans);

        Node newRoot = ans.get(0);
        int i = 0;
        int n = ans.size();

        while (i < n - 1) {
            Node node = ans.get(i);
            node.left = null;
            node.right = ans.get(i + 1);
            i++;
        }

        Node node = ans.get(n - 1);
        node.left = null;
        node.right = null;

        return newRoot;
    }

    public void printList(Node ans) {
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.right;
        }
    }


    // Normal BST to balanced BST
    public Node inorderToBalancedBST(ArrayList<Integer> inorder, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node root = new Node(inorder.get(mid));

        root.left = inorderToBalancedBST(inorder, start, mid - 1);
        root.right = inorderToBalancedBST(inorder, mid + 1, end);

        return root;
    }

    public Node normalBSTToBalancedBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();

        inorderList(root, inorder);

        return inorderToBalancedBST(inorder, 0, inorder.size() - 1);
    }


    // Preorder to BST
    public Node preorderToBSTSolver(ArrayList<Integer> preorder, int min, int max, Index index) {
        if (index.idx >= preorder.size()) {
            return null;
        }
        if (preorder.get(index.idx) < min || preorder.get(index.idx) > max) {
            return null;
        }

        Node root = new Node(preorder.get(index.idx));
        index.idx++;
        root.left = preorderToBSTSolver(preorder, min, root.data, index);
        root.right = preorderToBSTSolver(preorder, root.data, max, index);

        return root;
    }

    public Node prorderToBST(ArrayList<Integer> preorder) {
        // Write your code here.
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        Index index = new Index(0);
        return preorderToBSTSolver(preorder, min, max, index);
    }


    //** MERGE OF TWO BSTs  -> TC- O(n+m), SC-O(n+m)
    public void mergeLists(ArrayList<Integer> in1, ArrayList<Integer> in2, ArrayList<Integer> merge) {
        int i = 0, j = 0;

        while (i < in1.size() && j < in2.size()) {
            if (in1.get(i) < in2.get(j)) {
                merge.add(in1.get(i));
                i++;
            } else {
                merge.add(in2.get(j));
                j++;
            }
        }
        while (i < in1.size()) {
            merge.add(in1.get(i));
            i++;
        }
        while (j < in2.size()) {
            merge.add(in2.get(j));
            j++;
        }
    }

    public Node mergeTwoBSTs(Node root1, Node root2) {
        // step 1 - find inorder of BSTs
        ArrayList<Integer> in1 = new ArrayList<>();
        ArrayList<Integer> in2 = new ArrayList<>();

        inorderList(root1, in1);
        inorderList(root2, in2);

        // step 2 - Merge two list in single list
        ArrayList<Integer> merge = new ArrayList<>();
        mergeLists(in1, in2, merge);

        // step 3 - convert inorder list to BST

        return inorderToBalancedBST(merge, 0, merge.size() - 1);
    }






    // Optimization of merge of two BST -> TC- O(m+n), SC- O(H1+H2)
    // using double linked list

    /* Steps
       1. Convert each BST into doubly linked list.
       2. Merge 2 doubly linked list
       3. Convert merged doubly linked list to BST
     */

    public void convertBSTToSortedDLL(Node root, DLLNode node)
    {
        // base case
        if(root==null)
        {
            return;
        }
        convertBSTToSortedDLL(root.right, node);

        root.right= node.head;
        if(node.head!=null)
        {
            node.head.left = root;
        }
        node.head= root;

        convertBSTToSortedDLL(root.left, node);
    }

    public Node mergeTwoDLL(Node head1, Node head2)
    {
        Node head= null;
        Node tail= null;

        while(head1!=null && head2!=null)
        {
            if(head1.data < head2.data)
            {
                if(head==null)
                {
                    head=head1;
                    tail=head1;
                }
                else
                {
                    tail.right= head1;
                    head1.left= tail;
                    tail= head1;
                }
                head1= head1.right;
            }
            else
            {
                if(head==null)
                {
                    head=head2;
                    tail=head2;
                }
                else
                {
                    tail.right= head2;
                    head2.left= tail;
                    tail= head2;
                }
                head2= head2.right;
            }
        }

        while(head1!=null)
        {
            tail.right= head1;
            head1.left= tail;
            tail= head1;
            head1 = head1.right;
        }
        while(head2!=null)
        {
            tail.right= head2;
            head2.left= tail;
            tail= head2;
            head2 = head2.right;
        }
        return head;
    }

    int countNodes(Node head)
    {
        int count=0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp= temp.right;
        }

        return count;
    }

    public Node sortedDLLTOBST(DLLNode node, int n)
    {
        // base case
        if(n<=0 || node.head==null)
        {
            return null;
        }

        Node left= sortedDLLTOBST(node, n/2);

        Node root = node.head;

        root.left = left;

        node.head = node.head.right;

        root.right = sortedDLLTOBST(node, n-n/2-1);
        return root;
    }
    public Node mergeTwoBST(Node root1, Node root2)
    {
        // convert BST into sorted DLL in place
        DLLNode node1 = new DLLNode();
        DLLNode node2 = new DLLNode();

        convertBSTToSortedDLL(root1, node1);
        node1.head.left=null;
        convertBSTToSortedDLL(root2, node2);
        node2.head.left=null;

        // merge sorted linked list
        DLLNode mergeHead = new DLLNode();
        mergeHead.head= mergeTwoDLL(node1.head, node2.head);
        int n= countNodes(mergeHead.head);

        return sortedDLLTOBST(mergeHead, countNodes(mergeHead.head));
    }
}