package DSA.Matrix;

public class Main {

    public static void main(String[] args) {

        MatrixTwoDim matrixTwoDim = new MatrixTwoDim();
        // Print boundary elements of matrix
        int[][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Matrix is ");
        matrixTwoDim.printMatrix(mat,4,4);
        System.out.println("Boundary elements is ");
        matrixTwoDim.printBoundaryElement(mat,4,4);
        System.out.println();


        // Print spiral elements of matrix
        System.out.println("Spiral Matrix is");
        matrixTwoDim.spiralMatrix(mat,4,4);
        System.out.println();


        // Search in a all elements sorted matrix
//        int target = 10;
//        boolean b= matrixTwoDim.searchElement(mat,4,4, target);
//        if(b)
//        {
//            System.out.println("Target element is found");
//        }
//        else
//        {
//            System.out.println("Target element is not found");
//        }



        // Search in a elements of each row and col sorted matrix
        int target = 19;
        int[][] mat1 = {{1,3,7,9},{4,9,13,17},{8,11,19,26},{14,20,35,41}};
        matrixTwoDim.printMatrix(mat1,4,4);
        boolean b= matrixTwoDim.searchElementSortedRow(mat1,4,4, target);
        if(b)
        {
            System.out.println("Target element is found");
        }
        else
        {
            System.out.println("Target element is not found");
        }
    }



    // Rotate By 90 degree
}
