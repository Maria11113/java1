package vsu.cs.prinf.zolotareva;

import vsu.cs.prinf.zolotareva.model.Group;
import vsu.cs.prinf.zolotareva.model.Student;
import vsu.cs.prinf.zolotareva.repository.InMemoryRepository; // Импортируем наш репозиторий
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Студенты");

        InMemoryRepository<Student> studentRepo = new InMemoryRepository<>();

        Student s1 = new Student(1L, "Иванов", "Иван");
        Student s2 = new Student(2L, "Петрова", "Мария");

        studentRepo.create(1L, s1);
        studentRepo.create(2L, s2);

        Student found = studentRepo.getById(1L);
        System.out.println("Нашли студента: " + found);

        List<Student> allStudents = studentRepo.getAll();
        System.out.println("Всего студентов: " + allStudents.size());

        Student updatedS1 = new Student(1L, "Иванов", "Петр"); // Новое имя
        studentRepo.update(1L, updatedS1);

        studentRepo.delete(2L);
        System.out.println("Осталось студентов: " + studentRepo.getAll().size());

        System.out.println("\nГруппы");

        InMemoryRepository<Group> groupRepo = new InMemoryRepository<>();

        Group g1 = new Group(10L, 1, "П-11");
        groupRepo.create(10L, g1);

        Group myGroup = groupRepo.getById(10L);
        myGroup.addStudent(s1);

        System.out.println("Группа содержит: " + myGroup.getStudents());
    }
}