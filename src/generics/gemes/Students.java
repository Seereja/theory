package generics.gemes;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public abstract class Students {

    private String name;
    private int age;
    private int excellentStudents;
    private int medallist;

    public Students(String name, int age, int excellentStudents, int medallist) {
        this.name = name;
        this.age = age;
        this.excellentStudents = excellentStudents;
        this.medallist = medallist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExcellentStudents() {
        return excellentStudents;
    }

    public int getMedallist() {
        return medallist;
    }

    static class MedalistandExcellentStudentsComparator implements Comparator<Students> {
        int result;

        @Override
        public int compare(Students o1, Students o2) {
            result = o2.excellentStudents - o1.excellentStudents;
            if (result == 0) {
                result = o2.medallist - o1.medallist;
            }
            return result;
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", excellentStudents=" + excellentStudents +
                ", medallist=" + medallist +
                '}';
    }


//    @Override
//    public int compareTo(@NotNull Students anotherStudents) {
//        boolean result = this.excellentStudents - anotherStudents.excellentStudents;
//    }
}
