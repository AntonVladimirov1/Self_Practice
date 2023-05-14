package Live_Sessions.Exceptions.Bank;

public class MultipleExample {
    public static void main(String[] args) {

        try {

        } catch (StringIndexOutOfBoundsException e) {

        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        // variations:

        try {

        } catch (IndexOutOfBoundsException e) {

        }

        // variation2:

        try {

        } catch (NullPointerException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
