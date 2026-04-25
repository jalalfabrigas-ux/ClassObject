package classobjectActivity;

public class Main {
    public static void main(String args[]){
        Product product1 = new Product("Laptop",30000.0,1);
        Product product2 = new Product("Mouse",500.0,2);
        
        System.out.println();
        System.out.println("Output: ");
       product1.displayInfo(); 
       System.out.println("Total: "+ ShoppingCart.calculateTotal(product1));
       System.out.println("Affordable? "+ ShoppingCart.isAffordable(product1));
        System.out.println("");
       product2.displayInfo(); 
       System.out.println("Total: "+ ShoppingCart.calculateTotal(product2));
       System.out.println("Affordable? "+ ShoppingCart.isAffordable(product2));
        
    }
    
}
