package day16_NestedLoop;

public class NestedLoop_FrequencyOfChar {
    public static void main(String[] args) {

        String str ="aaabbccccddeeeeff"; // need to define which char appears twice
        String result =""; // should be "bdf"

        for (int j = 0; j < str.length(); j++) {
            char ch =str.charAt(j);   // each character of the str
            int count =0;
            for (int i = 0; i < str.length(); i++) {  // <= responsible for comparing ch to each chars in the string
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (count == 3 && !result.contains(""+ch)){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
