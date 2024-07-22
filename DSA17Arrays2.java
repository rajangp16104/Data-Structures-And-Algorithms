public class DSA17Arrays2
{
    // This is java program for inverted array search using binary search approach //
    public static int invertedSearch(int [] nums, int target)
    {
        // min will index of minimum element of nums // pivot index //
        int min = minSearch(nums);
        // Find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1])
        {
            return Search(nums,min,nums.length-1,target);
        }
        // Find in the sorted right //
        else
        {
           return Search(nums,0,min,target);
        }
    }
    // binary search to find target in left to right boundary //
    public static int Search(int [] nums,int left,int right,int target)
    {
       int l = left;
       int r = right;
       // System.out.println(left +" " right);//
       int mid = l + (r - l)/2;
       while(l <= r)
       {
        if(nums[mid] == target)
       {
         return mid;
       }
       else if(nums[mid] > target)
       {
          r = mid - 1;
       }
       else
       {
         l = mid + 1;
       }
       }
       return -1;
    }
    // Smallest element index //
    public static int minSearch(int[] nums)
    {
        int left = 0;
        int right = nums.length -1;
        while(left < right)
        {
            int mid = left + (left -right)/2;
            if(mid > 0 && nums[mid -1] > nums[mid])
            {
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
            {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    } 
    public static void main(String args[])
    {
        int nums [] = {4,5,6,7,0,1,2};
        int pos = invertedSearch(nums, 0);
        System.out.println(pos);

    }
 }