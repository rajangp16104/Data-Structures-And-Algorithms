public class DSA49StringcharAtMethod2
{
    // This is java program to print all Letters of a string using charAt Method //
    public static void printLetters(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String firstName = "Rajan";
        String lastName = "Panchal";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}