public class ComparisonBetweenDoubleEqualSSymbolAndequalsMethod
{
    public static void main(String[] args)
    {
        Integer Int1= new Integer(10);
        Integer Int2= new Integer(10);
        System.out.println(Int1==Int2); //Comparison between reference
        System.out.println(Int1.equals(Int2)); // Comparison between value or content
    }
}
