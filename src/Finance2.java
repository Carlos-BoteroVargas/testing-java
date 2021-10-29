import java.util.Scanner;

public class Finance2 {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println("Your total meal price is $" + groupTotalMealPrice);

        int partySize = 1;
        double individualMealPrice = groupTotalMealPrice / partySize;
        System.out.println("For a party of " + partySize + ", each member needs to contribute: $" + individualMealPrice);
        System.out.println("How many ways should we break this bill into?");

        Scanner scanner = new Scanner(System.in);
        partySize = Integer.parseInt(scanner.next());
        individualMealPrice = groupTotalMealPrice / partySize;
        System.out.println("For a party of " + partySize + ", each member needs to contribute: $" + individualMealPrice);
    }
}
