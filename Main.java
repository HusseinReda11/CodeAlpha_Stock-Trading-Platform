import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Stock> stocks = new ArrayList<>();
    public static void main(String[] args) {
        initializeStocks();
        System.out.println("Welcome to the Stock Trading Platform!");
        System.out.print("Enter your name: ");
        String userName = in.nextLine();
        User user = new User(userName);
        int operation = 0;
        while (operation != 4) {
            System.out.println("Choose an operation :");
            System.out.println("1. View Available Stocks");
            System.out.println("2. Buy Stocks");
            System.out.println("3. Sell Stocks");
            System.out.println("4. Exit");

            operation = in.nextInt();

            switch (operation) {
                case 1:
                    viewAvailableStocks();
                    break;
                case 2:
                    buyStocks(user);
                    break;
                case 3:
                    sellStocks(user);
                    break;
                case 4:
                    System.out.println("Thank you for using the Stock Trading Platform!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    private static void initializeStocks() {
        stocks.add(new Stock("Apple", 150.0, 100));
        stocks.add(new Stock("Google", 2800.0, 50));
        stocks.add(new Stock("Amazon", 3400.0, 30));
    }
    private static void viewAvailableStocks() {
        System.out.println("Available Stocks:");
        for (Stock stock : stocks) {
            System.out.println(stock.getName() + " - $" + stock.getPrice() + " (Available: " + stock.getAvailableShares() + ")");
        }
    }

    private static void buyStocks(User user) {
        System.out.print("Enter the stock name to buy: ");
        String stockName = in.next();
        System.out.print("Enter the quantity to buy: ");
        int quantity = in.nextInt();
        for (Stock stock : stocks) {
            if (stock.getName().equalsIgnoreCase(stockName) && stock.getAvailableShares() >= quantity) {
                stock.reduceAvailableShares(quantity);
                user.addStock(stock);
                System.out.println("Successfully bought " + quantity + " shares of " + stockName);
                return;
            }
        }
        System.out.println("Stock not available or insufficient shares!");
    }

    private static void sellStocks(User user) {
        System.out.print("Enter the stock name to sell: ");
        String stockName = in.next();
        for (Stock stock : user.portfolio) {
            if (stock.getName().equalsIgnoreCase(stockName)) {
                System.out.print("Enter the quantity to sell: ");
                int quantity = in.nextInt();
                stock.increaseAvailableShares(quantity);
                user.removeStock(stock);
                System.out.println("Successfully sold " + quantity + " shares of " + stockName);
                return;
            }
        }
        System.out.println("You don't own this stock!");
    }
}