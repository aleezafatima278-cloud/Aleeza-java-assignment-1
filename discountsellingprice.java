import java.util.Scanner;

public class discountsellingprice {
    public static void main(String args[]) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter the original cost price");
        Double cp = A.nextDouble();
        System.out.println("enter discount percentage");
        Double dp = A.nextDouble();
        Double discount = dp/100 * cp;
        Double dsp = cp - discount;
        System.out.println("The discount selling price is " + dsp);


    }

}