package Live_Sessions;

public class Hobby {

    public String name;
    public double annualCost;
    public boolean isOutdoor;
    public boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);     //* dependence on "name" constructor
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoor, boolean requiresOthers) {
        this(name,annualCost);      //* dependence on "name and annualCost"
        this.isOutdoor = isOutdoor;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing " +name+ (isOutdoor? " outside" : " inside"));
    }

    public String toString() {
        return "\nHobby{" +
                "name ='" + name + '\'' +
                ", annualCost =" + annualCost +
                ", isOutdoor =" + isOutdoor +
                ", requiresOthers =" + requiresOthers +
                '}';
    }
}
