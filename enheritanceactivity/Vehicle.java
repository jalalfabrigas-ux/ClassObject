package enheritanceactivity;

public class Vehicle{
    private string brand;
    private int speed;

    public Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    } public String getBrand(){
        return brand;
    } public int getSpeed(){
        return speed;
    } public String setBrand(String brand){
        this.brand=brand;
        
    }  public int setSpeed(int speed){
        this.speed=speed;
    }  public void displayInfo(){
        System.out.println();
        System.out.println("BRAND OF VEHICLE: " + brand);
        System.out.println("SPEED OF VEHICLE: " + speed);
    }
}