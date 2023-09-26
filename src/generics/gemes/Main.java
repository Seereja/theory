package generics.gemes;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        JuniorSchoolChildren schoolChildren = new JuniorSchoolChildren("Sergey", 12, 10, 0);
        JuniorSchoolChildren schoolChildren2 = new JuniorSchoolChildren("Yana", 12, 9, 1);
        JuniorSchoolChildren schoolChildren3 = new JuniorSchoolChildren("Sacha", 12, 19, 1);
        JuniorSchoolChildren schoolChildren7 = new JuniorSchoolChildren("Sacha123", 12, 12, 0);
        JuniorSchoolChildren schoolChildren8 = new JuniorSchoolChildren("Karamyrza", 12, 19, 2);
        JuniorSchoolChildren schoolChildren9 = new JuniorSchoolChildren("GrossFuck", 12, 10, 1);


//        School<JuniorSchoolChildren> schoolChildrenSchool = new School<>(1, "Шил");
//
//        schoolChildrenSchool.addStudentsToSchool(schoolChildren);
//        schoolChildrenSchool.addStudentsToSchool(schoolChildren2);
//        schoolChildrenSchool.addStudentsToSchool(schoolChildren3);

        ArrayList<JuniorSchoolChildren> schoolChildren1 = new ArrayList<>();
        schoolChildren1.add(schoolChildren);
        schoolChildren1.add(schoolChildren2);
        schoolChildren1.add(schoolChildren3);

        ArrayList<JuniorSchoolChildren> schoolChildren4 = new ArrayList<>(schoolChildren1);
        schoolChildren4.add(schoolChildren7);
        schoolChildren4.add(schoolChildren8);
        schoolChildren4.add(schoolChildren9);


        System.out.println("Before sort");
        System.out.println(schoolChildren1);
        System.out.println();
        System.out.println("After sort");
        Collections.sort(schoolChildren1, new Students.MedalistandExcellentStudentsComparator());
        System.out.println(schoolChildren1);
        System.out.println();


        System.out.println(schoolChildren4);

    }
}
