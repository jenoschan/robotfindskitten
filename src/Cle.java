public class Cle extends Case{
	
	/**
	 * Constructeur pour la clé sur la grille. La clé est représentée par une apostrophe.
	 */
	
    public Cle(){
        this.representation = (char) 39; //'
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }
    
    /**
     * Interaction entre le robot et une clef. Incrémente le nombre de clef.
     */
    @Override
    public void interagir(Robot robot) {
        robot.newKey();
    }

}
