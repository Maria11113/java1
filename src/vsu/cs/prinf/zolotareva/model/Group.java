package vsu.cs.prinf.zolotareva.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int courseNumber;
    private String groupNumber;

    private List<Student> students = new ArrayList<>();

    public Group(int courseNumber, String groupNumber) {
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
    }

    public int getCourseNumber() { return courseNumber; }
    public String getGroupNumber() { return groupNumber; }
    public List<Student> getStudents() { return students; }

    @Override
    public String toString() {
        return "Курс: " + courseNumber + ", Группа: " + groupNumber;
    }
}