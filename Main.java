import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Bariers[] bariers = new Bariers[8];
        Random random = new Random();
        for (int i = 0; i < bariers.length; i++) {
            if (i % 2 == 0) {
                bariers[i] = new RunningTrack(random.nextInt(50), "RunTrck" + i);
            } else {
                bariers[i] = new Wall(random.nextInt(50), "Wall" + i);
            }
        }

        Object[] triers = new Object[9];
        for (int i = 0; i < triers.length; i++) {
            if (i % 2 == 0) {
                triers[i] = new Human("Human" + i);
            } else if (i % 3 == 0) {
                triers[i] = new Cat("Cat" + i);
            } else {
                triers[i] = new Robot("Robot" + i);
            }
        }
        for (int i = 0; i < bariers.length; i++) {
            for (int j = 0; j < triers.length; j++) {
                if (bariers[i] instanceof Wall) {
                    if (triers[j] instanceof Human) {
                        if (triers[j] instanceof Human)
                            ((Human) triers[j]).printJump();
                    }
                    if (triers[j] instanceof Cat) {
                        ((Cat) triers[j]).printJump();
                    }
                    if (triers[j] instanceof Robot) {
                        ((Robot) triers[j]).printJump();
                    }
                }
                if (bariers[i] instanceof RunningTrack) {
                    if (triers[j] instanceof Human) {
                        if (triers[j] instanceof Human)
                            ((Human) triers[j]).printRunDistance();
                    }
                    if (triers[j] instanceof Cat) {
                        ((Cat) triers[j]).printRunDistance();
                    }
                    if (triers[j] instanceof Robot) {
                        ((Robot) triers[j]).printRunDistance();
                    }
                }
            }
        }
    }
}
