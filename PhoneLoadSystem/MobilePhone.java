public class MobilePhone{
    String ownerName;
    double balance;
    MobilePhone(String ownerName, double balance){
        this.ownerName=ownerName;
        this.balance=balance;
    } void load(double amount){
        if(amount > 0){
            amount += balance;
            System.out.println("Loaded: "   +amount);
        }  else { 
            System.out.println("Insufficient Balance");
        }
    } void call(double cost){
        if(cost <= balance ){
            balance -= cost;
            System.out.println("call cost :" + cost);
        }  else {
        System.out.println("Insufficient Balance");
        }
    }
}