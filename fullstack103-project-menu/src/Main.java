import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //MENU MANAGEMENT
        //create instance of Menu class -> creates empty menu object
        //load txt file
        //create instance of MenuController class, pass menu as parameter
        Menu menu = new Menu();
        menu.loadMenuFromFile("src/menu.txt");
        MenuController menuController = new MenuController(menu);
        Scanner scanner = new Scanner(System.in);
        int choice;

        OrderManagement orderManagement = new OrderManagement();

        do {
            System.out.println("Restaurant Management System\n");
            System.out.println("Menu Options");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item");
            System.out.println("3. Remove Item");
            System.out.println("4. Edit Item\n");
            System.out.println("Order Options");
            System.out.println("5. Create Order");
            System.out.println("6. Update Order Status");
            System.out.println("7. Display Orders\n");
            System.out.println("8. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<MenuItem> menuItems = menu.getMenuItems();
                    MenuView menuView = new MenuView();
                    menuView.displayMenu(menuItems);
                    break;
                case 2:
                    menuController.addMenuItem();
                    break;
                case 3:
                    menuController.removeMenuItem();
                    break;
                case 4:
                    menuController.editMenuItem();
                    break;
                case 5:
                    orderManagement.createOrder(menu);
                    break;
                case 6:
                    System.out.print("Enter the order ID: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine();

                    // Check if the order ID exists
                    if (orderManagement.doesOrderExist(orderId)) {
                        System.out.println("Select the new status:");
                        for (Status status : Status.values()) {
                            System.out.println(status.ordinal() + ". " + status);
                        }

                        System.out.print("Enter the new status: ");
                        String statusInput = scanner.nextLine();

                        Status newStatus = Status.valueOf(statusInput.toUpperCase());
                        if (newStatus != null) {
                            orderManagement.updateOrderStatus(orderId, newStatus);
                        } else {
                            System.out.println("Invalid status. Please try again.");
                        }
                    } else {
                        System.out.println("Invalid order number.");
                    }
                    break;
                case 7:
                    orderManagement.displayOrders();
                    break;
                case 8:
                    menu.saveMenuToFile("src/menu.txt");
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }

}


