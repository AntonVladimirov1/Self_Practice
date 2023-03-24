package Live_Sessions;

public class Lesson_1 {
    public static void main(String[] args) {

       //SWITCH:
        String genre= "Action";
        int pageLength=0, profit=0, sequels=0,countries=0;

        switch (genre){
            case "Fantasy":
                pageLength= 500;
                profit= 150_000;
                sequels= 2;
                countries= 30;
                break;
            case "Comedy":
                pageLength= 600;
                profit= 250_000;
                sequels= 5;
                countries= 50;
                break;
                // can add more cases
            default:
                System.out.println("Sorry, we don't have info for  "+genre+" genre");
                //then it will print all values=0 (see Lesson_2 for correct approach!

        }
        String message= "The "+ genre+" genre have pages "+pageLength+" and profit "+profit+" and sequels "+sequels+" and countries "+countries;
        System.out.println(message);

    }
}
