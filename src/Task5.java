import java.util.Scanner;

//Даны два числа.Если квадратный корень из второго числа
// меньше первого числа,то увеличить второе число в пять раз.
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число а");
        int a = sc.nextInt();
        System.out.println("введите число b");
        int b = sc.nextInt();
        sc.close();
        if (Math.sqrt(b) < a) {
            b = 5 * b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
//            System.out.printf("a = %d\nb = %d", a, b);

        }
    }
}
