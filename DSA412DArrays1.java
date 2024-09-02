public class DSA412DArrays1
{
    public static void numberof7sin_matrix(int matrix[][])
    {
        int countof7 = 0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 7)
                {
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is : " + countof7);
    }
    public static void main(String args[])
    {
        int matrix[][] = {{4,7,8},{8,8,7}};
        numberof7sin_matrix(matrix);
    }
}