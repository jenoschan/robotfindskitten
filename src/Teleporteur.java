public class Teleporteur extends Case{
	
	/**
	 * Constructeur pour le t�l�porteur sur la grille. Le t�l�porteur est repr�sent� par un T.
	 */
    public Teleporteur(){
        this.representation = (char) 84; //T
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    /**
     * Lors d'une interraction entre le robot et le t�l�porteur, ramasse
     * le teleporteur, rajoute l'option dans le chatbox et la capacit� de se t�l�porter.
     */
    
    @Override
    public void interagir(Robot robot) {
        robot.setGotTeleport(true);
    }
}
