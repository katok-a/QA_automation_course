package HomeTasks.Task_8.Task_8_inner;

import HomeTasks.Task_8.Tester;

public class Task_8_a {
    public static void main(String[] args) {
        Tester tester = new Tester("John", "Smith", 5, 2000);
        // Only Public constructor available here.

        // tester.setSalary(2000);
        // System.out.println(tester.getExpirienceInYears());
        // tester.setEnglishLevel("Advanced");

        // Setters / getters have (friendly/default) access level and can not be invoked from the other package.

        //  System.out.println(tester.doubleSalary()); will not compile - "Private" prevents access from outside the class.
        // System.out.println(tester.expirienceInMounth());
        // tester.printNameSurname(); // Friendly / Default, Protected methods can not be invoked from the other package.
        tester.printAll(); // Public == still no limits.
    }
}
