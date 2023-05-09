package day37_Exceptions.Override_equals_method;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1==pizza2);  // two objects are not equal as ==
        System.out.println(pizza1.equals(pizza2));

        //System.out.println(pizza1.equals("Pizza")); // exception - no such object to compare
                  // not necessary
        Object obj = (Object) new Pizza('S',4,3);

        System.out.println(obj.equals(pizza2));

       // double total =
        System.out.println(((Pizza) obj).calcCost());

    }
}
