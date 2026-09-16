public class Assignment4_1 
{
    public static void main(String[] args) 
    {
        
        System.out.println("--- PRIMITIVE TO OBJECT (Autoboxing) ---");
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        Integer objectInt = primitiveInt; 
        Double objectDouble = primitiveDouble;
        Character objectChar = primitiveChar;
        System.out.println("Integer Object: " + objectInt);
        System.out.println("Double Object: " + objectDouble);
        System.out.println("Character Object: " + objectChar);        
        System.out.println("\n--- OBJECT TO PRIMITIVE (Unboxing) ---");
        Integer objInt = Integer.valueOf(100);
        Double objDouble = Double.valueOf(99.99);
        Boolean objBoolean = Boolean.TRUE;
        int primitiveInt2 = objInt;
        double primitiveDouble2 = objDouble;
        boolean primitiveBoolean2 = objBoolean;
        System.out.println("Primitive int: " + primitiveInt2);
        System.out.println("Primitive double: " + primitiveDouble2);
        System.out.println("Primitive boolean: " + primitiveBoolean2);
    }
}
