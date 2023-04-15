package Live_Sessions.Inheritance;

public class BestBuy {
    String address;
    double grossIncome;
    double expenses;

    static String ceo;
    static String hq;
    static double revenue;

    static {
        System.out.println("Static block running");
        ceo="Corrie Barry";
        hq="Richfield, Minnesota";
        revenue= 51.76;
    }
    {
        System.out.println("Instance block running");
    }

    public BestBuy(String address, double grossIncome, double expenses) {
        System.out.println("Constructor running");
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    void reportProfit(){
        revenue+= grossIncome - expenses;
    }

    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                '}';
    }
}
