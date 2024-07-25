import java.util.Arrays;
import java.util.Collections;
public class DSA27InbuiltSort4
{
    // This is java Program for inbuilt sort descending order indexwise //
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
        Arrays.sort(arr , 0 , 3 , Collections.reverseOrder());
        printArr(arr);
    }
}