package exceptionhandling;

//CALLER HANDLING EXCEPTIONS
public class OrderHandler {

    public void handleOrder (Order order) {
        OrderProcessor processor = new OrderProcessor();
        try {
            processor.processOrder(order);
            System.out.println("Order processed Successfully");
        }
        catch(InsufficientFundsException | ItemOutOfStockExeception e ) {
            System.out.println("Error processing order:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
