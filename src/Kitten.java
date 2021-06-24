public class Kitten extends Case{
    private String catName;
    private String [] names = new String []{"Liam","Olivia","Noah","Emma","Oliver",
            "Ava","Elijah","Charlotte", "William", "Sophia", "James", "Amelia","Benjamin",
            "Isabella","Lucas","Mia","Henry","Evelyn","Alexander", "Harper"};

    public Kitten(){
        this.catName = names[(int)(Math.random() * 6.0D)];
    }

    @Override
    public boolean interactionPossible(Robot robot) {
        return true;
    }

    @Override
    public void interagir(Robot robot) {
        System.out.println("You have found a kitten! Way to go!");
        System.out.println(this.catName + " <3 " + robot.robotName);
    }
}
