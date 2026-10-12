package vsu.cs.prinf.zolotareva.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private UUID id;
    private int courseNumber;
    private String groupName;
    private List<Student> students = new ArrayList<>();

    public Group(UUID id, int courseNumber, String groupName) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
    }

    public UUID id() { return id; }
    public int courseNumber() { return courseNumber; }
    public String groupName() { return groupName; }
    public List<Student> students() { return students; }

    public void addStudent(Student student) { students.add(student); }
    public void removeStudent(Student student) { students.remove(student); }

    @Override
    public String toString() {
        return "Группа: " + groupName + " (Курс: " + courseNumber + ")";
    }
}