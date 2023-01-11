package ordering.system;
public class Order {
    private String customerID;
    private String orderName;
    private String price;
    private String quantity;
    private String totalPrice;
    private String orderStatus;

    public Order(String customerID, String orderName, String price, String quantity, String totalPrice, String orderStatus) {
        this.customerID = customerID;
        this.orderName = orderName;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    public String getCustomerID() {
        return customerID;
    }
    public String getOrderName() {
        return orderName;
    }
    public String getPrice() {
        return price;
    }
    public String getQuantity() {
        return quantity;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
    public String getOrderStatus() {
        return orderStatus;
    }  
}
