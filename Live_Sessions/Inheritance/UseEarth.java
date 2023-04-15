package Live_Sessions.Inheritance;

import java.util.Arrays;

public class UseEarth {
    public static void main(String[] args) {

        // Earth.northAmerica -> how to access the ArrayList
        Earth.northAmerica.add(new Person("James",30));
        Earth.northAmerica.addAll(Arrays.asList(
                new Person("Anna",21),
                new Person("Katya",21)
        ));
        System.out.println(Earth.northAmerica);


    }
}
