package enheritanceactivity;

public class Car extends Vehicle {
    private int numberOfDoor;
    private double fuelCapacity;

    public Car(String brand, int speed, int numberOfDoor,double fuelCapacity){
        super(brand,speed);
        this.numberOfDoor=numberOfDoor;
        this.fuelCapacity=fuelCapacity;
    } public int getNumberofDoor(){
        return numberOfDoor;
    } public double getFuelCapacity(){
        return fuelCapacity;
    } public void setNumberOfDoor(int numberOfDoor){
        this.numberOfDoor=numberOfDoor;
    
    } public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoor);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        
    }
    
}
