import java.util.Scanner;

public class ElectBill {
    public static void main(String[] args) {
        Consumer ob = new Consumer();
        ob.getData();
        ob.calc();
        ob.display();
    }
}

class Consumer {
    Scanner in = new Scanner(System.in);

    int cno;
    String cname, typeofconn;
    double preReading, currReading, unitConsumed, tbill;

    void getData() {
        System.out.print("\n\tEnter consumer number: ");
        cno = in.nextInt();
        in.nextLine();

        System.out.print("\n\tEnter consumer name: ");
        cname = in.nextLine();

        System.out.print("\n\tEnter the type of connection (Domestic/Commercial): ");
        typeofconn = in.nextLine();

        System.out.print("\n\tEnter previous month reading: ");
        preReading = in.nextDouble();

        System.out.print("\n\tEnter current month reading: ");
        currReading = in.nextDouble();
    }

    void calc() {
        unitConsumed = currReading - preReading;

        if (typeofconn.equalsIgnoreCase("Domestic")) {
            if (unitConsumed <= 100)
                tbill = 1 * unitConsumed;
            else if (unitConsumed <= 200)
                tbill = 2.5 * unitConsumed;
            else if (unitConsumed <= 500)
                tbill = 4 * unitConsumed;
            else
                tbill = 6 * unitConsumed;
        } 
        else if (typeofconn.equalsIgnoreCase("Commercial")) {
            if (unitConsumed <= 100)
                tbill = 2 * unitConsumed;
            else if (unitConsumed <= 200)
                tbill = 4.5 * unitConsumed;
            else if (unitConsumed <= 500)
                tbill = 6 * unitConsumed;
            else
                tbill = 7 * unitConsumed;
        } 
        else {
            System.out.println("Invalid connection type.");
        }
    }

    void display() {
        System.out.println("\n\tConsumer Name = " + cname);
        System.out.println("\tUnits Consumed = " + unitConsumed);
        System.out.println("\tTotal Bill = Rs. " + tbill);
    }
}

OUTPUT:

	Enter consumer number: 256

	Enter consumer name: poovi

	Enter the type of connection (Domestic/Commercial): domestic

	Enter previous month reading: 150

	Enter current month reading: 800

	Consumer Name = poovi
	Units Consumed = 650.0
	Total Bill = Rs. 3900.0

	Enter consumer number: 103

	Enter consumer name: Pooja

	Enter the type of connection (Domestic/Commercial): commercial

	Enter previous month reading: 1005

	Enter current month reading: 1300

	Consumer Name = Pooja
	Units Consumed = 295.0
	Total Bill = Rs. 1770.0
