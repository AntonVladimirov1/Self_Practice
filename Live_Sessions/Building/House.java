package Live_Sessions.Building;

public class House extends Building implements HasBackyard{


    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying for mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the backyard");
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfResidents=" + numberOfResidents +
                "} " + super.toString();
    }
}
