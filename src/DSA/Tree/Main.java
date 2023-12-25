package DSA.Tree;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        TreeClass tree = new TreeClass();

//        Node root=null;
//        root=tree.createBinaryTree(root); // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
//
//        System.out.println("Inorder Traversal");
//        tree.inorder(root);
//        System.out.println();
//
//        System.out.println("Preorder Traversal");
//        tree.preorder(root);
//        System.out.println();
//
//        System.out.println("Postorder Traversal");
//        tree.postorder(root);
//        System.out.println();
//
//        System.out.println("Level Order Traversal");
//        tree.levelOrderTraversal(root);
//        System.out.println();
//
//        System.out.println("Reverse Level Order Traversal");
//        tree.reverseLevelOrderTraversal(root);
//        System.out.println();

//        root=tree.createTreeByLevelOrder(root);
//        System.out.println("Level Order Traversal");
//        tree.levelOrderTraversal(root);
//        System.out.println();


//        // Height of binary tree
//        System.out.println("Height of binary tree: ");
//        int height= tree.height(root);
//        System.out.println(height);


        // Leaf node count
//        System.out.println("Leaf node is ");
//        int res= tree.countLeaves(root);
//        System.out.println(res);

//        // Diameter of binary tree - max distance between any two nodes
//        System.out.println("Diameter of binary tree");
//        int diameter= tree.diameter(root);
//        System.out.println(diameter);


        // Optimized Diameter of binary tree - max distance between any two nodes
//        System.out.println("Diameter of binary tree");
//        Height height = new Height();
//        int diameter= tree.diameterOptimize(root,height);
//        System.out.println(diameter);


//        // Check tree is balanced or not
//        System.out.println("Balanced Tree ? ");
//        boolean ans = tree.isBalanced(root);
//        System.out.println(ans);



        // Check tree is balanced or not - optimised
//        System.out.println("Balanced Tree ? ");
//        Height height = new Height();
//        boolean ans = tree.isBalancedOptimised(root,height);
//        System.out.println(ans);



        // Sum tree
//        System.out.println("Node data is sum of left tree & right tree");
//        Sum sum = new Sum();
//        boolean ans = tree.isSumTree(root,sum);
//        System.out.println(ans);



        // ZigZag or spiral traversal
//        System.out.println("ZigZag traversal is");
//        ArrayList<Integer> ans = new ArrayList<>();
//        ans= tree.zigZagTraversal(root);
//        ans.forEach(item-> System.out.print(item+" "));


        // Boundary Traversal
//        System.out.println("Boundary traversal is "); // root - 1 2 4 -1 -1 5 8 -1 -1 9 -1 -1 3 6 -1 -1 7 -1 -1
//        ArrayList<Integer> ans = new ArrayList<>();
//        ans= tree.boundaryTraversal(root);
//        ans.forEach(item-> System.out.print(item+" "));



        // Vertical traversal of tree
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println("Vertical Order traversal is");   //root - 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 8 -1 -1 9 -1 -1
//        ans = tree.verticalOrderTraversal(root);
//        ans.forEach(item-> System.out.print(item+" "));




        // Top view of tree
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println("Top view of tree is");   //root - 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 8 -1 -1 9 -1 -1
//        ans = tree.topView(root);
//        ans.forEach(item-> System.out.print(item+" "));



        // Bottom view of tree
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println("Bottom view of tree is");   //root - 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 8 -1 -1 9 -1 -1
//        ans = tree.bottomView(root);
//        ans.forEach(item-> System.out.print(item+" "));



        // Left view of Tree
//        ArrayList<Integer> ans = new ArrayList<>();
//        int level=0;
//        tree.leftView(root,ans,level);
//        System.out.println("Left view of tree is")
//        for(Integer item: ans)
//        {
//            System.out.print(item+" ");
//        }



        // Right view of tree
//        ArrayList<Integer> ans = new ArrayList<>();
//        int level=0;
//        tree.rightView(root,ans,level);
//        for(Integer item: ans)
//        {
//            System.out.print(item+" ");
//        }



        // Sum of nodes on the longest path from root to leaf node
//        System.out.println("Sum of nodes on the longest path from root to leaf node");
//        int ans = tree.longestPathSum(root);           // root - 4 2 7 -1 -1 1 6 -1 -1 -1 5 2 -1 -1 3 -1 -1
//        System.out.println(ans);



        // Count k sum paths
//        int k = 3;                       // root - 1 3 2 -1 -1 1 1 -1 -1 -1 0 4 1 -1 -1 2 -1 -1 5 -1 6 -1 -1
//        int count = tree.sumK(root,k);
//        System.out.println("Number of k sum path is");
//        System.out.println(count);




        //  Build a tree from inorder and preorder
//        int[] inorder = {7,3,11,1,17,3,18};
//        int[] preorder = {1,3,7,11,3,17,18};
//        int n= 7;
//        Node node = tree.buildTreeByInorderAndPreOrder(inorder,preorder,n);
//        System.out.println("Post order traversal of tree build using inorder and preorder");
//        tree.postorder(node);




        //  Build a tree from inorder and postorder
//        int[] inorder = {4,8,2,5,1,6,3,7};
//        int[] postorder = {8,4,5,2,6,7,3,1};
//        int n= 8;
//        Node node = tree.buildTreeByInorderAndPostOrder(inorder,postorder,n);
//        System.out.println("Pre order traversal of tree build using inorder and postorder");
//        tree.preorder(node);



