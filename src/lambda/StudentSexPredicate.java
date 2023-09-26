package lambda;

public class StudentSexPredicate implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.sex == Sex.MALE && student.getAveGrade() > 30;
    }
}
