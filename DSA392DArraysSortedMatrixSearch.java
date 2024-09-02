public class DSA392DArraysSortedMatrixSearch
{
    // This is staricase search java program using right most top corner cell //
    public static boolean staircase_Search(int matrix[][],int key)
    {
        int row = 0, col = matrix.length -1;
        while(row < matrix.length && col>=0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Found key (" + row + "," +col +")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found!");
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;                  
        staircase_Search(matrix,key);
    }
}