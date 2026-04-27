package classActivity2;

public class Main {
    public static void main(String args[]){
        Movie movie1 = new Movie ("Avengers",150 , 300.0);
        Movie movie2 = new Movie ("Frozen",100,250.0);
        Cinema cinema = new Cinema();

        int tickets = 2;

        movie1.displayInfo();
        System.out.println("Total Cost ( "+tickets + "tickets ): "+ cinema.calculateCost(movie1,tickets));
        System.out.println("Long Movie? "+ cinema.isLongMovie(movie1));
        System.out.println();
        movie2.displayInfo();
         System.out.println("Total Cost("+tickets + "tickets): "+ cinema.calculateCost(movie2,tickets));
        System.out.println("Long Movie? "+ cinema.isLongMovie(movie2));
    }
    
}
