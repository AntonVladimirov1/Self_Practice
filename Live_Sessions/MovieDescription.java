package Live_Sessions;

public class MovieDescription {
    public static void main(String[] args) {

        String genre = "Fantasy";
        int pageLength = 0, profit = 0, sequels = 0, countries = 0;
        boolean isValid = true;

        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            default:
                isValid = false; // changing the boolean to be false when no case is matched
                break;

        }
        if (isValid) {
            String message = "The " + genre + " genre usually has profits of $" + profit + " being sold in " + countries + " different countries. The " + genre + " books often have " + sequels + " sequels with each book roughly being around " + pageLength + " pages.";
            System.out.println(message);
        }else {
            System.out.println("Sorry we don't have information for the " + genre + " genre");
        }
    }
}
