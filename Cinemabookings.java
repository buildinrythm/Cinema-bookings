import java.util.Scanner;
import java.util.ArrayList;

public class Cinemabookings{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int userChoice = 0;  
double ticketPrice = 0;

System.out.println("Available Movies: ");
System.out.println("1. The God Father");
System.out.println("2. Batman Forever");
System.out.println("3. The Dark Knight");
System.out.println("4. Avengers Endgame");
System.out.println("5. The Naked Gun");

System.out.print("Select a movie by entering the corresponding number. (1-5)");
userChoice = scanner.nextInt();
scanner.nextLine(); 


}
}