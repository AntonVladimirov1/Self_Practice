package day06_practice;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1=30,
                n2=10,
                    n3=30;
        String result="";

        if (n1==n2){
            result= "n1 & n2 are equal";
        } else if (n2==n3) {
            result= "n2 & n3 are equal";
        } else if (n3==n1) {
            result= "n3 & n1 are equal";
        }else {
            result= "none of them are equal";
        }
        System.out.println("======================");
        System.out.println(result);
        System.out.println("======================");


    }
}
