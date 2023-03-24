package day09_If_Switch;

public class TernaryAndSwitch_in_one {
    public static void main(String[] args) {

        int number=100;

        String result1= (number==50 || number==75 || number==100)?
                          (number==50)? "20 crew, 30 passengers"
                        : (number==75)? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"

                : "Invalid";
        System.out.println(result1);

        System.out.println("====================================");

        int num=75;
        String result2= "";

        switch (num){
            case 50: result2= "20 crew, 30 passengers"; break;
            case 75: result2= "25 crew, 50 passengers"; break;
            case 100: result2= "30 crew, 70 passengers"; break;
            default: result2= "Invalid";
        }
        System.out.println(result2);

    }
}
