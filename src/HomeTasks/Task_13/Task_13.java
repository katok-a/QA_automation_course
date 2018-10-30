package HomeTasks.Task_13;

/**
 * Created by kotok_artem on 25.10.2018.
 */
public class Task_13 {
    static final String INITIAL = "Initail ";
    static final String AFTER_FIRST_REMOVE = "after first remove ";
    static final String AFTER_ALL_REMOVE = "after all remove ";
    static final String AFTER_FIRST_SET = "after first set ";
    static final String AFTER_ALL_SET = "after all set ";

    static final String BUTTONS = "Buttons ";
    static final String FIELDS = "Fields ";
    static final String LABELS = "Labels ";
    static final String DROPDOWNS = "Dropdowns ";

    public static void main(String[] args) {
        Page page1 = new Page();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        page1.add(button1);
        page1.add(button1);
        page1.add(button1);
        page1.add(button2);
        page1.add(button3);

        System.out.println(INITIAL + BUTTONS);
        page1.printAll(button1);

        page1.setFirst(button1, button3);
        System.out.println(BUTTONS + AFTER_FIRST_SET);
        page1.printAll(button1);
        page1.setAll(button1, button3);
        System.out.println(BUTTONS + AFTER_ALL_SET);
        page1.printAll(button1);
        page1.removeFirst(button3);
        System.out.println(BUTTONS + AFTER_FIRST_REMOVE);
        page1.printAll(button3);
        System.out.println(BUTTONS + AFTER_ALL_REMOVE);
        page1.removeAll(button3);
        page1.printAll(button1);


        Field field1 = new Field("field1");
        Field field2 = new Field("field2");
        Field field3 = new Field("field3");

        page1.add(field1);
        page1.add(field1);
        page1.add(field1);
        page1.add(field2);
        page1.add(field3);

        System.out.println(INITIAL + FIELDS );
        page1.printAll(field1);

        page1.setFirst(field1, field3);
        System.out.println(FIELDS  + AFTER_FIRST_SET);
        page1.printAll(field1);
        page1.setAll(field1, field3);
        System.out.println(FIELDS  + AFTER_ALL_SET);
        page1.printAll(field1);
        page1.removeFirst(field3);
        System.out.println(FIELDS  + AFTER_FIRST_REMOVE);
        page1.printAll(field3);
        System.out.println(FIELDS  + AFTER_ALL_REMOVE);
        page1.removeAll(field3);
        page1.printAll(field1);



        Label label1 = new Label("label1");
        Label label2 = new Label("label2");
        Label label3 = new Label("label3");
//
        page1.add(label1);
        page1.add(label1);
        page1.add(label2);
        page1.add(label3);
        System.out.println(INITIAL + LABELS);
        page1.printAll(label1);
        page1.remove(label1);
        System.out.println(LABELS  + AFTER_FIRST_REMOVE);
        page1.printAll(label1);
        page1.set(label3,label1);
        System.out.println(LABELS  + AFTER_FIRST_SET);
        page1.printAll(label1);


        Dropdown dropdown1 = new Dropdown("dropdown1");
        Dropdown dropdown2 = new Dropdown("dropdown2");
        Dropdown dropdown3 = new Dropdown("dropdown3");

        page1.add(0, dropdown1);
        page1.add(1, dropdown1);
        page1.add(2, dropdown1);
        page1.add(3, dropdown2);
        page1.add(4, dropdown3);
        System.out.println(INITIAL + DROPDOWNS);
        page1.printAll(dropdown1);
        page1.setFirst(dropdown1, dropdown3);
        System.out.println(DROPDOWNS  + AFTER_FIRST_SET);
        page1.printAll(dropdown1);
        page1.setAll(dropdown1,dropdown3);
        System.out.println(DROPDOWNS + AFTER_ALL_SET);
        page1.printAll(dropdown1);
        page1.removeFirst(dropdown3);
        System.out.println(DROPDOWNS  + AFTER_FIRST_REMOVE);
        page1.printAll(dropdown1);
        page1.removeAll(dropdown3);
        System.out.println(DROPDOWNS  + AFTER_ALL_REMOVE);
        page1.printAll(dropdown1);

    }
}
