package HomeTasks.Task_8;

/**
 * Created by kotok_artem on 16.10.2018.
 */
public class PrivateTester {
    private PrivateTester() {
    } // default constructor is overloaded to Private and can not be invoked from outside the class. It solves item 1 of the additional task.


    public static PrivateTester createPrivateTester() {
        PrivateTester PrivateTester = new PrivateTester();
        return PrivateTester;
    }

    public PrivateTester NonStaticCreatePrivateTester() {
        PrivateTester PrivateTester = new PrivateTester();
        return PrivateTester;
    }

    public void printCreationMessage() {
        System.out.println("Public PrivateTester method invoked.");
    }

    private void printPrivateCreationMessage() {
        System.out.println("Private PrivateTester method invoked.");
    }


}
