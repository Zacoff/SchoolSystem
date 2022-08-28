package application;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Daniel" , 20, "daniel.dfa27@gmail.com");
        Student student2 = new Student("Daniel" , 20, "daniel.dfa27@gmail.com");

        Teacher teacher = new Teacher("Rogerio", 40, "rogerio@gmail.com");

        Course math = new Course(teacher, "Math");
        teacher.addCourse(math);
        Course portuguese = new Course(teacher, "Portuguese");
        teacher.addCourse(portuguese);
        Course english = new Course(teacher, "English");
        teacher.addCourse(english);

        math.addStudents(student);
        math.addStudents(student2);
        math.addStudents(student2);

        portuguese.addStudents(student);
        english.addStudents(student2);
        portuguese.addStudents(student2);
        english.addStudents(student);

        teacher.getCourses().forEach(a -> {
            String course = a.getName() + "-" + a.getStudents();
            System.out.println(course);
        });

        System.out.println(teacher.getName() + "Students Total: " + teacher.totalStudents());
    }
}
