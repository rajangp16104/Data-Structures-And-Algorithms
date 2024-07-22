public class DSA4ArrayLinearSearch2
{
    // This is program for linear search array // using Strings //
    public static boolean LinearSearch(String menu[],String item)
    {
        for(int i = 0; i<menu.length; i++)
        {
            if(menu[i] == item)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String menu[] = {"apple","banana","mango","samosa", "chole bhature",};
        String item = "samosa";
        boolean index = LinearSearch(menu, item);
        if(index == false)
        {
            System.out.println("Not Found");
                
        }
        else
        {
            
            System.out.println("Available at index " + index);
        }
        
        
    }
}