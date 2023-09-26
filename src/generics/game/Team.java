package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;

    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(participant.getName() + " add in Team " + name);
    }

    public void playWith(Team<T> team) {
        String vinnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            vinnerName = this.name;
        } else {
            vinnerName = team.name;
        }
        System.out.println("VIN " + vinnerName);

    }
}
