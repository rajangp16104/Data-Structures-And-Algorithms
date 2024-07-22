public class DSA10SubarraysSum
{
    // This is java program to print max And min Sum of Subarrays //
    public static void Subarrayssum(int numbers [])
    {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for(int i = 0 ; i<numbers.length; i++)
        {
            int start = i;
            for(int j = i; j<numbers.length; j++)
            {
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++)
                {
                    currSum = currSum + numbers[k];
                    if(maxSum < currSum)
                    {
                        maxSum = currSum;
                    }
                    if(minSum > currSum)
                    {
                        minSum = currSum;
                    }
                }
            }
        }
        
        System.out.println("Maximum Sum : " + maxSum);
        System.out.println("Minimum Sum : " + minSum);    
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10};
        Subarrayssum(numbers);
    }
}