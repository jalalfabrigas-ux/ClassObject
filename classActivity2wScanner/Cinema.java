package classActivity2wScanner;

public class Cinema{
    
double calculateCost(Movie m, int tickets){
        return m.ticketPrice * tickets;
    } boolean isLongMovie(Movie m){
        return m.duration >= 120;
    } 
    
}