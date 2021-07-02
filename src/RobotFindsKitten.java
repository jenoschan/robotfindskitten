import java.util.Scanner;

public class RobotFindsKitten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans RobotFindsKitten\n" +
                "Super Dungeon Master 3000 Ultra Turbo Edition !");

        //Initialise la grille avec 5 pièces horizontalement, 2 pièces verticalement.
        //Chaque pièce fait 12 cases de large et 6 cases de haut. 
        //Distribue 50 objets non-kitten aléatoirement sur la grille.
        
        Grille game = new Grille(5,2,12,6,50);
        Robot robot = new Robot("Mr. Robot", game.randomEmptyCell());

        while (!robot.isCanMove()){
            game.afficher(robot);
            System.out.println(robot + "> ");

            char mouvement = scanner.next().toLowerCase().charAt(0); // w a s d and other commands in lowercase
            int axeX = robot.getRoboCoord().getX();
            int axeY = robot.getRoboCoord().getY();

            switch (mouvement) {
                case 'w' -> axeY--;
                case 'a' -> axeX--;
                case 's' -> axeY++;
                case 'd' -> axeX++;
                case 't' -> {
                    if (robot.isGotTeleport()) {
                        robot.setRoboCoord(game.randomEmptyCell());
                        continue;
                    }
                }
                case 'q' -> robot.setCanMove();
            }
            
            //Si le robot n'est pas dans un mur ou hors de la grille,
            //vérifie si la case est null, sinon interragie avec l'objet
            //(porte,mur ou objet non-kitten).
            
            if (axeX >= 0 && axeY >= 0 && axeY != game.getGrille().length
                    && axeX != game.getGrille()[0].length && (game.getGrille()[axeY][axeX] == null
                    || game.getGrille()[axeY][axeX].interactionPossible(robot))){

                robot.setRoboCoord(axeX,axeY);

                if (game.getGrille()[axeY][axeX] == null) {
                    continue;
                }
                game.getGrille()[axeY][axeX].interagir(robot);

                if (game.getGrille()[axeY][axeX] instanceof NonKitten) {
                    continue;
                }
                game.getGrille()[axeY][axeX] = null;
            }

        }
    }
}
