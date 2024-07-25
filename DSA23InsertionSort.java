public class DSA23InsertionSort
{
    // This is a Java Program for increasing order of Insertion Sort //
    public static void insertionSort(int arr[])
    {
        for(int i = 1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i - 1;
            // Finding out the correct pos to insert 
            while(prev>=0 && arr[prev] > curr)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }

    }
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
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
        printArr(arr);
    }
}    
