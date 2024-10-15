public class DSA53StringSubstring
{
    public static String substring(String str,int si, int ei)
    {
        // This is java Program to Print substring of a string //
        String substr = "";
        for(int i=si; i<ei; i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
         String str = "HelloWorld";
         System.out.println(substring(str,0,5));
    }
}