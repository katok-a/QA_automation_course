package HomeTasks;

import java.io.File;

/**
 * Created by kotok_artem on 28.09.2018.
 */

public class Person {
    // Variables

    private String name;
    private String surname;
    private int age;
    private String phone;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;

    }
    //methods
    public void printAllInformation (){
        System.out.println("Person's name: " + this.name + "; Surname: " + this.surname +"; Age: " + this.age + "; Phone: " + this.phone);
    }
    public void printName(){
        System.out.println("Person's name: " + this.name + "; Surname: " + this.surname);
    }
    public boolean isAdult(){
        boolean isAd = false;
        if(this.age>18) {isAd=true;}
        return isAd;
    }

}

