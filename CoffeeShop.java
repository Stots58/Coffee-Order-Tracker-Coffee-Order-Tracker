public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop
    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder order1 = new CoffeeOrder();
        CoffeeOrder order2 = new CoffeeOrder("Small");
        CoffeeOrder order3 = new CoffeeOrder("Large", "Frapa Cheno");

        // TODO 3: Call describeOrder() on each and print the result
        order1.describeOrder();
        order2.describeOrder();
        order3.describeOrder();

        // TODO 4: Print the total number of orders using
        System.out.println("Total number of orders: " + CoffeeOrder.getTotalOrders());
    }
}

