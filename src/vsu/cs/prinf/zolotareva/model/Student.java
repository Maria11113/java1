package vsu.cs.prinf.zolotareva.model;

public class Student {
    private Long id;
    private String lastName;
    private String firstName;
    private boolean[] tasks = new boolean[3];

    public Student(Long id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }

    public void markTaskDone(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < 3) tasks[taskIndex] = true;
    }

    public boolean isEverythingDone() {
        for (boolean task : tasks) if (!task) return false;
        return true;
    }

    @Override
    public String toString() {
        return "ID:" + id + " " + lastName + " " + firstName;
    }
}
