package day30_Inharitance2.PhoneTask;

public class TestPhones {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("IPhone12","Large",250,"Black");
        System.out.println(iphone);
        Samsung samsung=new Samsung("S21","Large",200,"Gold");
        System.out.println(samsung);
        Nokia nokia=new Nokia("Brick","Small",140,"Pink");
        System.out.println(nokia);
        System.out.println("==========================================================================");

        iphone.call(911);
        iphone.text(911);
        samsung.call(911);
        nokia.call(911);
        System.out.println("===============================================");

        iphone.faceTime(6546);
        samsung.freeze();
        nokia.selfDefense();


    }
}
