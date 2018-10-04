package HomeTasks;

/**
 * Created by kotok_artem on 28.09.2018.
 */
public class Task4_1_1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setSurname("Smith");
        person.setAge(25);
        person.setPhone("+(123)-45-67-89");
        person.printAllInformation();
        person.printName();
        System.out.println("Person is adult? " + person.isAdult());



    }
}
