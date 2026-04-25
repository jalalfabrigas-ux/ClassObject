public class Game {
    String name, role;

    Game(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void role() {
        System.out.println(name + " is " + role);
    }
}