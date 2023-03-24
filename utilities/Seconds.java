package utilities;

public class Seconds {
    public static void seconds(int Seconds){
        int hours = Seconds/3600;
        int minutes = (Seconds%3600)/60;
        int seconds = (Seconds%60)/1;
        String result =(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
        System.out.println(result);

        /*System.out.println("===================================");
          System.out.println("Enter hours:");

        int hours1 =input.nextInt();
        System.out.println(hours1*3600+ " seconds");*/
    }
}
