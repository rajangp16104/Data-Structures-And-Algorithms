import java.util.*;
public class DSA332DArraysCreation
{
    public static void main(String args[])
    {
       int matrix[][] = new int[3][3];
       int n = 3, m = 3;
       Scanner sc = new Scanner(System.in);
       for(int i=0; i<n; i++)
       {
          for(int j=0; j<m; j++)
          {
            matrix[i][j] = sc.nextInt();
          }
       }   
       // output 
       for(int i=0; i<n; i++)
       {
         for(int j=0; j<m; j++)
         {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
       }
       sc.close();
    }
}