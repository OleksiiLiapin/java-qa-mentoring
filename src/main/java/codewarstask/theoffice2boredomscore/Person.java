package codewarstask.theoffice2boredomscore;

public class Person {
    String name;
    String department;
    Person [] staff;

    public Person(String name, String department ){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

}
