public abstract class Plant {
    private Height height;

    public Height getHeight() {
        return height;
    }

    public Plant(Height height) {
        this.height = height;
    }

    public String getInfo() {
        return "Plant{" +
                "height=" + height +
                '}';
    }
}
