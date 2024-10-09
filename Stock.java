    import java.util.ArrayList;
    class Stock {
        private String name;
        private double price;
        private int availableShares;
        public Stock(String name, double price, int availableShares) {
            this.name = name;
            this.price = price;
            this.availableShares = availableShares;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getAvailableShares() {
            return availableShares;
        }

        public void reduceAvailableShares(int quantity) {
            availableShares -= quantity;
        }

        public void increaseAvailableShares(int quantity) {
            availableShares += quantity;
        }
    }
    class User {
        private String name;
        ArrayList<Stock> portfolio;

        public User(String name) {
            this.name = name;
            this.portfolio = new ArrayList<>();
        }

        public void addStock(Stock stock) {
            portfolio.add(stock);
        }

        public void removeStock(Stock stock) {
            portfolio.remove(stock);
        }

        public void displayPortfolio() {
            System.out.println("Your Portfolio:");
            for (Stock stock : portfolio) {
                System.out.println(stock.getName() + " - $" + stock.getPrice());
            }
        }
    }