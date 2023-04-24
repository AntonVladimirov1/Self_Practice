package Self_Training;

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {18,9,12},
                {36,-9,91},
                {99,33,16}
        };
        int target = 12;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j]==target) {
                    System.out.println(i + ";" + j);
                }
            }
        }
    }
}
