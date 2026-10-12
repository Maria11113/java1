package vsu.cs.prinf.zolotareva.service;

import vsu.cs.prinf.zolotareva.model.Group;
import vsu.cs.prinf.zolotareva.model.Student;
import java.util.*;

public class JournalService {

    private final Map<UUID, Group> groups = new HashMap<>();
    private final Map<UUID, Student> students = new HashMap<>();

    public Group createGroup(int course, String name) {
        Group group = new Group(UUID.randomUUID(), course, name);
        groups.put(group.id(), group);
        return group;
    }

    public Optional<Group> getGroupById(UUID id) {
        return Optional.ofNullable(groups.get(id));
    }

    public List<Group> getAllGroups() {
        return new ArrayList<>(groups.values());
    }

    public Group updateGroup(Group group) {
        groups.put(group.id(), group);
        return group;
    }

    public boolean deleteGroupById(UUID id) {
        return groups.remove(id) != null;
    }

    public Student createStudent(String lastName, String firstName) {
        Student student = new Student(UUID.randomUUID(), lastName, firstName);
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> getStudentById(UUID id) {
        return Optional.ofNullable(students.get(id));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student updateStudent(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public boolean deleteStudentById(UUID id) {
        return students.remove(id) != null;
    }
}
