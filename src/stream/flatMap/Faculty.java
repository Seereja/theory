package stream.flatMap;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public String getName() {
        return name;
    }

    public void addStudentToFaculty(Student student) {
        studentOnFaculty.add(student);
    }
}
