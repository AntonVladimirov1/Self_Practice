package Live_Sessions;

import java.util.Arrays;

public class Array_Countries {
    public static void main(String[] args) {

        String[] countries = {"cIndia","Ghcjkh","Yhjj","cgcchgj","Cgbhkjhhg"};

        for (String country : countries) {
            System.out.println(country.charAt(0)+" "+country.charAt(country.length()-1));
        }
        System.out.println("===========================================");

        String small = countries[0];
        String large = countries[0];

        for (String each : countries) {
            if (each.length() <small.length()){
                small = each;
            } else if (each.length() > large.length()) {
                large = each;
            }
        }
        System.out.println("smallest: "+small+"\nlargest: "+large);
        System.out.println("=======================================");

        String hasC = "";
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].toLowerCase().startsWith("c")){
                hasC += countries[i] + ", ";
            }
        }
        System.out.println(hasC);
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
    }

}
