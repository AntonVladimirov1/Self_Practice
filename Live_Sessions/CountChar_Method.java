package Live_Sessions;

import java.util.ArrayList;

public class CountChar_Method {
    public static int countCharInList (ArrayList<String > list, char letter){

        int count = 0;
        for (String eachWord : list) {
            for (char eachLetter : eachWord.toCharArray()){
                if (eachLetter == letter){
                    count++;
                }
            }
        }
        return count;

    }
}
