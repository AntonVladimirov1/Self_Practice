package day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="t,t,t,h,h,h,s,s,o,o,s,s,b,b,k,k,k,f,f,k,k";
        String result ="";

        for (int i = 0; i < str.length(); i++) {

            char each =str.charAt(i);

            if (!result.contains(""+each)){
                result += each;
            }
        }
        System.out.println(result);
    }
}
