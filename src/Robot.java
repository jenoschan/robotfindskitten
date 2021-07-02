public class Robot {
    /**Classe qui reprÃ©sente le robot

     Le robot a minimalement les attributs suivants :
     - (String) nom du robot
     - (Point) position x, y sur la grille
     - (int) nombre de clÃ©s collectÃ©es (et pas encore utilisÃ©es)
     - (boolean) possÃ¨de le tÃ©lÃ©porteur ou non
     **/

    public String robotName;
    public Point roboCoord;
    public int nbrKey;
    public boolean canMove;
    public boolean gotTeleport;
    
    /**
     * Constructeur du robot.
     * @param robotName Le nom du robot assigné parmi une liste prédéfinie.
     * @param roboCoord Les coordonnées du robot, assignées au hasard.
     */
    
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
    
   
    // Méthodes utilisés pour les différentes actions du robot et
    //ses caractéristiques.
    
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
        this.gotTeleport = hasTeleport;
    }

    public void setCanMove(){
        this.canMove = true;
    }

    public boolean isCanMove() {
        return this.canMove;
    }

    /**
     * Methode qui rajoute un T dans le chatbox si le robot possède le téléporteur.
     */
    @Override
    public String toString() {
        String message = this.robotName + " ["+ this.nbrKey + "] ";
        if (this.gotTeleport) {
            message = message + "T";
        }
        return message;
    }


}
