public class Mur extends Case{

    public Mur(){
        this.representation = (char) 37;
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return false;
    }

    @Override
    public void interagir(Robot robot) {
        //le robot ne bouge pas
    }
}
