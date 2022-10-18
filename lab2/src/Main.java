public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(6);
        cart.addToCart(new Item("Milk",13));
        cart.addToCart(new Item("Bread",3));
        cart.addToCart(new Item("Butter",20));
        cart.addToCart(new Item("Beer",3));
        cart.addToCart(new Item("Sausages",25));
        cart.addToCart(new Item("Water",1));
        cart.itemsSum();
        cart.stackPriceUp(15);
        cart.stackPriceDown(30);
    }
}

