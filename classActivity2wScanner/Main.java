package classActivity2wScanner;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Title of Movie 1: ");
        String title1 = sc.nextLine();
        System.out.println("duration of Movie1 ");
        int duration1  = sc.nextInt();
        System.out.println("Ticket Price of Movie 1 ");
        double ticketPrice1  = sc.nextInt();
        
        
        sc.nextLine();
        System.out.println("Enter Title of Movie 2: ");
        String title2=sc.nextLine();
        System.out.println("duration of Movie2 ");
        int duration2  = sc.nextInt();
        System.out.println("Ticket Price of Movie 2 ");
        double ticketPrice2 = sc.nextInt();

        Movie movie1 = new Movie (title1,duration1 ,ticketPrice1);
        Movie movie2 = new Movie (title2,duration2,ticketPrice2);
        Cinema cinema = new Cinema();

        

        int tickets = 2;

        movie1.displayInfo();
        System.out.println("Total Cost ( "+tickets + "tickets ): "+ cinema.calculateCost(movie1,tickets));
        System.out.println("Long Movie? "+ cinema.isLongMovie(movie1));
        System.out.println();
        movie2.displayInfo();
        System.out.println("Total Cost("+tickets + "tickets): "+ cinema.calculateCost(movie2,tickets));
        System.out.println("Long Movie? "+ cinema.isLongMovie(movie2));

        sc.close();
    }
    
}