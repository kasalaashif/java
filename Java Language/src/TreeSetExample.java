import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        TreeSet T = new TreeSet(new MyComparator());
        T.add("Ashif");
        T.add("Ashraf");
        T.add("Jeevan");
        System.out.println(T);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String S1= obj1.toString();
        String S2= obj2.toString();
        return S2.compareTo(S1);
    }
}