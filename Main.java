import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>(); // List to store pets
        int idCounter = 1;
        int choice;

        do {
            // Show menu
            System.out.println("\n--- PET ADOPTION MENU ---");
            System.out.println("1. Add a Pet");
            System.out.println("2. View Pets");
            System.out.println("3. Adopt a Pet");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            if (choice == 1) {
                // Add a new pet
                System.out.print("Enter pet name: ");
                String name = scan.nextLine();
                System.out.print("Enter pet age: ");
                int age = scan.nextInt();
                scan.nextLine(); 
                System.out.print("Enter pet type (Dog/Cat/etc): ");
                String type = scan.nextLine();

                Pet p = new Pet(idCounter, name, age, type);
                petList.add(p);
                System.out.println("Pet added!");
                idCounter++;
            }

            else if (choice == 2) {
                // View all pets
                if (petList.isEmpty()) {
                    System.out.println("No pets available.");
                } else {
                    System.out.println("Available Pets:");
                    for (Pet p : petList) {
                        p.showPet();
                    }
                }
            }

            else if (choice == 3) {
                // Adopt a pet by ID
                System.out.print("Enter pet ID to adopt: ");
                int adoptId = scan.nextInt();
                boolean found = false;

                for (int i = 0; i < petList.size(); i++) {
                    if (petList.get(i).id == adoptId) {
                        petList.remove(i);
                        System.out.println("Pet adopted successfully!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Pet ID not found.");
                }
            }

            else if (choice == 4) {
                System.out.println("Thank you for visiting!");
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scan.close();
    }
}
