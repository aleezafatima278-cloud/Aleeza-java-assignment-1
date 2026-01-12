import java.util.Scanner;

public class Calculatepercentage {
    public static void main(String args[]) {

        Scanner A = new Scanner(System.in);
        System.out.println(" enter the sum of obtained marks");
        Double som = A.nextDouble();
        System.out.println(" enter the sum of maximum marks");
        Double smm = A.nextDouble();
        Double p = som/smm * 100;
        System.out.print("percentage is  ");
        System.out.print(p);
        System.out.print(" % ");
        

    }


}    