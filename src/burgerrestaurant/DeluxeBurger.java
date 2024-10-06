package burgerrestaurant;

public class DeluxeBurger extends Hamburger {
    private Topping fourthTopping;
    private Topping fifthTopping;

    public DeluxeBurger() {
        super("deluxe", 250, new Topping("ketchup", 10), new Topping("mustard", 10));
    }

    @Override
    public void addTopping(String type, int price) {
        if (isFilled()) {
            if (fourthTopping == null)
                fourthTopping = new Topping(type, price);
            else if (fifthTopping == null)
                fifthTopping = new Topping(type, price);
            else
                System.out.println("The burger cannot be changed any more.");
            //adjustPrice(price);
        } else
            super.addTopping(type, price);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
