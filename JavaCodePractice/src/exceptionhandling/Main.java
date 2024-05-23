package exceptionhandling;

public class Main {
    //Main method
    public static void main(String[] args) {
        Order order = new Order("A0112", "AX123");
        OrderHandler handler = new OrderHandler();
        handler.handleOrder(order);
    }
}
