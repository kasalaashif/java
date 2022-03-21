import java.util.*;

public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap hashMap= new HashMap();
        hashMap.put("1","one");
        hashMap.put("2","two");
        hashMap.put("3","three");
        System.out.println(hashMap);
        System.out.println(hashMap.put("1", "four"));
        System.out.println(hashMap);
        Set keySet= hashMap.keySet();
        System.out.println(keySet);
        Collection mapValues= hashMap.values();
        System.out.println(mapValues);
        Set entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        Iterator itr= entrySet.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + "..." + entry.getValue());
            if (entry.getKey() == "1") {
                System.out.println(entry.setValue("one"));
            }
        }
        System.out.println(entrySet);
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsKey("4"));
        System.out.println(hashMap.containsValue("one"));
        System.out.println(hashMap.containsValue("four"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.remove("3"));
        System.out.println(hashMap.size());
        hashMap.clear();
        System.out.println(hashMap.isEmpty());
    }
}
