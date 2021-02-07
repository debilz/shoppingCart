package ClothingStore;

import arrayLists.Cloth;

import java.util.ArrayList;
import java.util.List;

public class modClothes {
/*
    List<Clothes> initclothes = new initClothes().getClothes();

    public void setClothes(int id, int quantity, int price, String type){
        System.out.println("XXXXXXXXXXXXXXX SET CLOTHES METHOD XXXXXXXXXXXXXXXXX");
        boolean toAdd = true;
        for(int i = 0; i < initclothes.size(); i++)
        {

            if(id == initclothes.get(i).getId()){
                System.out.println("Id is already initialized! ");
                System.out.println("Used id: " + initclothes.get(i).getId());
                i = initclothes.size();
                toAdd = false;
            }
        }
        if(toAdd == true) {
            initclothes.add(new Clothes(id, quantity, price, type));
            System.out.println("CLOTH SIZE after add: " + initclothes.size());
        }
    }

    public void remClothes(int id){
        boolean toDel = false;
        Clothes cloth = null;
        for(int i = 0; i < initclothes.size(); i++){
            if(id == initclothes.get(i).getId()){
                System.out.println("We will now delete " + initclothes.get(i).getId());
                System.out.println("Clothes type: " + initclothes.get(i).getType());
                cloth = initclothes.get(i);
                i = initclothes.size();
                toDel = true;
            }
        }
        if(toDel == true){
            initclothes.remove(cloth);
        }
    }

    public void updateQuantity(int id, int quantity){
        System.out.println("XXXXXXXXXXXXXXX UPDATE QUANTITY METHOD XXXXXXXXXXXXXXXXX");
        boolean toUpdate = false;
        int price = 0;
        int newQuantity = 0;
        String type = "";
        int index = 0;
        for(int i = 0; i < initclothes.size(); i++)
        {
            if(id == initclothes.get(i).getId()){
                System.out.println("Reducing the quantity of " + initclothes.get(i).getType());
                toUpdate = true;
                price = initclothes.get(i).getPrice();
                type = initclothes.get(i).getType();
                newQuantity = initclothes.get(i).getQuantity() - quantity;
                index = i;
                i = initclothes.size();

            }
        }
        if(toUpdate) {
            initclothes.set(index, new Clothes(id, newQuantity, price, type));
            System.out.println("CLOTH SIZE after add: " + initclothes.size());
        }
    }

    public void showClothes() {
        for (Clothes cloth : initclothes) {
            System.out.println("Clothes id: " + cloth.getId());
            System.out.print(" | Clothes type: " + cloth.getType());
            System.out.print(" | Clothes Quantity: " + cloth.getQuantity());
            System.out.println(" | Clothes Price: " + cloth.getPrice());
        }
    }

    public List<Clothes> getAllUpdatedClothes(){
        return initclothes;
    }

 */
}
