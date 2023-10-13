package DSA.Tree;

import java.util.*;
public class TreeClass {

    Scanner sc = new Scanner( System.in);
    // Implementation of binary tree
    public Node createBinaryTree(Node root)
    {
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        root= new Node(data);

        if(data==-1)
        {
            return null;
        }

        System.out.println("Value for left of "+data);
        root.left=createBinaryTree(root.left);

        System.out.println("Value for right of "+data);
        root.right=createBinaryTree(root.right);

        return root;
    }



    // Create tree by Level order
    public Node createTreeByLevelOrder(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        System.out.println("Enter data for root node: ");
        int data = sc.nextInt();
        root=new Node(data);
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp= queue.peek();
            queue.remove();

            System.out.println("Enter data for left node of "+temp.data);
            int leftData= sc.nextInt();
            if(leftData!=-1)
            {
                temp.left=new Node(leftData);
                queue.add(temp.left);
            }

            System.out.println("Enter data for right node of "+temp.data);
            int rightData= sc.nextInt();
            if(rightData!=-1)
            {
                temp.right=new Node(rightData);
                queue.add(temp.right);
            }
        }
        return root;
    }

    // Level Order Traversal
    public void levelOrderTraversal(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp==null)
            {
                System.out.println();
                if(!queue.isEmpty())
                {
                    queue.add(null);
                }
            }
            else
            {
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }

        }
    }


    // Reverse Level Order Traversal
    public void reverseLevelOrderTraversal(Node root)
    {
        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.peek();
            queue.remove();
            stack.push(temp);

            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
        }

        while(!stack.isEmpty())
        {
            Node temp = stack.peek();
            System.out.print(temp.data+" ");
            stack.pop();
        }
    }


    // Inorder Traversal
    public void inorder(Node root)
    {
        if(root==null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    // preorder Traversal
    public void preorder(Node root)
    {
        if(root==null)
            return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    // preorder Traversal
    public void postorder(Node root)
    {
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }



    // Height of binary tree - TC- O(n), SC-O(height) or O(n)
    public int height(Node root)
    {
        // base condition
        if(root==null)
            return 0;

        int leftHeight= height(root.left);
        int rightHeight= height(root.right);

        int ans = Math.max(leftHeight,rightHeight)+1;

        return ans;
    }



    // Leaf node count
    public int countLeaves(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }

        int left = countLeaves(root.left);
        int right = countLeaves(root.right);

        return left+right;
    }

    // Diameter of binary tree - TC- O(n^2)
    public int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int op1 = diameter(root.left);
        int op2 = diameter(root.right);
        int op3 = height(root.left)+height(root.right)+1;

        int res = Math.max(op1,Math.max(op2,op3));

        return res;
    }


    // Diameter of binary tree - (Optimize code) - TC- O(n), SC-O(height) or O(n)
    ArrayList<Integer> arr = new ArrayList<>();
    public ArrayList<Integer> diameterOptimize(Node root)
    {
        // Base case
        if(root==null)
        {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(0);
            a.add(0);
            return a;
        }
        ArrayList<Integer> left = diameterOptimize(root.left);
        ArrayList<Integer> right = diameterOptimize(root.right);

        int op1 = left.get(0);
        int op2 = right.get(0);
        int op3 = left.get(1) + right.get(1) + 1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(Math.max(op1,Math.max(op2,op3)));
        ans.add(Math.max(left.get(1), right.get(1))+1);

        return ans;
    }


    // Check binary tree is balanced or not
    // Balanced tree = height of left subtree and right subtree is not more than one for all nodes
    public boolean isBalanced(Node root)
    {
        // base case
        if(root==null)
        {
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        boolean heightDiff = Math.abs(height(root.left)-height(root.right)) <=1;

        return left && right && heightDiff;
    }



    // check two tree is identical or not
    public boolean isIdentical(Node root1, Node root2)
    {
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null && root2!=null)
        {
            return false;
        }
        if(root1!=null && root2==null)
        {
            return false;
        }

        boolean left = isIdentical(root1.left,root2.left);
        boolean right = isIdentical(root1.right,root2.right);
        boolean current = root1.data==root2.data;

        return left && right && current;
    }

}
