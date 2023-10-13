package DSA.Tree;


public class Main {

    public static void main(String[] args) {


        TreeClass tree = new TreeClass();

        Node root=null;
        root=tree.createBinaryTree(root); // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
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
        System.out.println("Leaf node is ");
        int res= tree.countLeaves(root);
        System.out.println(res);

//        // Diameter of binary tree - max distance between any two nodes
//        System.out.println("Diameter of binary tree");
//        int diameter= tree.diameter(root);
//        System.out.println(diameter);


//        // Check tree is balanced or not
//        System.out.println("Balanced Tree ? ");
//        boolean ans = tree.isBalanced(root);
//        System.out.println(ans);


    }
}
