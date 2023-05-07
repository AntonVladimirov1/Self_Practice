package Live_Sessions.Abstraction;

public class Gym {
    public static void main(String[] args) {

       // Exercise obj = new Exercise(); - cannot instantiate abstract classes

        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));

        Bench bench = new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(15));

    }
}
