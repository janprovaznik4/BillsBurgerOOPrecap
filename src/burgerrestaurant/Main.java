package burgerrestaurant;

public class Main {
    public static void main(String[] args) {
        Order regularOrder = new Order();
        Order specificOrder = new Order(
                new Hamburger("bacon", 200, new Topping("bacon", 30)),
                new Drink("sprite", "big"),
                new SideItem("coleslaw", 70));
        Order deluxeOrder = new Order(new DeluxeBurger(), new Drink("fanta", "medium"), new SideItem("rings", 80));

        specificOrder.printTheOrder();
        specificOrder.printTotalPrice();

        specificOrder.addTopping("cheese", 20);
        specificOrder.addTopping("onion", 5);
        specificOrder.addTopping("lettuce", 10);

        specificOrder.printTheOrder();
        specificOrder.printTotalPrice();

        specificOrder.changeDrinkSize("small");

        specificOrder.printTheOrder();
        specificOrder.printTotalPrice();
    }
}