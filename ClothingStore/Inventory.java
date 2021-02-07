package ClothingStore;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Clothes> inventory = new ArrayList<>();
    public Inventory(){
        System.out.println("inventory initialized");
    }

    public void storeItems(List<Clothes> inventClothes){
        for(Clothes inventCloth: inventClothes){
            inventory.add(inventCloth);
        }
    }

    public List<Clothes> getAllItems(){
        return inventory;
    }
}
