public class DSA65Strings
{
    public static void main(String args[])
    {
        // This is java program for insert() method of StringBuffer //
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);// prints HJavaello
    }
}