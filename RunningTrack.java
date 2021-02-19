public class RunningTrack extends Bariers {

    private int length;

    public RunningTrack (int length, String name){
        setSize(length);
        this.name = name;
    }

    @Override
    void setSize(int size) {
        this.length = size;
    }

    @Override
    int getSize() {
        return this.length;
    }
}
