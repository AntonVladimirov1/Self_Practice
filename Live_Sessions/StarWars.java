package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class StarWars {
    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>(Arrays.asList("Jedi Yoda","Alliance H","Trooper B","Jedi T","Rebel U","Imperial X"));

        ArrayList<String> jedi_order = new ArrayList<>();
        ArrayList<String> galactic = new ArrayList<>();
        ArrayList<String> alliance = new ArrayList<>();

        for (String each : input) {

            String temp = each.toLowerCase();

            if (temp.contains("jedi")){
                jedi_order.add(each);
            }
            if (temp.contains("imperial")||temp.contains("trooper")||temp.contains("officer")){
                galactic.add(each);
            }
            if (temp.contains("alliance")||temp.contains("rebel")){
                alliance.add(each);
            }
        }
        System.out.println("Jedi: "+jedi_order);
        System.out.println("Gallactic: "+galactic);
        System.out.println("Alliance: "+alliance);

    }
}
