package chapters.three;

// Инициализировать двухмерный массив
public class Matrix {
    public static void main(String[] args) {
        double m[][] = {
                {0*0, 1*0, 2*0, 3*0},
                {0*0, 1*0, 2*0, 3*0},
                {0*0, 1*0, 2*0, 3*0},
                {0*0, 1*0, 2*0, 3*0},
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
