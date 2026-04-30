package practice;

public class Game {
    String name;
    String weapon;
    String attacktype;
    double damage;
    Game(String name, String weapon, String attacktype, double damage){
        this.name=name;
        this.weapon=weapon;
        this.attacktype=attacktype;
        this.damage=damage;
        
    } void infoCharacter(){
        System.out.println("CHARACTER : " + name +"\nWeapon Type:  " + weapon + " \n Damage Type: "+ attacktype +"\n Damage In/Output: "  + damage );

    }
}
