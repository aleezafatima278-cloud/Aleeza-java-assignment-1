import java.util.Scanner;

public class sellingprice {
    public static void main(String args[]) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter discounted selling price");
        Double dsp = A.nextDouble();
        System.out.println("enter the discount percentage");
        Double dp = A.nextDouble();
        Double originalprice = dsp / (1-(dp / 100));
        System.out.println("the original price is " + originalprice);

    }


}