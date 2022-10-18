public class Item {
    String name;
    float price;

    public Item() {
        this.price = 0;
        this.name = null;
    }
    public Item(String name, float price) {
        if (price < 0){
            this.price = 0;
        }
        else this.price = price;
        this.name = name;
    }

    void priceUp(float perc){
        price = price + (price * perc / 100);
    }

    void priceDown(float perc){
        System.out.println("Цена выросла на"+Float.valueOf(price * perc / 100));
        if ((price - (price * perc / 100))<0){
            price = 0;
        }
        else price = price - (price * perc / 100);
    }


}
