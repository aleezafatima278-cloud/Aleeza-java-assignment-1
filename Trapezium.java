import java.util.Scanner;

public class Trapezium {
    public static void main(String args[]) {
        Scanner B = new Scanner(System.in);
        System.out.println("enter length of parallel side 1");
        Double a = B.nextDouble();
        System.out.println("enter length of parallel side 2");
        Double b = B.nextDouble();
        System.out.println("enter length of perpendicular height ");
        Double h = B.nextDouble();
        Double area = h * ((a + b) / 2);
        System.out.println("the area of trapezium is " + area);
    }
}