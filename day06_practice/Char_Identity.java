package day06_practice;

public class Char_Identity {
    public static void main(String[] args) {

        char ch = '5'; // the character to check

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a Letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }
}
