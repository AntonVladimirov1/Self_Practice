package day06_practice;

public class Pizza {
    public static void main(String[] args) {

        String type= "Cheese";
        int slices= 8;
        int people= 3;

        String summary = "We serve " +type+ " pizza of " +slices+ " slices for " +people+ " people,\n" +slices/people+ " slices ate each people, " +slices % people+ " left over.";
        System.out.println("============================================");
        System.out.println(summary);
        System.out.println("============================================");

    }
}
