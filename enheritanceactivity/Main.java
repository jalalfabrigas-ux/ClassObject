package enheritanceactivity;
import java.util.*;

public class Main{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER HOW MANY VEHICLES? ");
        int n = sc.nextInt();

        Vehicle[] vehicle = new Vehicle[n];

    

        for(int i = 0; i<n ; i++){
            System.out.println("==WELCOME TO VEHICLE DEALERSHIP==");
            System.out.println("Please choice if you want" +  "\n1. Car " + "\n2.Motorcycle");
            int choice = sc.nextInt();
            System.out.println("ENTER BRAND: " );
            String brand=sc.nextLine();
            System.out.println("Enter SPEED: ");
        int speed=sc.nextInt();

            if(choice == 1 ){
                
                System.out.println("Enter Number of Door: ");
                int numberOfDoor=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Fuel Capacity: ");
                double fuelCapacity=sc.nextDouble();

                vehicle[i] = new Car(brand,speed,numberOfDoor,fuelCapacity);

            }
            else if(choice==2){

                System.out.println("Had Side Car?  " );
                boolean hasSideCar=sc.nextBoolean();
                sc.nextLine();

                vehicle[i]=new Motorcycle(brand, speed, hasSideCar);
            }
            else{
                System.out.println("INVALID CHOICE!");
                i++;
            }
            
        }
        System.out.println("VEHICLES INFO");
        for(Vehicle vehicles : vehicle){
            vehicles.displayInfo();
            System.out.println();
        }

    }
}