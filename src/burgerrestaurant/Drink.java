package burgerrestaurant;

public class Drink {
    private final String type;
    private String size;
    private int price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        setPrice(size);
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
        setPrice(size);
    }

    private void setPrice(String size) {
        switch (size) {
            case "small" -> price = 30;
            case "medium" -> price = 50;
            case "big" -> price = 70;
            default -> System.out.println("Wrong drink size!");
        }
    }


}
