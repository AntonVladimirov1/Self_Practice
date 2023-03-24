package day09_If_Switch;

public class IFandSWITCH {
    public static void main(String[] args) {

        int num=70;

        if (num==50 || num==75 || num==100){

            switch (num){
                case 50:
                    System.out.println("20 crew, 30 passen");break;
                case 75:
                    System.out.println("25 crew, 50 passen");break;
                default:
                    System.out.println("30 crew, 70 passen");
            }
        }else{
            System.out.println("Invalid number");
        }

    }
}
