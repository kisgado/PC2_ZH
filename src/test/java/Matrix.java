import java.util.ArrayList;

public class Matrix {

    public static int sumOfNumbersDivisibleByFive(int[][] matrix) {
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 5 == 0) {
                    res+=matrix[i][j];
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix) {
        int rows = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int sor = 1;
            int r;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    sor = 0;
                }
            }
            if (sor == 1) {
                result.add(i);
            }
        }
        return result;
    }
}
