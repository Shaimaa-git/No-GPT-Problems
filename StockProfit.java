import java.util.Scanner;

public class StockProfit {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Enter the number of days: ");
        int numberOfDays = scanner.nextInt();

        // Prompt the user to enter the prices for each day
        System.out.print("Enter the stock prices for each day separated by spaces: ");
        int[] stockPrices = new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            stockPrices[i] = scanner.nextInt();
        }

        // Calculate the maximum profit
        int maxProfit = calculateMaxProfit(stockPrices);

        // Display the calculation details
        System.out.println("Calculation Details:");
        System.out.print("Stock Prices: [");
        for (int i = 0; i < stockPrices.length; i++) {
            System.out.print(stockPrices[i]);
            if (i < stockPrices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Formula: maxProfit = sellPrice - buyPrice");
        System.out.println("Maximum Profit: " + maxProfit);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }

    public static int calculateMaxProfit(int[] prices) {
        // Check if the array is empty or has only one element (no profit can be made)
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize variables to track the minimum price and maximum profit
        int buyPrice = prices[0];
        int sellPrice = 0;
        int maxProfit = 0;

        // Iterate through the array to find the minimum price and maximum profit
        for (int i = 1; i < prices.length; i++) {
            // Update the buyPrice if the current price is lower
            buyPrice = Math.min(buyPrice, prices[i]);

            // Update the sellPrice and maxProfit if selling at the current price results in a higher profit
            if (prices[i] - buyPrice > maxProfit) {
                sellPrice = prices[i];
                maxProfit = prices[i] - buyPrice;
            }
        }

        return maxProfit;
    }
}
