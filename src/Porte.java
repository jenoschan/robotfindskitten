public class Porte extends Case{
	
	/**
	 * Constructeur pour les portes sur la grille. La porte est représentée par un !.
	 */
    public Porte(){
        this.representation = (char) 33; //!
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        if(robot.nbrKey > 0){ //if the robot has at least 1 key
            return true;
        }
        return false;
    }
    
    /**
     * Lors d'une interraction entre le robot et une porte, décrémente le nombre de clés.
     */
    @Override
    public void interagir(Robot robot) {
        robot.useKey();
    }


}
