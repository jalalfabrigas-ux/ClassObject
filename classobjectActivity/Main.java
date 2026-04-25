package classobjectActivity;

public class Main {
    public static void main(String args[]){
        Product product = new Product("Laptop",30000.0,1);

    
        System.out.println("Output: ");
       product.displayInfo(); 
       System.out.println("Total: "+ ShoppingCart.calculateTotal(product));
       System.out.println("Affordable? "+ ShoppingCart.isAffordable(product));
    }
    
}
