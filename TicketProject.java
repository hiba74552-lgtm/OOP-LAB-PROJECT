import java.util.Scanner;

// ---------- OOP PART ----------

// Encapsulation
class Ticket {
    private String name;
    private int quantity;

    public void setData(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Inheritance
class Booking extends Ticket {

    public int calculateBill() {
        int price = 500; // per ticket price
        return getQuantity() * price;
    }

    public void display() {
        System.out.println("\n--- OOP Ticket Result ---");
        System.out.println("Name: " + getName());
        System.out.println("Tickets: " + getQuantity());
        System.out.println("Total Bill: " + calculateBill());
    }
}

// ---------- MAIN CLASS ----------
public class TicketProject {

    // ---------- Procedural ----------
    public static void procedural() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int qty = sc.nextInt();

        int price = 500;
        int total = qty * price;

        System.out.println("\n--- Procedural Result ---");
        System.out.println("Name: " + name);
        System.out.println("Tickets: " + qty);
        System.out.println("Total Bill: " + total);
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Ticket Management System =====");
        System.out.println("1. Procedural Approach");
        System.out.println("2. OOP Approach");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            procedural();
        } 
        else if (choice == 2) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Number of Tickets: ");
            int qty = sc.nextInt();

            // Object
            Booking obj = new Booking();

            // Encapsulation
            obj.setData(name, qty);

            // Output
            obj.display();
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
}