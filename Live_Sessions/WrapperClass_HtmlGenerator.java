package Live_Sessions;

public class WrapperClass_HtmlGenerator {
    public static void main(String[] args) {

        String input = "div2;html3;button2";

        String[] arrayOfInput = input.split(";");

        for (String eachInput : arrayOfInput) {
            String tagName = getTagFromInput(eachInput);
            String s = eachInput.substring(tagName.length());
            int numberOfTag = Integer.parseInt(s);

            for (int i = 0; i < numberOfTag; i++) {
                System.out.println("<" + tagName + ">" + " </" + tagName + ">");
            }
        }
    }
    public static String getTagFromInput(String eachInput) {
        String tagName = "";
        for (char c : eachInput.toCharArray()) {
            if (!Character.isDigit(c)) {
                tagName += c;
            }
        }
        return tagName;
    }
}
