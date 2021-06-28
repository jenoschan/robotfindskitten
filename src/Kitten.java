public class Kitten extends Case{

    private static String [] names = new String []{"Liam","Olivia","Noah","Emma","Oliver",
            "Ava","Elijah","Charlotte", "William", "Sophia", "James", "Amelia","Benjamin",
            "Isabella","Lucas","Mia","Henry","Evelyn","Alexander", "Harper"};
    private String catName = names[(int)(Math.random() * 20.0)];

    public Kitten(){
        this.representation = (char) (Math.random() * 68.0 + 58.0);
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {
        System.out.println("Noiceeeeeee!");
        System.out.println(this.catName + " <3 " + robot.robotName + "uwu");
        robot.isCanMove();
    }
}
