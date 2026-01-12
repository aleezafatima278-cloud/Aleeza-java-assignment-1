import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your integer ");
        int number = input.nextInt();
        int mod = number % 2;

        if (mod == 1 ) {
            System.out.println("ODD");
        }

        if (mod == 0) {
            System.out.println("EVEN");
        }

    }
}