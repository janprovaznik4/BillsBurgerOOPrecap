package burgerrestaurant;

public class Order {
    private Hamburger burger;
    private Drink drink;
    private SideItem sideItem;
    private int totalPrice;

    public Order() {
        burger = new Hamburger("regular", 150, new Topping("ketchup", 10));
        drink = new Drink("small coke", "medium");
        sideItem = new SideItem("fries", 30);
    }

    public Order(Hamburger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        if (burger instanceof DeluxeBurger) {
            totalPrice = burger.getPrice();
        } else {
            totalPrice = burger.getPrice() + drink.getPrice() + sideItem.getPrice();
        }
    }

    public void addTopping(String type, int price) {
        burger.addTopping(type, price);
        adjustTotalPrice(price);
    }

    public void changeDrinkSize(String size) {
        drink.setSize(size);
    }

    public void printTheOrder() {
        System.out.println(toString());
    }

    public void printTotalPrice() {
        System.out.println("Total price of the order is " + getTotalPrice());
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    private void adjustTotalPrice(int price) {
        totalPrice += price;
    }

    @Override
    public String toString() {
        return "The order consists of " +
                "burger type \"" + burger.getType() + "\" which costs " + burger.getPrice() +
                " drink type \"" + drink.getType() + "\" which costs " + drink.getPrice() +
                " and side item type \"" + sideItem.getType() + "\" which costs " + sideItem.getPrice();
                //"These toppings " + burger.getFirstTopping().getPrice() + ", "  + burger.getSecondTopping().getPrice() + " and "  + burger.getThirdTopping().getPrice() +
                //"of prices: " + burger.getFirstTopping().getPrice() + ", " + burger.getSecondTopping().getPrice() + " and " + burger.getThirdTopping().getPrice() +
                //"are included in the price of the burger.";
    }
}
