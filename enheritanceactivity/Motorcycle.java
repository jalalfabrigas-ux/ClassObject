package enheritanceactivity;

public class Motorcycle  extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String brand, int speed, boolean hasSideCar){
        super(brand,speed);
        this.hasSideCar=hasSideCar;
    }  public boolean getSideCar(){
        return hasSideCar;
    }  public void setSideCar(boolean hasSideCar){
        this.hasSideCar=hasSideCar;
    }
    @Override   
    public void displayInfo(){
        super.displayInfo();
        System.out.println("VEHICLE HAD SIDECARR? " + hasSideCar);


    }
    
}
