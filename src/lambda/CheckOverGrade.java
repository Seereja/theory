package lambda;

public class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.getAveGrade() > 8.2;
    }


}
