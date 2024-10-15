public class DSA70Strings
{
    public static void main(String args[])
    {
        // This is java program for ensureCapacity() method of StringBuffer //
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now(16*2)+2=34 i.e(oldcapacity*2)+2
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(50);//now(34*2)+2
        System.out.println(sb.capacity());//now 70
    }
}