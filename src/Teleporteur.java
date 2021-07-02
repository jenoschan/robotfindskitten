public class Teleporteur extends Case{
	
	/**
	 * Constructeur pour le téléporteur sur la grille. Le téléporteur est représenté par un T.
	 */
    public Teleporteur(){
        this.representation = (char) 84; //T
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    /**
     * Lors d'une interraction entre le robot et le téléporteur, ramasse
     * le teleporteur, rajoute l'option dans le chatbox et la capacité de se téléporter.
     */
    
    @Override
    public void interagir(Robot robot) {
        robot.setGotTeleport(true);
    }
}
