package ClothingStore;


import arrayLists.Cloth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.unmodifiableList;

public class Cart {
    private Scanner scan = new Scanner(System.in);
    List<Clothes> stockClothes = new ArrayList<>();
    List<Clothes> cartClothes = new ArrayList<>();
    public Cart(){

    }
    public Cart(List<Clothes> stockClothes){
        this.stockClothes = stockClothes;
    }
    public void showCartItems(List<Clothes> updatedCartClothes){
        for(Clothes cartcloth: updatedCartClothes){
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
            System.out.println("Quantity of " + stockClothes.get(indexClothes).getType() + " is reduced to ");
            for(Clothes cartcloth: cartClothes){
                System.out.println("=============================================");
                System.out.println("Clothes id: " + cartcloth.getId());
                System.out.print(" | Clothes type: " + cartcloth.getType());
                System.out.print(" | Clothes Quantity: " + cartcloth.getQuantity());
                System.out.println(" | Clothes Price: " + cartcloth.getPrice());
                System.out.println("=============================================");
            }
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

    public void remCartItems(int id, int quantity){
        boolean remToCart = false;
        int indexClothes = 0;
        for(int i = 0; i < stockClothes.size(); i++){
            if(id == stockClothes.get(i).getId()){
                indexClothes = i;
                remToCart = true;
                i = stockClothes.size();
            }
        }
        if(remToCart){
            /* get index of id in cart clothes */
            int indexCart = 0;
            for(int i = 0; i < cartClothes.size(); i++){
                if(id == cartClothes.get(i).getId()){
                    indexCart = i;
                    i = cartClothes.size();
                }
            }
            int newQuantity = cartClothes.get(indexCart).getQuantity() - quantity;
            int newPrice = stockClothes.get(indexClothes).getPrice() * newQuantity;
            if(quantity == stockClothes.get(indexClothes).getQuantity()){
                cartClothes.remove(indexClothes);
            }
            else{
                cartClothes.set(indexCart, new Clothes(id, newQuantity, newPrice, stockClothes.get(indexClothes).getType()));
            }
        }
    }

    public void checkOut(){
        int total = 0;
        for(Clothes cartcloth: cartClothes){
            total = total + cartcloth.getPrice();
            System.out.println("=============================================");
            System.out.println("Clothes id: " + cartcloth.getId());
            System.out.print(" | Clothes type: " + cartcloth.getType());
            System.out.print(" | Clothes Quantity: " + cartcloth.getQuantity());
            System.out.println(" | Clothes Price: " + cartcloth.getPrice());
            System.out.println("=============================================");
        }
        int hrs = total/1500;
        System.out.println("Your total is PHP " + total);
        System.out.println("You need to work for " + hrs + " hrs to buy this item.");
        System.out.println("Thank you for shopping! ");
    }

    public List<Clothes> getAllUpdatedClothes(){
        return unmodifiableList(cartClothes);
    }

}
