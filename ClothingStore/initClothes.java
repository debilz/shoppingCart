package ClothingStore;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class initClothes {
    private List<Clothes> clothes = new ArrayList<>();

    initClothes(){


    }

    public void startingClothes(){
        int[] id = {1, 2, 3};
        int[] quantity = {10, 10, 10};
        int[] price = {100, 2000, 1500};
        String[] type = {"Tshirt", "Jacket", "Polo"};
        for (int i = 0; i < id.length; i++) {
            clothes.add(new Clothes(id[i], quantity[i], price[i], type[i]));
        }
        for(Clothes cloth: clothes){
            System.out.println("Clothes id: " + cloth.getId());
            System.out.print(" | Clothes type: " + cloth.getType());
            System.out.print(" | Clothes Quantity: " + cloth.getQuantity());
            System.out.println(" | Clothes Price: " + cloth.getPrice());
        }
    }

    public void setClothes(int id, int quantity, int price, String type){
        System.out.println("XXXXXXXXXXXXXXX SET CLOTHES METHOD XXXXXXXXXXXXXXXXX");
        boolean toAdd = true;
        for(int i = 0; i < clothes.size(); i++)
        {

            if(id == clothes.get(i).getId()){
                System.out.println("Id is already initialized! ");
                System.out.println("Used id: " + clothes.get(i).getId());
                i = clothes.size();
                toAdd = false;
            }
        }
        if(toAdd == true) {
            clothes.add(new Clothes(id, quantity, price, type));
            System.out.println("CLOTH SIZE after add: " + clothes.size());
        }
    }

    public void remClothes(int id){
        boolean toDel = false;
        Clothes cloth = null;
        for(int i = 0; i < clothes.size(); i++){
            if(id == clothes.get(i).getId()){
                System.out.println("We will now delete " + clothes.get(i).getId());
                System.out.println("Clothes type: " + clothes.get(i).getType());
                cloth = clothes.get(i);
                i = clothes.size();
                toDel = true;
            }
        }
        if(toDel == true){
            clothes.remove(cloth);
        }
    }

    public void updateQuantity(int id, int quantity){
        System.out.println("XXXXXXXXXXXXXXX UPDATE QUANTITY METHOD XXXXXXXXXXXXXXXXX");
        boolean toUpdate = false;
        int price = 0;
        int newQuantity = 0;
        String type = "";
        int index = 0;
        for(int i = 0; i < clothes.size(); i++)
        {
            if(id == clothes.get(i).getId()){
                System.out.println("Reducing the quantity of " + clothes.get(i).getType());
                toUpdate = true;
                price = clothes.get(i).getPrice();
                type = clothes.get(i).getType();
                newQuantity = clothes.get(i).getQuantity() - quantity;
                index = i;
                i = clothes.size();

            }
        }
        if(toUpdate) {
            clothes.set(index, new Clothes(id, newQuantity, price, type));
            System.out.println("CLOTH SIZE after add: " + clothes.size());
        }
    }

    public void showClothes() {
        for (Clothes cloth : clothes) {
            System.out.println("Clothes id: " + cloth.getId());
            System.out.print(" | Clothes type: " + cloth.getType());
            System.out.print(" | Clothes Quantity: " + cloth.getQuantity());
            System.out.println(" | Clothes Price: " + cloth.getPrice());
        }
    }

    public List<Clothes> getAllUpdatedClothes(){
        return unmodifiableList(clothes);
    }



}
