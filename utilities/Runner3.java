package utilities;


   class Runner3 {
     private void print(){
         System.out.println("hello world");
     }

}
   class Main extends Runner3{

   private void print(){
         System.out.println("hello cydeo");
     }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
    }
}


