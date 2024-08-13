/*
1.	В чемпионате по футболу команде за выигрыш дается 3 очка,
за проигрыш — 0, за ничью — 1. Известно количество очков, полученных
командой за игру. Определить словесный результат игры (выигрыш, проигрыш или ничья).
*/
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество очков");
        int point = sc.nextInt();
        sc.close();
        if (point == 0) {
            System.out.println("проигрыш");
        } else if (point == 1) {
            System.out.println("ничья");
        } else if (point == 3)
            System.out.println("выигрыш");
    }
}



























