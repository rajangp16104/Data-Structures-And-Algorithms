public class DSA11MaxSubarraySum1BruteForce
{
    // This is java program to print max Subarray Sum ( Brute Force) //
    public static void maxSubarraySum(int numbers [])
    {
        int maxSum = Integer.MIN_VALUE;
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
                }
            }
        }
            System.out.println("Maximum Sum : " + maxSum);   
    }
    public static void main(String args[])
    {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}