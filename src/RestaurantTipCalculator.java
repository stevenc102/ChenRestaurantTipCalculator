import java.util.Scanner;
import java.text.DecimalFormat;
public class RestaurantTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        // creates objects
        System.out.println("Welcome to the tip calculator!");
        //welcomes the user

        System.out.print("How many people are in your group? ");
        int peopleInGroup = scan.nextInt();
        //stores # of people

        System.out.print("What's the tip percentage? (0 - 100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        // stores tip percentage

        double totalCost = 0;

        double currentItemCost = 0;
        // initializes variables

        while (currentItemCost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g 12.50 (-1 to end): ");
            currentItemCost = scan.nextDouble();
            totalCost += currentItemCost;
        }
        totalCost ++;
        //adds a dollar back for the -1
        //while loop for each item

        double totalTip = (tipPercentage * totalCost) / 100;
        // total tip calculated
        System.out.println("----------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(totalCost));
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + formatter.format(totalTip));
        System.out.println("Total Bill With Tip: " + formatter.format(totalTip + totalCost));
        System.out.println("Per Person Cost Before Tip: " + formatter.format((totalCost / peopleInGroup)));
        System.out.println("Tip Per Person: " + formatter.format((totalTip / peopleInGroup)));
        System.out.println("Total Cost Per Person: " + formatter.format(((totalTip + totalCost) / peopleInGroup)));
        //all the information
    }
}
