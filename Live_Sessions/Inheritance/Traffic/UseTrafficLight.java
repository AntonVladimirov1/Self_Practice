package Live_Sessions.Inheritance.Traffic;

public class UseTrafficLight {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight("red");
        System.out.println(trafficLight.getColor());
        trafficLight.setColor("green");
        System.out.println(trafficLight.getColor());
        System.out.println(trafficLight);

    }
}
