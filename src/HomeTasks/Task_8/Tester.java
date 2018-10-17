package HomeTasks.Task_8;

/**
 * Created by kotok_artem on 16.10.2018.
 */
public class Tester {
    // Variables
    public String name;
    public String surname;
    protected int expirienceInYears;
    String englishLevel;
    private int salary;
    static final int MULTIPLIER = 2;
    static final int MONTHINYEAR = 12;

    // Constructors
    private Tester(String name) {
        this.name = name;
    }

    Tester(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    protected Tester(String name, String surname, int expirienceInYears) {
        this(name, surname);
        this.expirienceInYears = expirienceInYears;
    }

    public Tester(String name, String surname, int expirienceInYears, int salary) {
        this(name, surname, expirienceInYears);
        this.salary = salary;
    }
    // getters & setters;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    int getExpirienceInYears() {
        return expirienceInYears;
    }

    void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    String getEnglishLevel() {
        return englishLevel;
    }

    void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
    // Methods
    private int doubleSalary(){
        return salary*MULTIPLIER;
    }
    int expirienceInMounth(){
        return expirienceInYears*MONTHINYEAR;
    }
    protected void printNameSurname(){
        System.out.println(name+" "+surname);
    }
    public void printAll(){
        System.out.println(name+" "+surname+" "+expirienceInYears+" "+englishLevel+" "+salary);
    }
}
