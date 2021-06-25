public class Grille {
    //Classe qui représente la grille de jeu
    private Case[][] grille;
    //un tableau 2D de cases

    //Constructeur
    public Grille(int nbrPiecesX, int nbrPiecesY,
                  int largeurPiece, int hauteurPiece, int nbrNonKitten){

        /**Cette fonction initialise la grille en créant les pièces, les portes, les murs
         les clés et les items (le téléporteur, les NonKittenItems et le Kitten)
         Il y a ‘nbrNonKitten‘ NonKittenItems au total sur tout le jeu**/

        for (int i = 0; i < this.grille.length; i++){
            this.grille[i][0] = new Point();
        }

        for(int i = 0; i < this.grille[0].length; i++){
            this.grille[0][i] = new Point();
        }

        //todo

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

        //check neighbours w,a,s,d -> Check if there is a wall
        //todo
    }

    public void afficher(Robot robot){
       // Affiche la grille dans la console à coups de System.out.println(...)

        for (int i = 0; i < this.grille.length; i++){
            for (int j = 0; j < this.grille[i].length; j++){
                if (robot.getRoboCoord().egal(j,i)){ // hmmmmmm
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
