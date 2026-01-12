import java.util.Scanner;
import java.lang.Math;

public class Circleradius {
    public static void main(String args[]) {
        Scanner R = new Scanner(System.in);
        System.out.println("enter radius of circle");
        Double radius = R.nextDouble();
        Double circumferance = 2*radius*Math.PI;
        Double area = Math.pow(radius, 2)*Math.PI;
        System.out.println("the circumferance of the circle is " + circumferance);
        System.out.println("the area of circle is " + area);

    }
} 