//        // Burn a tree
//        int target = 8;                             // root- 1 2 4 -1 -1 5 7 -1 -1 8 -1 -1 3 -1 6 -1 9 -1 10 -1 -1
//        int ans = tree.minTime(root, target);
//        System.out.println("Minimum time to burn a tree is");
//        System.out.println(ans);



        // Flatten binary tree to linked list
//        tree.flatten(root);
//        tree.inorder(root);






        // ** Binary Search Tree **
        BinarySearchTree bst = new BinarySearchTree();
//
//        Node root = null;                     // root- 10 8 21 7 27 5 4 3 -1
//        root = bst.buildBST(root);
////
//        System.out.println("Level Order Traversal");
//        bst.levelOrderTraversal(root);
//        System.out.println();
//
//        System.out.println("InOrder Traversal");
//        bst.inorderTraversal(root);
//        System.out.println();
//
//        System.out.println("PreOrder Traversal");
//        bst.preorderTraversal(root);
//        System.out.println();
//
//        System.out.println("Postorder Traversal");
//        bst.postorderTraversal(root);
//        System.out.println();



        // Search in BST
//        int target = 9;
//        boolean ans = bst.searchInBST(root,target);
//        System.out.println("Target element is exist");
//        System.out.println(ans);


        // Method-2 Iterative
//        int target = 3;
//        boolean ans = bst.searchInBSTIterative(root,target);
//        System.out.println("Target element is exist");
//        System.out.println(ans);




        // Minimum value in BST
//        Node min = bst.minimumValue(root);
//        System.out.println("Minimum value in BST");
//        System.out.println(min.data);



        // Maximum value in BST
//        Node max = bst.maximumValue(root);
//        System.out.println("Maximum value in BST");
//        System.out.println(max.data);



        // Delete from BST
//        int value = 15;
//        Node root1 = bst.deleteFromBST(root,value);

//        System.out.println("Level Order Traversal");
//        bst.levelOrderTraversal(root1);
//        System.out.println();

//        System.out.println("InOrder Traversal");
//        bst.inorderTraversal(root1);
//        System.out.println();




        // Check tree is BST or not
//        boolean ans = bst.checkBST(root);
//        System.out.println("Check tree is binary search tree");
//        System.out.println(ans);



        // Kth minimum Node in BST
//        int k = 5;
//        int kthMin = bst.kthMinimumTree(root, k);
//        System.out.println("Kth minimum node in BST");
//        System.out.println(kthMin);




        // Kth maximum Node in BST
//        int kthMax = bst.kthMaximumTree(root, k);
//        System.out.println("Kth maximum node in BST");
//        System.out.println(kthMax);




        // Find successor in right tree which is minimum value
//        ArrayList<Integer> ans = new ArrayList<>();
//        int key = 7;
//        ans = bst.predecessorAndSuccessor(root, key);
//        System.out.println("Predecessor is "+ans.get(0));
//        System.out.println("Successor is "+ans.get(1));




        // LCA in a BST
//        Node child1 = new Node(5);
//        Node child2 = new Node(27);
//        root = bst.LCAinaBST(root, child1, child2);
//        System.out.println("LCA in a BST is "+ root.data);



        // Sum of two nodes in BST is equal to target value
//        int target = 31;
//        boolean ans = bst.twoSumInBST(root,target);
//        System.out.println("Sum of two nodes is equal target value ");
//        System.out.println(ans);




        // Flatten to a sorted list
//        Node ans = bst.flatten(root);
//        System.out.println("Flatten to a sorted list");
//        bst.printList(ans);





        // Normal BST to balanced BST
//        Node balanced = bst.normalBSTToBalancedBST(root);
//        bst.levelOrderTraversal(balanced);




        // Merge two BSTs
//        Node root1 = null;             // 5 3 2 4 6 -1
//        root1 = bst.buildBST(root1);
//        System.out.println("Level Order Traversal of 1st BST");
//        bst.levelOrderTraversal(root1);
//        System.out.println();
//
//        Node root2 = null;            // 2 1 3 7 6 -1
//        root2 = bst.buildBST(root2);
//        System.out.println("Level Order Traversal of 2nd BST");
//        bst.levelOrderTraversal(root2);
//        System.out.println();
//
//        Node ansRoot = bst.mergeTwoBSTs(root1, root2);
//        System.out.println("Level Order Traversal of merge BSTs");
//        bst.levelOrderTraversal(ansRoot);
//        System.out.println();
//
//        System.out.println("InOrder Traversal");
//        bst.inorderTraversal(ansRoot);
//        System.out.println();




        // Optimised merge two BSTs
        Node root1 = null;             // 5 3 2 4 6 -1
        root1 = bst.buildBST(root1);
        System.out.println("Level Order Traversal of 1st BST");
        bst.levelOrderTraversal(root1);
        System.out.println();

        Node root2 = null;            // 2 1 3 7 6 -1
        root2 = bst.buildBST(root2);
        System.out.println("Level Order Traversal of 2nd BST");
        bst.levelOrderTraversal(root2);
        System.out.println();

        Node ansRoot= bst.mergeTwoBST(root1, root2);
        System.out.println("Level Order Traversal of merge BSTs");
        bst.levelOrderTraversal(ansRoot);
        System.out.println();

        System.out.println("InOrder Traversal");
        bst.inorderTraversal(ansRoot);
        System.out.println();
    }
}
