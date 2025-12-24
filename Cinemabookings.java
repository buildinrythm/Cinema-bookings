import java.util.Scanner;
import java.util.ArrayList;

public class Cinemabookings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        showWelcomeMessage();
        showMovies();

        int movieChoice = getMovieChoice(scanner);
        double ticketPrice = getTicketPrice(movieChoice);

        int ticketAmount = getTicketAmount(scanner);
        double totalCost = calculateTotal(ticketPrice, ticketAmount);

        showSummary(ticketAmount, ticketPrice, totalCost);

        scanner.close();
    }

    // 1. Welcome message
    public static void showWelcomeMessage() {
        System.out.println("Welcome to the cinema!");
    }

    // 2. Show available movies
    public static void showMovies() {
        System.out.println("\nAvailable Movies:");
        System.out.println("1. The God Father (€10.00)");
        System.out.println("2. Batman Forever (€12.00)");
        System.out.println("3. The Dark Knight (€11.00)");
        System.out.println("4. Avengers Endgame (€9.00)");
        System.out.println("5. The Naked Gun (€8.00)");
    }

    // 3. Get movie choice
    public static int getMovieChoice(Scanner scanner) {
        System.out.print("\nSelect a movie (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return choice;
    }

    // 4. Determine ticket price
    public static double getTicketPrice(int movieChoice) {
        switch (movieChoice) {
            case 1: return 10.00;
            case 2: return 12.00;
            case 3: return 11.00;
            case 4: return 9.00;
            case 5: return 8.00;
            default:
                System.out.println("Invalid movie choice. Default price applied.");
                return 10.00;
        }
    }

    // 5. Get ticket amount
    public static int getTicketAmount(Scanner scanner) {
        System.out.print("How many tickets would you like? ");
        return scanner.nextInt();
    }

    // 6. Calculate total cost
    public static double calculateTotal(double price, int amount) {
        return price * amount;
    }

    // 7. Show booking summary
    public static void showSummary(int amount, double price, double total) {
        System.out.println("\n--- Booking Summary ---");
        System.out.println("Tickets: " + amount);
        System.out.println("Price per ticket: €" + price);
        System.out.println("Total cost: €" + total);
    }
}
