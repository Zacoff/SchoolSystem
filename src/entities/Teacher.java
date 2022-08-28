package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private final List<Course> courses = new ArrayList<>();
    public Teacher(String name, Integer age, String email) {
        super(name, age, email);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public int totalStudents() {
        int[] total = {0};
        courses.forEach(a -> total[0] += a.totalStudents());

        return total[0];
    }
}
