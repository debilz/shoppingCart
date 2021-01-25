package ClothingStore;

public class Clothes {
    private int id, quantity, price;
    private String type;
    Clothes(int id){
        this.id = id;
    }
    Clothes(int id, int quantity, int price, String type){
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public int getId(){
        return id;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

}
