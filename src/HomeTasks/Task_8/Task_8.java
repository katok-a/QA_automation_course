package HomeTasks.Task_8;

public class Task_8 {
    public static void main(String[] args) {

        Tester tester = new Tester("John", "Smith", 5);
        tester.setSalary(2000);
        System.out.println(tester.getExpirienceInYears());
        tester.setEnglishLevel("Advanced");
        // May i NOT invoke all the setters / getters?
        // They have same access level (friendly/default) and all work fine from inside the package.

        //  System.out.println(tester.doubleSalary()); will not compile - "Private" prevents access from outside the class.
        System.out.println(tester.expirienceInMounth()); // friendly/default) works fine from inside the package.
        tester.printNameSurname(); // same with Protected.
        tester.printAll(); // Public == no limits.
    }
}
