package burgerrestaurant;

public class Hamburger {
    private String type;
    protected int price;
    //basic version with separate field for each topping, will be solved by array and further by collection in the future
    private Topping firstTopping;
    private Topping secondTopping;
    private Topping thirdTopping;
    private boolean isFilled;

    public Hamburger(String type, int price, Topping topping) {
        this.type = type;
        this.price = price;
        firstTopping = topping;
    }

    public Hamburger(String type, int price, Topping firstTopping,  Topping secondTopping) {
        this(type, price, firstTopping);
        this.secondTopping = secondTopping;
    }

    public void addTopping(String type, int price) {
        if (firstTopping == null)
            firstTopping = new Topping(type, price);
        else if (secondTopping == null)
            secondTopping = new Topping(type, price);
        else if (thirdTopping == null) {
            thirdTopping = new Topping(type, price);
            isFilled = true;
        } else
            System.out.println("The burger cannot be changed any more.");
        adjustPrice(price);
    }

    protected boolean isFilled() {
        return isFilled;
    }

    protected void adjustPrice(int price) {
        this.price += price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        int toppingPrices = firstTopping.getPrice();
        if (secondTopping != null)
            toppingPrices += secondTopping.getPrice();
        if (thirdTopping != null)
            toppingPrices += thirdTopping.getPrice();
        return price + toppingPrices;
    }

    public Topping getFirstTopping() {
        return firstTopping;
    }

    public Topping getSecondTopping() {
        return secondTopping;
    }

    public Topping getThirdTopping() {
        return thirdTopping;
    }
}
