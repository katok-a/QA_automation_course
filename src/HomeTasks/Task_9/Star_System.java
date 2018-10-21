package HomeTasks.Task_9;

public abstract class Star_System {
    String Galaxy;
    int[] coordinates;
    int numberOfStars;

    Star_System() {
    }

    ;

    Star_System(String Galaxy) {
        this.Galaxy = Galaxy;
    }

    Star_System(int numberOfStars) {
        this.numberOfStars = numberOfStars;

    }

    public int getVolume(int length, int height, int depth) {
        return (length * height * depth);
    }

    public void printNumberOfStars() {
        System.out.println(numberOfStars);
    }
    public abstract void printGalaxyName();


}
