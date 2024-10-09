# CodeAlpha_Stock-Trading-Platform
1. Stock Class

Attributes:

    name: A String representing the name of the stock (e.g., "AAPL").
    price: A double representing the price of the stock (e.g., 150.0).
    availableShares: An int representing the number of shares available for trading.

Methods:

    Stock(String name, double price, int availableShares): Constructor to initialize a stock object.
    String getName(): Returns the name of the stock.
    double getPrice(): Returns the price of the stock.
    int getAvailableShares(): Returns the number of available shares.
    void reduceAvailableShares(int quantity): Reduces the available shares by the specified quantity.
    void increaseAvailableShares(int quantity): Increases the available shares by the specified quantity.

2. User Class

Attributes:

    name: A String representing the user's name.
    portfolio: An ArrayList<Stock> that holds the stocks owned by the user.

Methods:

    User(String name): Constructor to initialize a user object.
    void addStock(Stock stock): Adds a stock to the user's portfolio.
    void removeStock(Stock stock): Removes a stock from the user's portfolio.
    void displayPortfolio(): Displays the user's current portfolio.

3. StockTradingPlatform Class

Attributes:

    stocks: An ArrayList<Stock> that holds all available stocks in the trading platform.
    scanner: A Scanner object for user input.

Methods:

    public static void main(String[] args): The main method that runs the program.
    private static void initializeStocks(): Initializes the stocks available for trading.
    private static void viewAvailableStocks(): Displays a list of available stocks and their details.
    private static void buyStocks(User user): Allows the user to buy stocks, updating the stock's availability and user's portfolio.
    private static void sellStocks(User user): Allows the user to sell stocks, updating the stock's availability and user's portfolio.
