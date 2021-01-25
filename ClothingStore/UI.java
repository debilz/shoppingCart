package ClothingStore;

import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);

    UI(){
        menu();
    }

    public void menu(){
        modClothes mod = new modClothes();
        while(true) {
            int ch;
            System.out.println("============================================================================");
            System.out.println("[1] Show Clothes List");
            System.out.println("[2] Add clothes in List");
            System.out.println("[3] Remove Clothes in List");
            System.out.println("[others] Reset Clothes");
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
            else {
                System.out.println("restart starting clothes");
            }
        }
    }
}
