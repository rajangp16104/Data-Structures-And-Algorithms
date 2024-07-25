public class DSA32BasicSortingAlgo4
{
    // This is the java program for descending order counting sort //
    public static void CountingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            largest = Math.max(largest , arr[i]);
            
        }
        int count [] = new int[largest + 1];
        for(int i = 0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }
        // Sorting 
        int j = 0;
        for(int i = count.length - 1; i>=0; i--)
        {
            while(count[i]> 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr [])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr [] = {3,6,2,1,8,7,4,5,3,1};
        CountingSort(arr);
        printArr(arr);
    }
}