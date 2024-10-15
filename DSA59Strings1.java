import java.util.*;
public class DSA59Strings1
{
    public static void main(String args[])
    {
        // This is java program to check number of vowels in String //
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         int count = 0;
         for(int i=0; i<str.length(); i++)
         {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }

         }
         System.out.println("count of vowels is : " + count);
         sc.close();
    }
}