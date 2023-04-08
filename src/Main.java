public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(new Height(6, "Meters"), Color.BLACK);
        Birch birch = new Birch(9600,new Height(4,"Meters"), Color.WHITE);
        Birch birch1 = new Birch(9800,new Height(3,"Meters"), Color.WHITE);
        System.out.println(tree.getInfo());
        System.out.println(birch.getInfo());
        System.out.println(birch1.getInfo());
        System.out.println(tree.grow());
        System.out.println(birch.grow());
        System.out.println(birch1.grow());
    }
}