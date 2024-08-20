package lesson_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число n");
        int n = sc.nextInt();
        sc.close();
        function(n);
    }

    public static void function(int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / i;
//          result = result + 1.0 / i;
        }
        System.out.println("Сумма равна " + result);
    }
}