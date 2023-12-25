package DSA.Tree;

import java.util.*;

class Height{
    int h;
}
class Sum{
    int s;
}
class Pair{
    Node first;
    int second;
    Pair(Node first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Index
{
    Integer idx;
    Index(int val)
    {
        this.idx=val;
    }
}
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

        return Math.max(leftHeight,rightHeight)+1;
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

    public int diameterOptimize(Node root,Height height)
    {
        // Base case
        if(root==null)
        {
            height.h=0;
            return 0;
        }

        Height leftHeight= new Height();
        Height rightHeight= new Height();

        int opt1 = diameterOptimize(root.left,leftHeight);
        int opt2 = diameterOptimize(root.right,rightHeight);
        int opt3 = leftHeight.h + rightHeight.h +1;

        height.h = Math.max(leftHeight.h, rightHeight.h)+1;

        return Math.max(opt3,Math.max(opt1,opt2));
    }




    // Check binary tree is symmetric or not
    public boolean isSymmetricSolver(Node root1, Node root2)
    {
        // base case
        if(root1==null && root2==null)
        {
            return true;
        }

        if(root1!=null && root2!=null && root1.data==root2.data)
        {
            // left subtree of left tree and right subtree of right tree have to be mirror images
            // right subtree of left tree and left subtree of right tree have to be mirror images

            return isSymmetricSolver(root1.left,root2.right) && isSymmetricSolver(root1.right, root2.left);
        }

        return false;
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



    // Check balance tree - O(n)
    public boolean isBalancedOptimised(Node root,Height height)
    {
        // base case
        if(root==null)
        {
            height.h=0;
            return true;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        boolean left = isBalancedOptimised(root.left,leftHeight);
        boolean right = isBalancedOptimised(root.right,rightHeight);
        boolean heightDiff = Math.abs(leftHeight.h-rightHeight.h)<=1;

        height.h = Math.max(leftHeight.h,rightHeight.h) + 1;

        if(left && right && heightDiff)
        {
            return true;
        }
        return false;
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



    // Sum Tree - root.data == root.left.data + root.right.data for all nodes except leaf nodes
    public boolean isSumTree(Node root, Sum sum)
    {
        // base case
        if(root == null)
        {
            sum.s=0;
            return true;
        }

        // for leaf nodes
        if(root.left==null && root.right==null) {
            sum.s = root.data;
            return true;
        }

        Sum leftSum = new Sum();
        Sum rightSum = new Sum();

        boolean left = isSumTree(root.left,leftSum);
        boolean right = isSumTree(root.right,rightSum);
        boolean sumCheck = root.data == leftSum.s + rightSum.s;

        if(left && right && sumCheck)
        {
            sum.s = root.data + leftSum.s + rightSum.s;
            return true;
        }

        return false;
    }




    // ZigZag Traversal or spiral traversal
    public ArrayList<Integer> zigZagTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        if(root==null)
        {
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean leftToRight = true;       // to check elements are add left to right or right to left

        while(!queue.isEmpty())
        {
            int size = queue.size();

            ArrayList<Integer> eachLevelElement = new ArrayList<>();

            for(int i=0; i<size; i++)
            {
                Node curr = queue.peek();
                queue.remove();

                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }

                eachLevelElement.add(curr.data);
            }

            if(!leftToRight)
            {
                Collections.reverse(eachLevelElement);
            }

            ans.addAll(eachLevelElement); // store the ans in the arraylist

            leftToRight = !leftToRight;
        }
        return ans;
    }






    // Boundary Traversal of tree
    public void traverseLeft(Node root, ArrayList<Integer> ans)
    {
        // base condition
        if(root==null)
            return;
        // exclude leaf node
        if(root.left==null && root.right==null)
        {
            return;
        }
        ans.add(root.data);
        // if left node exist
        if(root.left!=null)
            traverseLeft(root.left,ans);
        else
            traverseLeft(root.right,ans);
    }

    public void traverseLeaf(Node root, ArrayList<Integer> ans)
    {
        // base case
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            ans.add(root.data);
            return;
        }
        traverseLeaf(root.left,ans);
        traverseLeaf(root.right,ans);
    }

    public void traverseRight(Node root, ArrayList<Integer> ans)
    {
        // base condition
        if(root==null)
            return;
        // exclude leaf node
        if(root.left==null && root.right==null)
        {
            return;
        }
        // if left node exist
        if(root.right!=null)
            traverseLeft(root.right,ans);
        else
            traverseLeft(root.left,ans);

        ans.add(root.data);
    }
    public ArrayList<Integer> boundaryTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        // print root data
        ans.add(root.data);

        // traverse left subtree
        traverseLeft(root.left,ans);

        // traverse leaf nodes- both left and right subtree
        traverseLeaf(root.left,ans);
        traverseLeaf(root.right,ans);

        // traverse right subtree in reverse order
        traverseRight(root.right,ans);

        return ans;
    }




    // Vertical traversal of tree=
    public ArrayList<Integer> verticalOrderTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }

