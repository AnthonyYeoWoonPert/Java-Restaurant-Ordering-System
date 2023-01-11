package ordering.system;
public class Food {
    private String itemName;
    private String price;
    private String itemType;
    private String FoodID;

    public String getItemName() {
        return itemName;
    }
    public String getPrice() {
        return price;
    }
    public String getItemType() {
        return itemType;
    }
    public String getFoodID() {
        return FoodID;
    }
    
    public Food(String itemName, String price) {
        this.itemName = itemName;
        this.price = price;
        this.FoodID = "F";
        this.itemType = "Food";
    }

}

