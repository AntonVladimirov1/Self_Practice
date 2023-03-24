package day06_practice;

public class Char_Identity_2 {
    public static void main(String[] args) {

        char ch = '5';

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Number");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Letter");
        } else {
            System.out.println(ch + " is a Special Character");
        }
    }
}
