package burgerrestaurant;

public class SideItem {
    private final String type;
    private final int price;

    public SideItem(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
