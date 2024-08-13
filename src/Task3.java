import java.util.Scanner;
/*
3. Дано двузначное число. Определить : остаток от
деления десятков на единицы, результат деления единиц
на десятки.
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите двухзначное число\n");
        int number = sc.nextInt();
        sc.close();

        int units = number % 10;
        int decimals = number / 10;

        int res1 = decimals % units;
        System.out.println("остаток от деления десятков на единиц равен "+res1);
        double res2 = (double) units / decimals;
        System.out.println("результат деления единиц на десятки равен "+res2);

    }
}
