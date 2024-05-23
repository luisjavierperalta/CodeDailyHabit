package exceptionhandling;

//CUSTOM EXCEPTION CLASS 2

public class ItemOutOfStockExeception extends Exception{
    public ItemOutOfStockExeception(String message) {
        super(message);
    }
}
