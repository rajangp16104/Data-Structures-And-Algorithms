public class DSA16Arrays1
{
    // Given an integer array nums , return true if any value appears at least twice 
    // in an array , and return false if every element is distinct//
    public static boolean containsDuplicate(int nums[])
    {
        for(int i = 0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int nums [] = {1,2,3,2};
        boolean element = containsDuplicate(nums);
        if(element == false)
        {
            System.out.println("All Elements are unique " + element);
        }
        else 
        {
            System.out.println("Element appears twice in an array " + element);
        }
    }
}    