public class Porte extends Case{

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

    @Override
    public void interagir(Robot robot) {
        robot.useKey();
    }


}
