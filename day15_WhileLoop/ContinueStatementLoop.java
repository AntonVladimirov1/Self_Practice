package day15_WhileLoop;

public class ContinueStatementLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=11; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==========================");
        for (int i = 1; i <= 5; i++) {
            if (i==2){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==========================");
        for (char i = 'A'; i <='E'; i++) {
              if (i=='B' || i=='D'){
                  continue;
              }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==========================");

        for (int i = 50; i <=100 ; i++) {
            if (i%2 !=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==========================");



    }
}
