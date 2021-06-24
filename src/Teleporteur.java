public class Teleporteur extends Case{

    public Teleporteur(){
        this.representation = 'T';
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {
        //todo
    }
}
