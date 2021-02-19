public class Wall extends Bariers {

    private int height;

    public Wall (int height, String name) {
        setSize(height);
        this.name = name;
    }
    @Override
    void setSize(int size) {
    }

    @Override
    int getSize() {
        return this.height;
    }
}
