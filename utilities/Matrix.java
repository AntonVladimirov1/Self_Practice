package utilities;
//            0    1    2
//          ________________
//        0 | 18 | 9  | 12 |
//          ----------------
//        1 | 36 | -9 | 3  |
//          ----------------
//        2 | 71 | 5  | 16 |
//          ----------------
// You will need to find location (in matrix) of the given number (target).
// Rows (horizontal lines) 0 1 2 ; Columns (vertical lines) 0 1 2
// For example - number 18: location = 0;0

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {18,9,12},
                {36,-9,3},
                {71,5,16}
        };
        int target = 5;
        boolean found = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column]==target) {
                    found = true;
                    System.out.println("Target location = "+row +";"+ column);
                }
            }
        }
        if (found){
            System.out.println("'Success'");
        }else {
            System.err.println("Target not found");
        }
    }
}
