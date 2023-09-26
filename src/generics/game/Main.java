package generics.game;

public class Main {
    public static void main(String[] args) {

        Children children1 = new Children("Sergey", 12);
        Children children2 = new Children("Gavr", 12);

        Children children3 = new Children("Gosha", 12);
        Children children4 = new Children("Sasha", 12);

        Team<Children> childrenTeam = new Team<>("Пиф паф");
        Team<Children> childrenTeam2 = new Team<>("Ой ой ой");


        childrenTeam.addNewParticipant(children1);
        childrenTeam.addNewParticipant(children2);
        childrenTeam2.addNewParticipant(children3);
        childrenTeam2.addNewParticipant(children4);
        childrenTeam.playWith(childrenTeam2);


        Students students = new Students("Sergey", 28);
        Students students1 = new Students("Gavr", 28);
        Students students2 = new Students("Gosha", 28);
        Students students3 = new Students("Sasha", 28);


        Team<Students> studentsTeam = new Team<>("бИм");
        Team<Students> studentsTeam2 = new Team<>("бAм");
        studentsTeam.addNewParticipant(students);
        studentsTeam.addNewParticipant(students1);
        studentsTeam2.addNewParticipant(students2);
        studentsTeam2.addNewParticipant(students3);

        studentsTeam.playWith(studentsTeam2);

    }
}
