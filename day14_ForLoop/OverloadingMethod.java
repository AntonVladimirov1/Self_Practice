package day14_ForLoop;

public class OverloadingMethod {
    public static void main(String[] args) {
        System.out.println(sum(10.5,20,30.5,40.9));
    }

    public static double sum(double n1,double n2){

        return n1+n2;
    }
    public static double sum(double n1,double n2,double n3){

        return sum(n1,n2)+n3;
    }
    public static double sum(double n1,double n2,double n3,double n4){

        return  sum(n1,n2)+n3+n4;
    }

}
