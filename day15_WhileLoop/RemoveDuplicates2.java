package day15_WhileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "ssttrriinngggg";
        String result ="";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains(""+str.charAt(i))){
                    continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
