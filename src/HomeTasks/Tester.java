package HomeTasks;

/**
 * Created by kotok_artem on 02.10.2018.
 */
public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    int salary;

    String privet = "Привет ";
    String hi = "Hello ";
    String eMailSuffix = "@TheCompany.com";
    static String jobIntro = "We are looking for QA Automative with ";
    static String jobExp = " years of expirience ";
    static String jobEnglish = " level of English";

    // constructors
    public Tester() {

    }

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname);
        this.expirienceInYears = expirienceInYears;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
        this(name, surname, expirienceInYears);
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // methods
    public void sayHello() {
        System.out.println(privet + this.name);
    }

    public void sayHello(String englishLevel) { // i mean if no English level is set,  greet in russian, else - in English
        System.out.println(hi + this.name);
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.surname);
    }

    public void printInfo(boolean isFull) {
        System.out.println(isFull ? this.name + " " + this.surname + " Exprirence: " + this.expirienceInYears + " years, Salary " + this.salary : this.name + " " + this.surname);
    }

    public void generateEmail(String surname) {
        System.out.println(this.surname + eMailSuffix);
    }

    public void generateEmail(String name, String surname) {
        System.out.println(this.name + this.surname + eMailSuffix);
    }

    // static Methods
    public static String jobJequest(int expirienceInYears) {
        return (jobIntro + expirienceInYears + jobExp);
    }

    public static String jobJequest(int expirienceInYears, String englishLevel) {
        return (jobIntro + expirienceInYears + jobExp + " and " + englishLevel + jobEnglish);
    }

}


