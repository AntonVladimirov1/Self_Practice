package utilities;

public class Find_Hi {

    public static int countHi(String str){ // how many times "hi" in the string

        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) =='h' && str.charAt(i+1) == 'i'){
                count++;
            }
        }
        return count;
    }
}
