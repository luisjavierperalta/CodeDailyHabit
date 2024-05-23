package exceptionhandling;

public class OrderProcessor {
    //Method Declaration with "Throws" Clause
    public void processOrder(Order order) throws InsufficientFundsException, ItemOutOfStockExeception {
        if (!hasSufficientFunds(order)) {
            //Throw Exception within method body
            throw new InsufficientFundsException("Insufficient Funds for order:" + order.getId());
        }

        if (!isItemInStock(order)) {
            throw new ItemOutOfStockExeception("Item out of stock:"+ order.getItemId());
        }

        //CODE FOR PROCESSING ORDER
    }

    //Method to check if sufficient funds available
    private boolean hasSufficientFunds(Order order) {
        //Logic to check if sufficient funds available
        return true; //Place holder return, required actual logic implementation
    }

    //Method to check if item is in stock
    private boolean isItemInStock(Order order) {
        //Logic to check if Item if in stock
        return true; //Placeholder, required actual logic implementation
    }
}