        HashMap<Integer,ArrayList<Integer> > map = new HashMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));  // node: root, and hd=0

        int minDistance=0, maxDistance=0;

        while(!queue.isEmpty())
        {
            Pair temp = queue.peek();
            queue.remove();

            Node curr = temp.first;
            int hd = temp.second;

            // key is not present in map, create new list
            if(!map.containsKey(hd))
            {
                map.put(hd,new ArrayList<>());
            }

            // if key is absent in map, add data in 'hd' key
            map.get(hd).add(curr.data);

            // if left is not null
            if(curr.left!=null)
            {
                queue.add(new Pair(curr.left,hd-1));
            }
            // if right is not null
            if(curr.right!=null)
            {
                queue.add(new Pair(curr.right,hd+1));
            }

            // check minimum and maximum distance with hd
            if(minDistance > hd)
                minDistance = hd;
            if(maxDistance < hd)
                maxDistance = hd;
        }

        for(int i=minDistance; i<=maxDistance; i++)
        {
            ArrayList<Integer> mapList = map.get(i);
            ans.addAll(mapList);
        }

        return ans;
    }




    // Top View of tree
    public ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));

        int minDist=0, maxDist=0;
        while(!queue.isEmpty())
        {
            Pair temp = queue.peek();
            queue.remove();

            Node curr= temp.first;
            int hd= temp.second;

            // add data first time at a distance into map
            if(!map.containsKey(hd))
            {
                map.put(hd, curr.data);
            }

            if(curr.left!=null)
            {
                queue.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null)
            {
                queue.add(new Pair(curr.right,hd+1));
            }

            if(minDist > hd)
            {
                minDist=hd;
            }
            if(maxDist < hd)
            {
                maxDist=hd;
            }
        }

        for(int i=minDist; i<=maxDist; i++)
        {
            ans.add(map.get(i));
        }
        return ans;
    }



    // Bottom view of tree
    public ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }

        // add data into the map and update it every time
        HashMap<Integer,Integer> map = new HashMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));

        int minDist=0, maxDist=0;
        while(!queue.isEmpty())
        {
            Pair temp = queue.peek();
            queue.remove();

            Node curr= temp.first;
            int hd= temp.second;

            map.put(hd, curr.data);

            if(curr.left!=null)
            {
                queue.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null)
            {
                queue.add(new Pair(curr.right,hd+1));
            }

            if(minDist > hd)
            {
                minDist=hd;
            }
            if(maxDist < hd)
            {
                maxDist=hd;
            }
        }

        for(int i=minDist; i<=maxDist; i++)
        {
            ans.add(map.get(i));
        }
        return ans;
    }




    // Left View of tree
    public void leftView(Node root, ArrayList<Integer> ans, int level)
    {
        // base case
        if(root==null)
        {
            return;
        }

        // store 1st value of each value
        if(level==ans.size())
        {
            ans.add(root.data);
        }

        leftView(root.left,ans,level+1);
        leftView(root.right,ans,level+1);
    }




    // Right view of tree
    public void rightView(Node root, ArrayList<Integer> ans, int level)
    {
        // base case
        if(root==null)
        {
            return;
        }

        // store 1st value of each value
        if(level==ans.size())
        {
            ans.add(root.data);
        }

        // store 1st value from right side
        rightView(root.right,ans,level+1);
        rightView(root.left,ans,level+1);
    }



    // Sum of nodes on the longest path from root to leaf node
    public void longestPathSumFind(Node root, int length, int sum, ArrayList<Integer> ans)
    {
        // base case
        if(root==null)
        {
            int maxLen=ans.get(0);
            if(maxLen<length)
            {
                ans.set(0,length);
                ans.set(1,sum);
            }
            else if(maxLen==length)
            {
                int maxSum = Math.max(ans.get(1),sum);
                ans.set(1,maxSum);
            }
            return ;
        }

        sum = sum + root.data;

        longestPathSumFind(root.left, length+1, sum, ans);
        longestPathSumFind(root.right, length+1, sum, ans);
    }

    public int longestPathSum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);   // for maximum length
        ans.add(1);   // for maximum sum

        int length=0;
        int sum=0;
        longestPathSumFind(root,length,sum,ans);
        return ans.get(1);
    }



    // Count k sum path
    public void sumKSolver(Node root, int k, ArrayList<Integer> count, ArrayList<Integer> path)
    {
        // base case
        if(root==null)
        {
            return;
        }

        path.add(root.data);

        //left
        sumKSolver(root.left,k,count,path);
        // right
        sumKSolver(root.right,k,count,path);

        int sum=0;
        int size=path.size();
        for(int i=size-1;i>=0;i--)
        {
            sum+=path.get(i);
            if(sum==k)
            {
                count.set(0,count.get(0)+1);
            }
        }
        path.remove(size-1);
    }
    public int sumK(Node root,int k)
    {
        // code here
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<Integer> count= new ArrayList<>();
        count.add(0);

        sumKSolver(root,k,count,path);

        return count.get(0);
    }





    //  Build a tree from inorder and preorder

    public int findPosition(int[] in, int n, int element, int inorderStart, int inorderEnd)
    {
        for(int i=0; i<n; i++)
        {
            // inorder start and end for duplicate value in inorder
            if(in[i]==element && i>=inorderStart && i<=inorderEnd)
                return i;
        }
        return -1;
    }
    public Node buildTreeByInorderAndPreOrderSolver(int[] in, int[] pre, Index preorderIndex, int inorderStart,
                                int inorderEnd, int n)
    {
        // base case
        if(preorderIndex.idx >= n || inorderStart > inorderEnd) // traverse all nodes of pre and in
        {
            return null;
        }

        // 1. create node by using preorder
        // 2. find the position of preorder node in inorder
        // 3. break inorder in left and right
        // 4. left-inorderStart to position-1, right-position+1 to inorderEnd

        int element = pre[preorderIndex.idx];
        preorderIndex.idx++;
        Node root = new Node(element);
        int position = findPosition(in, n, element, inorderStart, inorderEnd);

        // call left of root
        root.left = buildTreeByInorderAndPreOrderSolver(in, pre, preorderIndex, inorderStart, position-1, n);

        // call right of root
        root.right = buildTreeByInorderAndPreOrderSolver(in, pre, preorderIndex, position+1, inorderEnd, n);

        return root;
    }
    public Node buildTreeByInorderAndPreOrder(int[] inorder, int[] preorder, int n)
    {
        Index preorderIndex = new Index(0);
        int inorderStart=0;
        int inOrderEnd= n-1;

        Node root = buildTreeByInorderAndPreOrderSolver(inorder, preorder, preorderIndex, inorderStart, inOrderEnd, n);

        return root;
    }





    // Build a tree from inorder and postorder
    public Node buildTreeByInorderAndPostOrderSolver(int[] in, int[] post, Index postorderIndex,
                                                     int inorderStart, int inorderEnd, int n)
    {
        // base case
        if(postorderIndex.idx < 0 || inorderStart > inorderEnd)
        {
            return null;
        }

        // 1. create node by using postorder
        // 2. find the position of postorder node in inorder
        // 3. break inorder in left and right
        // 4. left-inorderStart to position-1, right-position+1 to inorderEnd

        int element = post[postorderIndex.idx];
        postorderIndex.idx--;
        Node root = new Node(element);
        int position = findPosition(in, n, element, inorderStart, inorderEnd);

        // call right of root
        root.right= buildTreeByInorderAndPostOrderSolver(in, post, postorderIndex, position+1, inorderEnd, n);

        // call left of root
        root.left= buildTreeByInorderAndPostOrderSolver(in, post, postorderIndex, inorderStart, position-1, n);

        return root;
    }
    public Node buildTreeByInorderAndPostOrder(int[] inorder, int[] postorder, int n)
    {
        Index postorderIndex = new Index(n-1);
        int inorderStart = 0;
        int inorderEnd = n-1;

        Node root= buildTreeByInorderAndPostOrderSolver(inorder, postorder, postorderIndex, inorderStart, inorderEnd, n);
        return root;
    }




    // Burn a tree
    public Node createParentMapping(Node root, int target, HashMap<Node,Node> nodeToParent)
    {
        Node res= null;
        Queue<Node> queue = new LinkedList();

        queue.add(root);
        nodeToParent.put(root,null);

        while(!queue.isEmpty())
        {
            Node front = queue.peek();
            queue.remove();

            if(front.data == target)
            {
                res= front;
            }

            if(front.left!=null)
            {
                nodeToParent.put(front.left,front);
                queue.add(front.left);
            }

            if(front.right!=null)
            {
                nodeToParent.put(front.right,front);
                queue.add(front.right);
            }
        }
        return res;
    }

    public int burnTree(Node root, HashMap<Node,Node> nodeToParent)
    {
        HashMap<Node,Boolean> visited = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        visited.put(root,true);

        int ans=0;

        while(!queue.isEmpty())
        {
            boolean flag=false;
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                Node front= queue.peek();
                queue.remove();

                // processing neighbour node

                if(front.left!=null && !visited.get(front.left))
                {
                    flag=true;
                    queue.add(front.left);
                    visited.put(front.left,true);
                }

                if(front.right!=null && !visited.get(front.right))
                {
                    flag=true;
                    queue.add(front.right);
                    visited.put(front.right,true);
                }

                if(nodeToParent.get(front)!=null && !visited.get(nodeToParent.get(front)))
                {
                    flag=true;
                    queue.add(nodeToParent.get(front));
                    visited.put(nodeToParent.get(front),true);
                }
            }
            if(flag)
            {
                ans++;
            }
        }
        return ans;
    }

    public int minTime(Node root, int target)
    {
        // Your code goes here
        HashMap<Node, Node> nodeToParent = new HashMap<>();
        Node targetNode = createParentMapping(root,target,nodeToParent);

        // for(Map.Entry<Node,Node> entry: nodeToParent.entrySet())
        // {
        //     if(entry.getValue()!=null)
        //     System.out.println(entry.getKey().data+" "+entry.getValue().data);
        // }
        int ans = burnTree(targetNode, nodeToParent);
        return ans;
    }




    // Morris traversal




    // Flatten a binary tree to linked list
    public void flatten(Node root)
    {
        Node current = root;

        while(current!=null)
        {
            // if left exist
            if(current.left != null)
            {
                Node prev = current.left;
                while(prev.right != null)
                {
                    prev = prev.right;
                }

                // connect predecessor node to current right (eg: root.right)
                prev.right = current.right;

                // connect current right to left of current
                current.right = current.left;

                // make left part of current null
                current.left=null;
            }
            current = current.right;
        }

    }
}
