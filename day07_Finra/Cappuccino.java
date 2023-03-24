package day07_Finra;

public class Cappuccino {
    public static void main(String[] args) {

        String size= "tall";
        String price= "";

             if (size=="tall" || size=="grande" || size== "venti"){
                 if (size=="tall") price= "Price is $3.69\n90 calories";
                 if (size=="grande") price= "Price is $3.99\n120 calories";
                 if (size=="venti") price= "Price is $4.29\n150 calories";
             }else{
                 price= "Invalid size";
             }
        System.out.println("==================");
        System.out.println(price);
        System.out.println("==================");
    }
}
