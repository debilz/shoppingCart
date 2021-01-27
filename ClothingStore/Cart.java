package ClothingStore;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private String name;
    modClothes mod = new modClothes();
    private Scanner scan = new Scanner(System.in);
    List<Clothes> stockClothes = new initClothes().getClothes();
    List<Clothes> cartClothes = new ArrayList<>();

    public void showCartItems(){
        System.out.println("==============Cart Items=================");
        for(Clothes cartcloth: cartClothes){
            System.out.println("=============================================");
            System.out.println("Clothes id: " + cartcloth.getId());
            System.out.print(" | Clothes type: " + cartcloth.getType());
            System.out.print(" | Clothes Quantity: " + cartcloth.getQuantity());
            System.out.println(" | Clothes Price: " + cartcloth.getPrice());
            System.out.println("=============================================");
        }
        System.out.println("================END Cart Items========================");
    }

    public void addCartItems(int id, int quantity){
        boolean addToCart = false;
        int indexClothes = 0;
        for(int i = 0; i < stockClothes.size(); i++){
            if(id == stockClothes.get(i).getId()){
                indexClothes = i;
                addToCart = true;
                i = stockClothes.size();
            }

        }
        if(addToCart) {
            int newPrice = stockClothes.get(indexClothes).getPrice() * quantity;
            cartClothes.add(new Clothes(id, quantity, newPrice, stockClothes.get(indexClothes).getType()));
            System.out.println("Quantity of " + stockClothes.get(indexClothes).getType() + "is reduced to ");
            /*
            stockClothes.set(indexClothes, new Clothes(stockClothes.get(indexClothes).getId(),
                    stockClothes.get(indexClothes).getQuantity() - quantity,
                    stockClothes.get(indexClothes).getPrice(), stockClothes.get(indexClothes).getType()));
             */
        }
        else {
            System.out.println("ID is not in Store! ");
        }
    }

    public void remCartItems(){

    }

}
