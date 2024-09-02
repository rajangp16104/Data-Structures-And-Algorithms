public class DSA382DArraysDiagonalSum2
{
    // This is java program to calculate diagonal sum of 2D array using linear time complexity approach //
    public static int diagonalSum(int matrix[][])
    {
        int sum = 0;
        for(int i=0; i<matrix.length; i++)
        {
            sum += matrix[i][i];
            if( i != matrix.length-1-i)
            {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        diagonalSum(matrix);
    }
}