package nio.sber.practise.task1;



public class Student {
    private String name;
    Sex sex;
    private int age;
    private int course;
    private double aveGrade;

    public Student(String name, Sex sex, int age, int course, double aveGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.aveGrade = aveGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAveGrade() {
        return aveGrade;
    }

    public void setAveGrade(double aveGrade) {
        this.aveGrade = aveGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", aveGrade=" + aveGrade +
                '}';
    }
}
