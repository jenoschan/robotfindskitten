public class Cle extends Case{
    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {
        robot.nbrKey += 1; //adds key to stack
    }

}
