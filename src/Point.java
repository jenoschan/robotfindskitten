public class Point {
    private int x;
    private int y;
    
    /**
     * Constructeur pour les points.
     * 
     * @param x Composante X pour les points.
     * @param y Composante Y pour les points.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Methode qui vérifie l'égalité entre deux valeurs.
     * 
     * @param x
     * @param y
     * @return Retourne Vrai ou Faux selon si la valeur est égale ou pas.
     */
    boolean egal(int x, int y) {
        return x == this.x && y == this.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}