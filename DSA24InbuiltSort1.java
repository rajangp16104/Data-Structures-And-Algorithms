import java.util.Arrays;
public class DSA24InbuiltSort1
{
    // This is a Java Program for increasing order of inbuilt Sort //
    public static void printArr(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr [] = { 5,4,3,2,1};
        Arrays.sort(arr);
        printArr(arr);
    }
}
