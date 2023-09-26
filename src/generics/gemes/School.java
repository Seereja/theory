package generics.gemes;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class School<T extends Students> extends Students {

    private int id;
    private String name;


    ArrayList<T> arrayList = new ArrayList<>();


    public School(String name, int age, int excellentStudents, int medallist, int id, String name1) {
        super(name, age, excellentStudents, medallist);
        this.id = id;
        this.name = name1;
    }

    public void addStudentsToSchool(T students) {
        arrayList.add(students);
        System.out.println(students.getName() + "add in School " + name + " " + id);
    }

    public void playWith(School<T> school) {
        String vinnerSchool;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            vinnerSchool = this.name;
        } else {
            vinnerSchool = school.name;
        }
        System.out.println(vinnerSchool + " VIN");

    }

    static class MedalistandExcellentStudentsComparator implements Comparator<School> {
        int res;

        @Override
        public int compare(School o1, School o2) {
            res = o2.getMedallist() - o1.getMedallist();
            if (res == 0) {
                res = o2.getExcellentStudents() - o1.getExcellentStudents();
            }
            return res;
        }
    }


//    @Override
//    public int compareTo(@NotNull School anotherSchool) {
//        int result;
//        result = this.medallist - anotherSchool.medallist;
//        if (result == 0) {
//            result = this.excellentStudents - anotherSchool.excellentStudents;
//        }
//        return result;
//    }
}
