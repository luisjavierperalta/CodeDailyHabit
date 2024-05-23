package exceptionhandling;

public class Order {

    //Fields
    private String id;
    private String itemId;

    public Order(String id, String itemId) {
        this.id = id;
        this.itemId =itemId;
    }

    public String getId(){
        return id;
    }

    public String getItemId(){
        return itemId;
    }


}
