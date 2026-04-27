package classActivity2wScanner;

public class Movie {
    String title;
    int duration;
    double ticketPrice;

    Movie(String title,int duration, double ticketPrice){
        this.title=title;
        this.duration=duration;
        this.ticketPrice=ticketPrice;
    } void displayInfo(){
        System.out.println("Title: " + title );
        System.out.println("Duration: " + duration + " minutes ");
        System.out.println("Ticket Price: "+ ticketPrice);
    }
}
