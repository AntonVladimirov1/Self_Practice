package Live_Sessions.Inheritance.Traffic;

public class TrafficLight {

    private String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("green")||color.equalsIgnoreCase("red")||color.equalsIgnoreCase("yellow")){
            this.color=color;
        }
    }

    public String toString() {
        return "TrafficLight{" +
                "color = '" + color + '\'' +
                '}';
    }
}
