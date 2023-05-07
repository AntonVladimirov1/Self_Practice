package Live_Sessions.Abstraction;

public final class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
}
