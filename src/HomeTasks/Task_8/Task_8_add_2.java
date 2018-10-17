package HomeTasks.Task_8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Task_8_add_2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class privTester = PrivateTester.class; // create privTester Class to go deep with.
        Constructor[] privTesterCons = privTester.getDeclaredConstructors(); // getting array of constructors of the privTester;
        System.out.println(privTesterCons.length);
        System.out.println(privTesterCons[0].getName());
        System.out.println(privTesterCons[0].getParameterCount());
        // here we see PrivateTester.class has only 1 constructor with none parameters == default constructor;
        privTesterCons[0].setAccessible(true); // override Private access modifier;
        Object privateTesterObject = (PrivateTester) privTesterCons[0].newInstance(); // create Object using constructor and cast it to PrivateTester class;
        ((PrivateTester) privateTesterObject).printCreationMessage(); // invoke public method
        Method[] privTestMeth = privTester.getDeclaredMethods(); // getting list of all methods of Object
        for (Method method : privTestMeth) {
            System.out.println(method.getName());
            System.out.println(method.getParameters().length);
        }
        // Here we see the list of Class methods and number of their arguments.
        // So, printPrivateCreationMessage has NONE args.
        int numberOfMethodInArray = 3;
        privTestMeth[numberOfMethodInArray].setAccessible(true);// override Private access modifier;
        Method methodToInvoke = privTestMeth[numberOfMethodInArray];
        methodToInvoke.invoke(privateTesterObject); // invoke Private method;

        // Both Public and Private methods were invoked, so Additional task using reflection is complete.




    }
}
