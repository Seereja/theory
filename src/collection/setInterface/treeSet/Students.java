package collection.setInterface.treeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Students implements Comparable<Students> {


    private String name;
    private int course;

    public Students(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Students students = (Students) o;
        return getCourse() == students.getCourse();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourse());
    }

    @Override
    public int compareTo(@NotNull Students o) {
        return this.course - o.course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
