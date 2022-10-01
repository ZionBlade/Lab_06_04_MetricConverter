import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meter = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.print("\nPlease enter your measurement in meters: ");
        if(in.hasNextDouble())
        {
            meter = (in.nextDouble());
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nRun the program again and enter a valid input! " + trash + " Is a bad input!");
            System.exit(0);
        }

        miles = meter / 1609;
        feet = meter * 3.281;
        inches = meter * 39.37;

        System.out.println("");
    }
}