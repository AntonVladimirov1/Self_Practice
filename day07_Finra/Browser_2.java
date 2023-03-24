package day07_Finra;

public class Browser_2 {
    public static void main(String[] args) {

        String browserName="chrome";

        switch (browserName){
            case "chrome":
                System.out.println(browserName);
                break;
            case "firefox":
                System.out.println (browserName);
                break;
            case "opera":
                System.out.println(browserName);
                break;
            case "safari":
                System.out.println(browserName);
                break;
            case "edge":
                System.out.println(browserName);
                break;
            default:
                System.out.println("Invalid browser");
        }

    }
}
