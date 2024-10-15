public class DSA58StringCompression2
{
    public static String compress(String str)
    {
        // This is java program to compress string using string //
        StringBuilder sb = new StringBuilder("");
        String s = sb.toString();

        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;
            while(i<str.length()- 1  && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
             s = s + sb.append(str.charAt(i));
            if(count > 1)
            {
               s = s + sb.append(count.toString());
            }
        }
        return sb.toString();

    }
    public static void main(String args[])
    {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}