package vsu.cs.prinf.zolotareva.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Long id;
    private int courseNumber;
    private String groupName;
    private List<Student> students = new ArrayList<>();

    public Group(Long id, int courseNumber, String groupName) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
    }

    public Long getId() { return id; }
    public int getCourseNumber() { return courseNumber; }
    public String getGroupName() { return groupName; }
    public List<Student> getStudents() { return students; }

    public void addStudent(Student student) { students.add(student); }
    public void removeStudent(Student student) { students.remove(student); }

    @Override
    public String toString() {
        return "ID:" + id + " Группа: " + groupName + " (Курс: " + courseNumber + ")";
    }
}