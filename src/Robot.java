public class Robot {
    /**Classe qui représente le robot

     Le robot a minimalement les attributs suivants :
     - (String) nom du robot
     - (Point) position x, y sur la grille
     - (int) nombre de clés collectées (et pas encore utilisées)
     - (boolean) possède le téléporteur ou non
     **/

    public String robotName;
    public Point roboCoord;
    public int nbrKey;
    public boolean canMove;
    public boolean gotTeleport;

    public Robot(String robotName, Point roboCoord){
        this.robotName = robotName;
        this.roboCoord = roboCoord;
        this.canMove = false;
        this.nbrKey = 0;
        this.gotTeleport = false;
    }

    public String getRobotName(){
        return this.robotName;
    }

    public void useKey(){
        this.nbrKey --;
    }

    public void newKey(){
        this.nbrKey ++;
    }

    public int getNbrKey(){
        return this.nbrKey;
    }

    public Point getRoboCoord(){
        return this.roboCoord;
    }

    public void setRoboCoord(Point goCoord){
        this.roboCoord = goCoord;
    }

    public void setRoboCoord(int axeX, int axeY){
        this.roboCoord = new Point(axeX, axeY);
    }

    public boolean isGotTeleport() {
        return this.gotTeleport;
    }

    public void setGotTeleport(boolean hasTeleport){
        this.gotTeleport = true;
    }

    public void setCanMove(){
        this.canMove = true;
    }

    public boolean isCanMove() {
        return this.canMove;
    }

    @Override
    public String toString() {
        String message = this.robotName + " ["+ this.nbrKey + "] ";
        if (this.gotTeleport) {
            message = message + "T";
        }
        return message;
    }


}
