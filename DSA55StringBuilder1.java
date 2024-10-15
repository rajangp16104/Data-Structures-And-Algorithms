public class DSA55StringBuilder1
{
    public static void main(String args[])
    {
        // This is java program to for String Builder //
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}