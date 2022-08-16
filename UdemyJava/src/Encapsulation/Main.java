package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//       // player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Health remaining: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Health remaining: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Enhanced player is " + player.getHealth());


    }
}
