package day24_Date_and_Time;

import day17_CustomClass.Dog_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_IF_FromCollection2 {
    public static void main(String[] args) {

        Dog_Custom_Class[] dogs = {new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog_Custom_Class> smallDogs = new ArrayList<>(Arrays.asList(dogs));
       /* for (Dog_Custom_Class dog : dogs) {
            if (dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }*/
        smallDogs.removeIf(s-> !s.size.equalsIgnoreCase("small"));    // only small size
        System.out.println(smallDogs);

        ArrayList<Dog_Custom_Class> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(old-> old.age >4);                // younger than 4yo
        System.out.println(youngDogs);
        System.out.println("===================================================================================");

        Dog_Custom_Class[] dogs2 = {new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class(), new Dog_Custom_Class()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog_Custom_Class> notSmall =new ArrayList<>(Arrays.asList(dogs2));
        notSmall.removeIf(p ->p.size.equalsIgnoreCase("small"));
        dogs2 =notSmall.toArray(new Dog_Custom_Class[notSmall.size()]); /// to convert back to Array

        System.out.println(Arrays.toString(dogs2));

    }

}
/* 1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops */