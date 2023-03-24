package day14_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        int sum =0;

        for (int i=1; i<=100; i++){ // sum of each number from 1 to 100
            sum +=i;
        }
        System.out.println(sum);
        System.out.println("================");

        for (char i='A'; i<='Z'; i++){ // print each alphabet letters A - Z
            System.out.print(i +" ");

        }
        System.out.println();
        System.out.println("================");

        for (char i='Z'; i>='A';i--){  // print each alphabet letters Z - A (backward)
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
