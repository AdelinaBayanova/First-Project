import java.util.Scanner;

//Даны три вещественных числа a,b,c.Проверить:1.выполняется ли неравенство a<b<c;
// 2.выполняется ли неравенство b>a>c.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число а");
        int a = sc.nextInt();
        System.out.println("введите число b");
        int b = sc.nextInt();
        System.out.println("введите число с");
        int c = sc.nextInt();
        sc.close();
        if ((a < b) && (b < c)) {
            System.out.println("равенство a<b<c выполняется");
        } else if ((b > a) && (a > c)) {
            System.out.println("равенство b>a>c выполняется");
        }
    }
}