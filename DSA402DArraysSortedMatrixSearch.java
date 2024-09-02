public class DSA402DArraysSortedMatrixSearch
{
    // This is staricase search java program using left most bottom corner cell //
    public static boolean staircase_Search(int matrix[][],int key)
    {
        int row = matrix[0].length -1, col = 0;
        while(col < matrix[0].length && row >=0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Found key (" + row + "," +col +")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                row--;
            }
            else{
                col++;
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
        int key = 30;                  
        staircase_Search(matrix,key);
    }
}