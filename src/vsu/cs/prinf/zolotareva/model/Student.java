package vsu.cs.prinf.zolotareva.model;

import java.util.UUID;

public class Student {
    private UUID id;
    private String lastName;
    private String firstName;
    private boolean[] tasks = new boolean[3];

    public Student(UUID id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public UUID id() { return id; }
    public String lastName() { return lastName; }
    public String firstName() { return firstName; }

    public void markTaskDone(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < 3) tasks[taskIndex] = true;
    }

    public boolean isEverythingDone() {
        for (boolean task : tasks) if (!task) return false;
        return true;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}