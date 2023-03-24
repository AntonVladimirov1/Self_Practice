package day07_Finra;

public class Nested_IF {
    public static void main(String[] args) {

        int score = 80;
        String result= "";

        if (score >= 0 && score <= 100) { //"pre condition"- can write first and then insert IF/ELSE body inside of it

            if (score >= 60)
                result = "Passed";
            else
                result = "Failed";

        }else {
            result = "Invalid score";
        }
        System.out.println(result);
      }
    }

