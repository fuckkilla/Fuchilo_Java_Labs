public class Cart {
    private Item[] stack;
    private int full;
    public Cart(){
        this.stack = new Item[10];
        this.full = 0;
    }

    public void getStack(){
        int len = stack.length;
        System.out.println(len);
    }
    public Cart(int amount){
        this.stack = new Item[amount];
        this.full = 0;
    }
    public boolean addToCart(Item item){
        return push(item);
    }

    private boolean push (Item item){
        if (full == stack.length-1){
            return false;
        }
        else {
            stack[full++] = item;
            return true;
        }
    }

    public Item deleteFromCart(String name, int amount){
        int c = amount;
        Item deleted = new Item();
        for (int i = 0;i<=full & c != 0;i++){
            if (stack[i].name == name){
                deleted = stack[i];
                for (int j = i;j<full-1;j++){
                    stack[j] = stack[j+1];
                    c--;
                }
            }
        }
        return deleted;
    }
    public void itemsSum(){
        float sum = 0;
        for (int i = 0;i<full;i++){
            sum += stack[i].price;
        }
        System.out.println("Цена всех товаров:"+sum);
    }
    void stackPriceUp(float perc){
        for (int i = 0;i<full-1;i++) {
            stack[i].price = stack[i].price + (stack[i].price * perc / 100);
        }
    }

    void stackPriceDown(float perc){
        for (int i = 0;i<full-1;i++) {
            if ((stack[i].price - (stack[i].price * perc / 100)) < 0) {
                stack[i].price = 0;
            } else stack[i].price = stack[i].price - (stack[i].price * perc / 100);
        }
    }

}

