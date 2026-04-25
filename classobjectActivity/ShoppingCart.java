package classobjectActivity;

public class ShoppingCart {

    static double calculateTotal(Product product){
        return product.price * product.quantity;
        
    }
    static boolean isAffordable(Product product){
        return calculateTotal(product) <= 1000;
      
        
    }
    
}
