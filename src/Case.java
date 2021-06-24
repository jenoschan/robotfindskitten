public abstract class Case {
    protected char representation;
    /**
     * Retourne la représentation de la case (un seul caractère)
     *
     * @return la représentation de la case
     */
    public char getRepresentation() {
        return representation;
    }

    /**
     * Indique si une interaction entre la case et le robot est
     * possible (ex.: le robot peut interagir avec un NonKittenItem
     * en tout temps, mais ne peut pas interagir avec un mur, le robot
     * peut interagir avec une porte seulement s’il possède une clé,
     * etc.)
     *
     * @param robot Le robot qui interagirait avec la case
     * @return true si une interaction entre le robot et la case est possible
     */
    public abstract boolean interactionPossible(Robot robot);

    /**
     * Interaction entre la case et le robot
     *
     * @param robot
     */
    public abstract void interagir(Robot robot);

    /**
     * Génère un symbole aléatoire
     *
     * @return Un symbole ASCII compris entre ’:’ et ’~’
     */
    public static char getRandomSymbole() {
        return (char) (Math.random() * (126 - 58) + 58);
    }
}
