import java.util.Arrays;
import java.util.Collections;
public class DSA26InbuiltSort3
{
    // This is a Java Program for descending order of Inbuilt Sort //
    public static void printArr(Integer arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer arr [] = {3,2,5,7,9};
        Arrays.sort(arr , Collections.reverseOrder());
        printArr(arr);
    }
}