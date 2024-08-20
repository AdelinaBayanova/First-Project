package lesson_4;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                array[i][j] = j + 1;
            }
        }

        array[1][2] = -25;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Минимальное значение равно " + min);
        System.out.println("Максимальное значение равно " + max);
    }
}