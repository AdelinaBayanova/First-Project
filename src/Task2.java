import java.util.Scanner;
/*
2. Даны радиус круга и сторона квадрата. У какой
фигуры площадь больше?
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите радиус круга");
        int radius = sc.nextInt();
        System.out.println("введите сторону квадрата");
        int side = sc.nextInt();
        sc.close();

        double circle = radius * radius * Math.PI;
        double square = side * side;

        if (circle > square) {
            System.out.println("площадь круга больше площади квадрата");}
            else  System.out.println("площадь квдрата больше площади круга");
    }
}
