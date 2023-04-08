public class Birch extends Tree{
    private int numberOfFlowers;

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public Birch(int numberOfFlowers, Height height, Color color) {
        super(height, color);
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public String grow() {
        return super.grow() + " It is birch ";
    }

    @Override
    public String toString() {
        return "Birch{" +
                "numberOfFlowers=" + numberOfFlowers +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Birch{" +
                "numberOfFlowers=" + numberOfFlowers +
                '}';
    }
}
