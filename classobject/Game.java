public class Game {
    String warrior,mage,gay;

    Game(String warrior, String mage, String gay){
        this.warrior=warrior;
        this.mage = mage ;
        this.gay=gay ;
    }
    public void role(){
        System.out.println(warrior + " is Warrior");
        System.out.println(mage + " is Mage");
        System.out.println(gay + " is a Gay");
    }
}
