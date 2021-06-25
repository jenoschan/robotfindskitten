public class Teleporteur extends Case{

    public Teleporteur(){
        this.representation = (char) 84; //T
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {

        robot.setGotTeleport(true);
    }
}
