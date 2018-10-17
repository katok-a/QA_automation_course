package HomeTasks.Task_8;

//import com.sun.xml.internal.ws.wsdl.writer.document.ParamType; // WTF???

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by kotok_artem on 16.10.2018.
 */
public class Task_8_add {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // As for as i understand, this approach is called Static Factory.
        // It requires Static method in class, which creates (inside the class) and returns the instance of the class - i.e. Object.
        PrivateTester privateTester = PrivateTester.createPrivateTester();
        privateTester.printCreationMessage();



    }
}

