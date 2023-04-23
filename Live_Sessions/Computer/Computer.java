package Live_Sessions.Computer;

public class Computer {

    public String os;
    protected int memory;
    String brand;
    private boolean hasWiFi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWiFi=" + hasWiFi +
                '}';
    }
}
