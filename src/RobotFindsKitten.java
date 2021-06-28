import java.util.Scanner;

public class RobotFindsKitten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans RobotFindsKitten\n" +
                "Super Dungeon Master 3000 Ultra Turbo Edition !");

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

            Grille tempGrille = game;
            Robot tempRobot = robot;

            int tempAxe = axeX;
            int newAxeX = axeY;
            int newAxeY = tempAxe;

            Robot newRobot = tempRobot;
            Grille newGrille = tempGrille;

            if (newAxeY >= 0 && newAxeX != newGrille.getGrille()[0].length
                    && newAxeY != newGrille.getGrille()[0].length && (newGrille.getGrille()[newAxeX][newAxeY] == null
                    || newGrille.getGrille()[newAxeX][newAxeY].interactionPossible(newRobot))){

                robot.setRoboCoord(axeX,axeY);

                Grille preFGrille = game;
                Robot finalRobot = robot;
                Grille finalGrille = preFGrille;

                int finalAxeX = finalRobot.getRoboCoord().getX();
                int finalAxeY = finalRobot.getRoboCoord().getY();

                if (finalGrille.getGrille()[finalAxeY][finalAxeX] == null) {
                    continue;
                }
                finalGrille.getGrille()[finalAxeY][finalAxeX].interagir(finalRobot);

                if (finalGrille.getGrille()[finalAxeY][finalAxeX] instanceof NonKitten) {
                    continue;
                }
                finalGrille.getGrille()[finalAxeY][finalAxeX] = null;
            }

        }
    }
}
