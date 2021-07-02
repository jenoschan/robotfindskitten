public class Mur extends Case{
	
	/**
	 * Constructeur pour le mur sur la grille. Le mur est représenté par un %.
	 */
    public Mur(){
        this.representation = (char) 37;
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return false;
    }

    /**
     * Lors d'une interaction avec un mur, le mouvement est impossible.
     */
    @Override
    public void interagir(Robot robot) {
        
    }
}
