public class Main{
    public static void main(String args[]){
        Name name1 = new Name("JALAL LIKES COFFEE", 19 , "LOVE TO PLAY AROUND");
        Name name2 = new Name("Regie", 101,"Racist<3");
        Name name3 = new Name("Jun Francis", 101 , "Likes to Discriminate");
        name1.displayInfo();
        System.out.println("============");
        name2.displayInfo();
        System.out.println("============");
        name3.displayInfo();

        Game warrior =new Game ("JALAL","Warrior");
        Game mage = new Game ("Regie","Mage");
        Game gay = new Game("Jun","Gay");
        warrior.role();
        System.out.println("============");
        mage.role();
        System.out.println("============");
        gay.role();
        
    }
}