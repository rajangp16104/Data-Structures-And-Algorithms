import java.util.*;
public class DSA352DArraysLargeAndSmallElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix :");
        int n = sc.nextInt();
        System.out.println("Enter Numbers of the Array\n");
        int matrix[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        int bigg = matrix[0][0],bi=0,bj=0;
        int small = matrix[0][0],si=0,sj=0;
        System.out.println("\n Inputed Array :\n");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++)
        {
            // for finding biggest and smallest no //
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j] > bigg)
                {
                    bigg = matrix[i][j];
                    bi = i; bj = j;
                }
                if(matrix[i][j] < small)
                {
                    small = matrix[i][j];
                    si = i; sj = j;
                }
            }
        }
        System.out.println("\n Biggest Number is : " + bigg + " and it's pos is : " + bi + " ," +bj);
        System.out.println("\n Smallest Number is : " + small + " and it's pos is : " + si + " ," +sj);
        sc.close();
    }
}