package classActivity2newversion;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

      System.out.println("Enter number of Movies: ");
      int n = sc.nextInt();
    
        Movie[] movies = new Movie[n];

        for(int i=0;i<n;i++){
            System.out.println("Movie Details:  ");

            System.out.println("TITLE OF MOVIE? ");
            sc.nextLine();
            String title =sc.nextLine();
            
            System.out.println("Duration of Movie: ");
            int duration = sc.nextInt();

            System.out.println("GENRE OF THE MOVIE: ");
            String genre = sc.nextLine();
            sc.nextLine();

            System.out.println("WHAT IS THE TICKET PRICE: ");
            double ticketPrice = sc.nextDouble();
            sc.nextLine();
            movies[i] = new Movie (title,duration,genre,ticketPrice);
        

        }
        System.out.print("--MOVIE DETAILS--");
        for (Movie movie : movies) {
        movie.displayInfo();
}
    sc.close();
    }
    
}