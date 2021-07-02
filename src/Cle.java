public class Cle extends Case{
	
	/**
	 * Constructeur pour la cl� sur la grille. La cl� est repr�sent�e par une apostrophe.
	 */
	
    public Cle(){
        this.representation = (char) 39; //'
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }
    
    /**
     * Interaction entre le robot et une clef. Incr�mente le nombre de clef.
     */
    @Override
    public void interagir(Robot robot) {
        robot.newKey();
    }

}
