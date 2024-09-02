public class DSA432DArrays3
{
    // This is java program for transpose of a matrix //
    public static void print_Matrix(int matrix[][])
    {
        System.out.println("The Matrix is : ");
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int row = 2, column = 3;
        int matrix[][] ={{2,3,7},{5,6,7}};
        // Display original matrix
        print_Matrix(matrix);
        // Transpose the matrix
        int transpose[][] = new int[column][row];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the transported matrix 
        print_Matrix(transpose);
    }
}