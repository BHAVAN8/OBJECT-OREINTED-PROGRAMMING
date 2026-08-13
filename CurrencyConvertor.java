package currency;

import java.util.Scanner;

public class CurrencyConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertInrToEuro() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Euro = " + (inr / 90));
    }

    public void convertEuroToInr() {
        System.out.print("Enter Euro: ");
        double euro = sc.nextDouble();
        System.out.println("INR = " + (euro * 90));
    }

    public void convertInrToDollar() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Dollar = " + (inr / 83));
    }

    public void convertDollarToInr() {
        System.out.print("Enter Dollar: ");
        double dollar = sc.nextDouble();
        System.out.println("INR = " + (dollar * 83));
    }

    public void convertInrToYen() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Yen = " + (inr * 1.75));
    }

    public void convertYenToInr() {
        System.out.print("Enter Yen: ");
        double yen = sc.nextDouble();
        System.out.println("INR = " + (yen / 1.75));
    }
}
