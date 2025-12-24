import java.util.Scanner;

public class Cinemabookings {

    // Movie data stored in arrays
    static String[] movieTitles = {
        "The God Father",
        "Batman Forever",
        "The Dark Knight",
        "Avengers Endgame",
        "The Naked Gun"
    };

    static double[] moviePrices = {
        10.00,
        12.00,
        11.00,
        9.00,
        8.00
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        showWelcomeMessage();
        showMovies();

        int movieIndex = getMovieChoice(scanner);
        double ticketPrice = moviePrices[movieIndex];

        int ticketAmount = getTicketAmount(scanner);
        double totalCost = calculateTotal(ticketPrice, ticketAmount);

        showSummary(movieTitles[movieIndex], ticketAmount, ticketPrice, totalCost);

        scanner.close();
        exitMessage();
    }

    // 1. Welcome message
    public static void showWelcomeMessage() {
        System.out.println("Welcome to the cinema!");
    }

    // 2. Display movies using arrays
    public static void showMovies() {
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println((i + 1) + ". " + movieTitles[i] + " (€" + moviePrices[i] + ")");
        }
    }

    // 3. Get movie choice (returns array index)
    public static int getMovieChoice(Scanner scanner) {
        int choice;

        while (true) {
            System.out.print("\nSelect a movie (1-" + movieTitles.length + "): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= movieTitles.length) {
                return choice - 1; // convert to index
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 4. Get number of tickets
    public static int getTicketAmount(Scanner scanner) {
        int amount;

        while (true) {
            System.out.print("How many tickets would you like? ");
            amount = scanner.nextInt();

            if (amount > 0) {
                return amount;
            } else {
                System.out.println("Ticket amount must be greater than 0.");
            }
        }
    }

    // 5. Calculate total
    public static double calculateTotal(double price, int amount) {
        return price * amount;
    }

    // 6. Show booking summary
    public static void showSummary(String movie, int amount, double price, double total) {
        System.out.println("\n--- Booking Summary ---");
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + amount);
        System.out.println("Price per ticket: €" + price);
        System.out.println("Total cost: €" + total);
    }

    // 6. Show booking summary
    public static void exitMessage() {
        System.out.println("Thank you for your purchase. Enjoy the movie!!");
    }
}
