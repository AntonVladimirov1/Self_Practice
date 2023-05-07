package Live_Sessions.Abstraction;

public class Bench extends Lifting{

    @Override
    public void perform() {
        System.out.println("Bench pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*5;
    }

    @Override
    public void rackWeight() {
        System.out.println("Racking on top");
    }
}
