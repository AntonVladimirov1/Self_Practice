package day17_CustomClass;

public class Test_Dog_Objects {
    public static void main(String[] args) {

        Dog_Custom_Class dog1 = new Dog_Custom_Class();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Grey";

        Dog_Custom_Class dog2 = new Dog_Custom_Class();

        dog2.name = "Lucky";
        dog2.breed = "Retriever";
        dog2.gender = 'M';
        dog2.age = 3;
        dog2.size = "Large";
        dog2.color = "Gold";

        Dog_Custom_Class dog3 = new Dog_Custom_Class();
        dog3.setInfo("Kuku","jhgj","kjgkj",'G',5,"kjgk");

        Dog_Custom_Class dog4 = new Dog_Custom_Class();
        dog4.setInfo("Chack","jhgj","jhgj",'J',6,"White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();
        dog2.drink();

    }
}
