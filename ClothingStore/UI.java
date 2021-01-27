package ClothingStore;

import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);

    UI(){
        menu();
    }

    public void menu(){
        modClothes mod = new modClothes();
        Cart cart = new Cart();
        while(true) {
            int ch;
            System.out.println("============================================================================");
            System.out.println("[1] Show Clothes List");
            System.out.println("[2] Add clothes in List");
            System.out.println("[3] Remove Clothes in List");
            System.out.println("[4] Show cart items");
            System.out.println("[5] Add item in cart");
            System.out.println("[6] Remove item in cart");
            System.out.println("[7] Checkout");
            System.out.print("Choice: ");
            ch = Integer.parseInt(scan.nextLine());

            if (ch == 1) {
                mod.showClothes();
            }
            else if (ch == 2) {
                System.out.print("Enter id: ");
                int localId = Integer.parseInt(scan.nextLine());
                System.out.print("Enter type of clothes: ");
                String localType = scan.nextLine();
                System.out.print("Enter quantity of " + localType + " : ");
                int localQuantity = Integer.parseInt(scan.nextLine());
                System.out.print("Enter price of " + localType + " : ");
                int localPrice = Integer.parseInt(scan.nextLine());
                mod.setClothes(localId, localQuantity, localPrice, localType);
            }
            else if (ch == 3) {
                System.out.print("Enter id you want to delete: ");
                int remId = Integer.parseInt(scan.nextLine());
                mod.remClothes(remId);
            }
            else if (ch == 4){
                cart.showCartItems();
            }
            else if (ch == 5){
                mod.showClothes();
                System.out.print("Enter id of your chosen item: ");
                int cartId = Integer.parseInt(scan.nextLine());
                System.out.print("Enter quantity: ");
                int quantity = Integer.parseInt(scan.nextLine());
                cart.addCartItems(cartId, quantity);
                mod.updateQuantity(cartId,quantity);
            }
            else {
                System.out.println("restart starting clothes");
            }
        }
    }
}
