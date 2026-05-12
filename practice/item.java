package practice;

public class item {
    public String item;
    public Item(String item){
        this.item=item;
    }   public void showInfo(){
        System.out.println("==ITEM INFO==");
        System.out.println("ITEM EQUIPPED: " + item);

    }
    
}
