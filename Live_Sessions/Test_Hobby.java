package Live_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_Hobby {
    public static void main(String[] args) {

        Hobby golf =new Hobby("Golf",300,true,false);
        Hobby puzzle =new Hobby("Puzzle",200,false,false);
        Hobby cards =new Hobby("Cards",800);

        ArrayList<Hobby> hobbies =new ArrayList<>();
        hobbies.addAll(Arrays.asList(golf,puzzle,cards));
        hobbies.addAll(Arrays.asList(
                new Hobby("PingPong",150,false,true),
                new Hobby("GangBang",0),
                new Hobby("Swimming",700,false,false)
        ));
        System.out.println(hobbies);
        System.out.println("=====================================================================");

        for (Hobby each : hobbies) {
            each.doIt();
        }
        System.out.println("=====================================================================");

        ArrayList<Hobby> outdoors =new ArrayList<>(hobbies);
        ArrayList<Hobby> requireOthers =new ArrayList<>(hobbies);
        ArrayList<Hobby> highCost =new ArrayList<>(hobbies);
                        //* RemoveIF (some conditions)
        outdoors.removeIf(p->p.isOutdoor);
        requireOthers.removeIf(hobby->hobby.requiresOthers);
        highCost.removeIf(obj->obj.annualCost>500);

        System.out.println(outdoors);
        System.out.println(requireOthers);
        System.out.println(highCost);
        System.out.println("=====================================================================");
             //* Can apply many conditions in RemoveIF
        ArrayList<Hobby> lessThan200_Indoors =new ArrayList<>(hobbies);
        lessThan200_Indoors.removeIf(p->p.annualCost>200 && p.isOutdoor);
        System.out.println(lessThan200_Indoors);



    }

}
