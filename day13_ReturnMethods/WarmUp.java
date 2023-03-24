package day13_ReturnMethods;

public class WarmUp {
    public static void main(String[] args) {

        calculate(2,2,'%');
        System.out.println("==============================");
        ageGroup(160);
        System.out.println("==============================");
        eligibleToVote(21,true);
    }
    public static void calculate(double num1,double num2,char mathOperator){
        double result =0;
        switch (mathOperator){
            case '+': result =num1+num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1+num2));
                break;
            case '-': result =num1-num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1-num2));
                break;
            case '/': result =num1/num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1/num2));
                break;
            case '*': result =num1*num2;
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+(num1*num2));
                break;
            default:
                System.err.println("Invalid operator: "+mathOperator);
        }

    }

    public static void ageGroup(int age){
        if (age >=0 && age<=150){

            System.out.println((age<21)? "Teenager" :(age<55)? "Adult" : "Senior");

        }else{
            System.out.println("Invalid age: "+age);
        }
    }

    public static void eligibleToVote(int age,boolean isAmerican){
        if (age>=21 && isAmerican){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
    }
}
