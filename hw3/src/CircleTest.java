import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {

        System.out.println("Введите радиус круга");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        System.out.println("Введите цвет круга");
        String ColorCircle = in.next();


        Circle circle = new Circle(radius, ColorCircle);

        System.out.format("Площадь: %f \n", circle.area());
        System.out.format("Периметр: %f\n", circle.perimeter());

        System.out.println(circle);
    }
}