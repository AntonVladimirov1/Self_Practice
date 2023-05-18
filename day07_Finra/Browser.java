package day07_Finra;

public class Browser {
    public static void main(String[] args) {

        String browserName= "Opera";
        String result= "";

        if (browserName.equalsIgnoreCase("Chrome")|| browserName=="Firefox" || browserName=="Opera" || browserName=="Safari" || browserName=="Edge"){
            result= browserName+" browser is selected";
        }else {
            result= "Invalid Browser Name";
        }
        System.out.println(result);
    }
}
