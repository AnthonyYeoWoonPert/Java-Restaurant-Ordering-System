package ordering.system;
public class Beverage {
    private String itemName;
    private String price;
    private String BeverageID;
    private String itemType;

    public String getItemName() {
        return itemName;
    }
    public String getPrice() {
        return price;
    }
    public String getBeverageID() {
        return BeverageID;
    }
    public String getItemType() {
        return itemType;
    }

    public Beverage(String itemName, String price) {
        this.itemName = itemName;
        this.price = price;
        this.BeverageID = "B";
        this.itemType = "Beverage";
    }
}
