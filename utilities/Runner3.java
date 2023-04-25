package utilities;


 class Runner3 {
     public static String name;
     static {
         name="heyo";
     }

     public static void main(String[] args) {
         Runner3 first=new Runner3();
         first.name="yoyo";

         Runner3 second=new Runner3();
         second.name="nono";

         Runner3 third=new Runner3();

         System.out.println(third.name);
         System.out.println(Runner3.name);

     }
}


