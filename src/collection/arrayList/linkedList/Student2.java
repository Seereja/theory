package collection.arrayList.linkedList;

public class Student2 {

    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
