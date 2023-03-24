package day16_NestedLoop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str ="aaccbbbcccc";
        char ch ='c';

        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;
            }

        }
        System.out.println(count);

    }
}
