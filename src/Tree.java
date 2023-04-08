public class Tree extends Plant{
    private Color color;

    public Tree(Height height, Color color) {
        super(height);
        this.color = color;

    }

    public Color getColor() {
        return color;
    }
    public String grow(){
        return " Tree is growing ";
    }
    public String grow(Color color){
        return " Tree is growing " + " Color is " + color;
    }
    public String grow(int year){
        return " Tree is growing " + year;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color=" + color +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Tree{" +
                "color=" + color +
                '}';
    }
}
