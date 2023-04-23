package utilities;

public class Runner {
    public static void main(String[] args) {

        int x=10;
        int y=x++;
        int z=++x;

        int result =x+y+z;

        System.out.println(result);

    }
}
