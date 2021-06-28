public class Kitten extends Case{

    private static String [] names = new String []{"Cookie","Mr. Mittens","Batman","Minou","Coco",
            "Bread Loaf","Luna","Nala", "Shadow", "Boots", "Mochi", "Kiki","Lucky",
            "Brownie","Luigi","Buttercup","Honey","Bear","Marshmallow", "Fluffy"};
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
        System.out.println("Noiceeeeeee! You've found a kitten!");
        System.out.println(this.catName + " <3 " + robot.robotName);
        robot.isCanMove();
    }
}
