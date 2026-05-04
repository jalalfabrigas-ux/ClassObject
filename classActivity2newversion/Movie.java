package classActivity2newversion;

public class Movie extends Show{
    private String genre;
    private double ticketPrice;

    public Movie(String title,int duration,String genre,double ticketPrice){
        super(title,duration);
        this.genre=genre;
        this.ticketPrice=ticketPrice;
       
    } public String hahahaGenre(){
        return genre;
    } public double hahahaTicketPrice(){
        return ticketPrice;
    } public void heheheGenre(String genre){
        this.genre=genre;
    } public void heheheTicketPrice(double ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Genre: "+ genre);
        System.out.println("Ticket Price: " + ticketPrice);
    }
}

