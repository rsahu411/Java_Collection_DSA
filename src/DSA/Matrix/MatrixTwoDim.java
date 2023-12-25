package DSA.Matrix;

public class MatrixTwoDim {


    // Print matrix
    public void printMatrix(int[][] mat, int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }


    // Print boundary elements of matrix
    public void printBoundaryElement(int[][] mat, int row, int col)
    {
        int startRow=0;
        int endRow=row-1;
        int startCol=0;
        int endCol=col-1;

        while(startRow<=endRow && startCol==0)
        {
            // Print first row
            for(int i=startCol; i<=endCol; i++)
            {
                System.out.print(mat[startRow][i]+" ");
            }
            startRow++;

            // Print last column
            for(int i=startRow; i<=endRow; i++)
            {
                System.out.print(mat[i][endCol]+" ");
            }
            endCol--;

            // Print last row
            for(int i=endCol; i>=startCol; i--)
            {
                System.out.print(mat[endRow][i]+" ");
            }
            endRow--;

            // Print first column
            for(int i=endRow; i>=startRow; i--)
            {
                System.out.print(mat[i][startCol]+" ");
            }
            startCol++;
        }
    }


    // Print spiral matrix
    public void spiralMatrix(int[][] mat, int row, int col)
    {
        int startRow=0;
        int endRow=row-1;
        int startCol=0;
        int endCol=col-1;

        int count=0;
        int total=row*col;

        while(count<total)
        {
            // Print first row
            for(int i=startCol; i<=endCol && count<total; i++)
            {
                System.out.print(mat[startRow][i]+" ");
                count++;
            }
            startRow++;

            // Print last column
            for(int i=startRow; i<=endRow && count<total; i++)
            {
                System.out.print(mat[i][endCol]+" ");
                count++;
            }
            endCol--;

            // Print last row
            for(int i=endCol; i>=startCol && count<total; i--)
            {
                System.out.print(mat[endRow][i]+" ");
                count++;
            }
            endRow--;

            // Print first column
            for(int i=endRow; i>=startRow && count<total; i--)
            {
                System.out.print(mat[i][startCol]+" ");
                count++;
            }
            startCol++;
        }
    }


    // Search in a all elements of sorted matrix
    public boolean searchElement(int[][] mat, int row, int col, int target)
    {
        int start=0;
        int end=row*col-1;

        while(start<end)
        {
            int mid = start + (end - start)/2;
            int element = mat[mid/col][mid%col];

            if(element==target)
            {
                return true;
            }
            else if(element<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }



    // Search in a elements of each row and col sorted matrix
    public boolean searchElementSortedRow(int[][] mat, int row, int col, int target)
    {
        int rowIndex=0;
        int colIndex=col-1;

        while(rowIndex<row && colIndex>=0)
        {
            int element = mat[rowIndex][colIndex];

            if(element==target)
            {
                return true;
            }
            else if(element<target)
            {
                rowIndex++;
            }
            else
            {
                colIndex--;
            }
        }
        return false;
    }
}
