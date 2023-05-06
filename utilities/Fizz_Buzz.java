package utilities;


public class Fizz_Buzz {
       public static void main(String[] args) {

              System.out.println(fizzBuzz(15));
       }

       public static String fizzBuzz(int n) {
              String result = "";

              if(n % 3 == 0){
                     result += "Fizz";
              }
              if(n % 5 == 0){
                     result += "Buzz";
              }
              return (result.isEmpty() ? n : result) + "!";
       }

}



