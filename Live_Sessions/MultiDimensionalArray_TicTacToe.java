package Live_Sessions;

public class MultiDimensionalArray_TicTacToe {
    public static void main(String[] args) {

        // create one two dimensional Array
        // create two variables for counting xxx and ooo in a row
        // compare numbers xxx with ooo
        char[][] gameResult = {

                //1   2   3
                {'x','x','x'},  //0
                {'x','o','o'},  //1
                {'o','x','o'}   //2
        };
        //arrayname  //rownumber  //columnnumber
      //  gameResult    [1]            [1]         = 'A';

        int numberXXX=0;
        int numberOOO=0;

        for (int i = 0; i < gameResult.length; i++) {

            String container = "";
            for (int j = 0; j < gameResult[i].length; j++) {
                container += "" + gameResult[i][j];
            }
            if (container.equals("xxx")) {
                numberXXX++;
            }
            if (container.equals("ooo")) {
                numberOOO++;
            }
        }
        if (numberXXX>numberOOO){
            System.out.println("X won");
        }
        else if (numberOOO>numberXXX){
            System.out.println("O won");
        }else {
            System.out.println("Tie");
        }
    }
}
