package collection.mapInterface.entry;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int course;


    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != this.getClass())
            return false;
        Student otherStudent = (Student) o;
        return this.id == otherStudent.id && Objects.equals(name, otherStudent.name) && Objects.equals(course, otherStudent.course);
    }

        @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }
//    @Override
//    public int hashCode() {
//        return name.length()*7 + course * 30;
//    }
}
