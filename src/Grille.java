import javax.sound.sampled.Port;

public class Grille {
    //Classe qui représente la grille de jeu
    Case[][] grille = new Case[12][60];
    //un tableau 2D de cases

    //Constructeur
    public Grille(int nbrPiecesX, int nbrPiecesY,
                  int largeurPiece, int hauteurPiece, int nbrNonKitten){

        /**Cette fonction initialise la grille en créant les pièces, les portes, les murs
         les clés et les items (le téléporteur, les NonKittenItems et le Kitten)
         Il y a ‘nbrNonKitten‘ NonKittenItems au total sur tout le jeu**/

        for (int i = 0; i < this.grille.length; i++){
            this.grille[i][0] = new Mur();
        }

        for(int i = 0; i < this.grille[0].length; i++){
            this.grille[0][i] = new Mur();
        }

        for(int i = 1; i < 2; i++) {
            for(int j = 0; j < this.grille[0].length; j++) {
                if (j % 12 == 6) {
                    this.grille[i * 6][j] = new Porte() ;
                } else {
                    this.grille[i * 6][j] = new Mur();
                }
            }
        }

        for(int i = 1; i < 5; i++) {
            for(int j = 0; j < this.grille.length; i++) {
                if (j % 6 == 3) {
                    this.grille[j][i * 12] = new Porte();
                } else {
                    this.grille[j][i * 12] = new Mur();
                }
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 5; j++) {
                int newJ = (int)(Math.random() * 11.0D) + 1 + j * 12;
                int newI = (int)(Math.random() * 5.0D) + 1 + i * 6;
                this.grille[newI][newJ] = new Teleporteur();
            }
        }

        for(int i = 0; i < 50; i++) {
            Point randomPoint = this.randomEmptyCell();
            this.grille[randomPoint.getX()][randomPoint.getY()] = new NonKitten();
        }

        Point key;
        int keyY = (key = this.randomEmptyCell()).getY();
        int keyX = key.getX();
        this.grille[keyX][keyY] = new Cle();

        Point kitten;
        int kittenY = (kitten = this.randomEmptyCell()).getY();
        int kittenX = kitten.getX();
        this.grille[kittenX][kittenY] = new Kitten();

    }

    public Point randomEmptyCell(){
        //Retourne une coordonnée de cellule qui ne contient rien

        int coordX;
        int coordY;

        do {
            coordX = (int) (Math.random() * (double) this.grille[0].length);
            coordY = (int) (Math.random() * (double) this.grille.length);
        } while (this.grille[coordY][coordX] != null);

        return new Point(coordX,coordY);
    }

    public boolean deplacementPossible(Robot robot, int x, int y){
        /**indique si c’est possible pour le robot robot de marcher sur la
        cellule de coordonnée (x, y)**/

        if (grille[x][y] instanceof Mur){
            return false;
        } else {
            return true;
        }
    }

    public void afficher(Robot robot){
       // Affiche la grille dans la console à coups de System.out.println(...)

        for (int i = 0; i < this.grille.length; i++){
            for (int j = 0; j < this.grille[i].length; j++){
                if (robot.getRoboCoord().egal(j,i)){
                    System.out.println('#');
                    continue;
                } else if (this.grille[i][j] == null){
                    System.out.println(' ');
                } else {
                    System.out.println(this.grille[i][j].getRepresentation());
                }
            }
            System.out.println('%');
        }

        //Prints out the wall on the left
        for (int i = 0; i < this.grille[0].length + 1; i++){
            System.out.println('%');
        }
//        System.out.println();
    }

    void interagir(Robot robot){
        /**Lance l’interaction entre le Robot robot et la case de la grille sur
        laquelle il se trouve
        L’"interaction" peut être l’affichage d’un message (pour les NonKittenItems),
        l’ouverture d’une Porte, le fait de ramasser une clé ou un téléporteur, ou encore
        le fait de gagner la partie en trouvant le Kitten **/
        //todo
    }

}
