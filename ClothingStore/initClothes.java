package ClothingStore;

import java.util.ArrayList;
import java.util.List;

public class initClothes {
    private List<Clothes> clothes = new ArrayList<Clothes>();
    initClothes(){
        startingClothes();
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

    public List<Clothes> getClothes(){
        return clothes;
    }



}
