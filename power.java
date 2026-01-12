import java.util.Scanner;

public class power {
    public static void main(String args[]) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter the voltage");
        Double voltage = A.nextDouble();
        System.out.println("enter the current");
        Double current = A.nextDouble();
        Double p = voltage * current;
        System.out.println("the power in watts is " + p);
    }

}


