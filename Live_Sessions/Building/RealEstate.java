package Live_Sessions.Building;

import java.util.ArrayList;
import java.util.Arrays;

public class RealEstate {
    public static void main(String[] args) {

        House house1 = new House("Somewhere", 1_300_000, 4);
        System.out.println(house1.location);
        System.out.println(house1.numberOfResidents);
        System.out.println(house1.price);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();

        Building building = house1; // upcasting - automatically

        Building house2 = new House("Somewhere else", 500_000, 5);
        System.out.println(house2.location);
        System.out.println(((House) (house2)).numberOfResidents);
        System.out.println(house2.price);
        System.out.println(house2);
        house2.pay();
        ((HasBackyard) house2).mowLawn();

        ArrayList<Building> allBuilding = new ArrayList<>(Arrays.asList(
                house1, house2,
                new OfficeBuilding("africa", 564654, 30),
                new OfficeBuilding("asia", 654_65, 54),
                new House("india", 875, 4)
        ));
        for (Building each : allBuilding) {
            each.pay();
        }
        for (Building each : allBuilding) {
            System.out.println(BuildingUtil.rent(each));
        }
        System.out.println("========================================================");
        Building max = allBuilding.get(0);
        for (Building each : allBuilding) {
            if (each.price > max.price){
                max=each;
            }
        }
        System.out.println(max);
    }
}
