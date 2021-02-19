import java.util.Random;

public class Human {

    private String name;
    private int MaxDistance;
    private int MaxJump;

    public Human(String name) {
        Random random = new Random();
        this.name = name;
        this.MaxJump = random.nextInt(50);
        this.MaxDistance = random.nextInt(50);
    }

    public void printRunDistance () {
        Random random = new Random();
        int check = random.nextInt(2);
        if ((check) == 1) {
            System.out.println(this.name + " run " + this.MaxDistance);
        } else {
            System.out.println(this.name + " don`t run " + this.MaxDistance);
        }
    }

    public void printJump(){
        Random random = new Random();
        int check = random.nextInt(2);
        if ((check) == 1) {
            System.out.println(this.name + " jump " + this.MaxDistance);
        } else {
            System.out.println(this.name + " don`t jump " + this.MaxDistance);
        }


    }
}
