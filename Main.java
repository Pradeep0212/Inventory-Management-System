import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        System.out.println("Inventory System Started");

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Check Stock");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                Product p = new Product();

                System.out.print("Enter product id: ");
                p.id = sc.nextInt();

                sc.nextLine(); // buffer clear

                System.out.print("Enter product name: ");
                p.name = sc.nextLine();

                System.out.print("Enter quantity: ");
                p.quantity = sc.nextInt();

                System.out.print("Enter price: ");
                p.price = sc.nextDouble();

                inventory.add(p);

                System.out.println("Product added successfully");
                

            } 
            else if (choice == 2) {

    if (inventory.size() == 0) {
        System.out.println("No products available");
    } else {
        System.out.println("\n--- Product List ---");
        for (Product p : inventory) {
            System.out.println(
                "ID: " + p.id +
                ", Name: " + p.name +
                ", Quantity: " + p.quantity +
                ", Price: " + p.price
            );
        }
    }
}
else if (choice == 3) {

    System.out.print("Enter product id to check stock: ");
    int searchId = sc.nextInt();

    boolean found = false;

    for (Product p : inventory) {
        if (p.id == searchId) {
            System.out.println(
                "Product Name: " + p.name +
                ", Available Quantity: " + p.quantity
            );
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Product not found");
    }
}

            
            else if (choice == 4) {
                System.out.println("Exiting Inventory System");
                break;

            } else {
                System.out.println("Invalid choice, try again");
            }
        }

        sc.close();
    }
}
