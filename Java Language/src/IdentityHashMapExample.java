import java.util.IdentityHashMap;

public class IdentityHashMapExample
{
    public static void main(String[] args)
    {
        IdentityHashMap h= new IdentityHashMap();
        Integer int1= new Integer(10);
        Integer int2= new Integer(10);
        h.put(int1,"ten");
        h.put(int2,"ten1");
        System.out.println(h);
    }
}

//Note: HashMap uses .equals method to identify duplicates in HashMap {10=ten1}
//Contrary to HashMap, IdentityHashMap uses == operator to identify duplicates.{10=ten, 10=ten1}