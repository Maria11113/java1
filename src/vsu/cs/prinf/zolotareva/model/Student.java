package vsu.cs.prinf.zolotareva.model;

public class Student {
    private String lastName;
    private String firstName;

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}
