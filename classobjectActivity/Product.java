package classobjectActivity;

public class Product {
    String name;
    double price;
    int quantity;
    Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    } void displayInfo(){
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
        System.out.println("Product: "+quantity);

    }
    
}
