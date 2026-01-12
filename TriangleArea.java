import java.util.Scanner;
import java.lang.Math;

public class TriangleArea {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of first side");
        Double sideA = input.nextDouble();
        System.out.println("enter length of second side");
        Double sideB = input.nextDouble();
        System.out.println("enter length of third side");
        Double sideC = input.nextDouble();
        Double s = (sideA+sideB+sideC)/2;
        Double B = s*(s-sideA)*(s-sideB)*(s-sideC);
        Double Area = Math.sqrt(B);
        System.out.println("the area of triangle is " + Area);

    }
}