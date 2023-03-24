package utilities;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "hhheeisslmmmaAAaaaaaaaAAaaakkkoeeee";
        String result = "";         // a2b1c3d1
        str = str.toLowerCase();

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i =0; i< str.length(); i++){
                if (str.charAt(i) == ch ){
                    count++;
                }
            }
            if (result.contains(ch+"")){  // to avoid duplication
                continue;
            }
            result+= ch+ "" +count+ " ";
        }
        System.out.println(result);

    }
}
