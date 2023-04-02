package utilities;

import Live_Sessions.CountChar_Method;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","html","css","javascript","java"));

        System.out.println(CountChar_Method.countCharInList(list,'a'));
        System.out.println(CountChar_Method.countCharInList(list,'j'));
        System.out.println(CountChar_Method.countCharInList(list,'v'));

    }
}

