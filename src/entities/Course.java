package entities;

import java.util.*;

public class Course {
    private final Teacher teacher;
    private final String name;
    private final Set<Student> students = new LinkedHashSet<>();

    public Course(Teacher teacher, String name) {
        this.teacher = teacher;
        this.name = name;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public String getName() {
        return this.name;
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public int totalStudents() {
        return students.size();
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
