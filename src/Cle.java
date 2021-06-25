public class Cle extends Case{
    public Cle(){
        this.representation = (char) 39; //'
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {
        robot.newKey();
    }

}
