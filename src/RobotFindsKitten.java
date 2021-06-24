import java.util.Scanner;

public class RobotFindsKitten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans RobotFindsKitten\n" +
                "Super Dungeon Master 3000 Ultra Turbo Edition !");

        Grille grille = new Grille(5,2,12,6,50);
        Robot robot = new Robot("Mr. Robot", grille.randomEmptyCell());

        while (!robot.gotTeleport){ //????
            grille.interagir(robot); //????
            System.out.println(robot + "> ");
            char movement = scanner.next().charAt(0);

        }


    }
}
