package HomeTasks.Task_9;

public class Task_9 {
    public static void main(String[] args) {


        Star star = new Star();
        star.printGalaxyName();
        Planet planet = new Planet();
        planet.printGalaxyName();
        star.setName("Aldebaran");
        System.out.println(star.hashCode());
        System.out.println(star.toString());


    }
}
