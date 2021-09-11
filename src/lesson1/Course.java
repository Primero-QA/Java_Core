package lesson1;

import java.util.ArrayList;

public class Course {
    Pool[] pools = {new Pool(10), new Pool(20), new Pool(30)};
    ArrayList<Animal> areLate = new ArrayList<>();

    public void inCompetition(Team team) {
        for (Animal animal : team.myTeam) {
            for (Pool pool : pools) {
                pool.getTimeToOvercomePool((CanSwim) animal);
                if (pool.getTimeToOvercomePool((CanSwim) animal) > 4) {
                    areLate.add(animal);
                }
            }
        }
    }

    public void whoLate() {
        if (areLate.size() > 0) {
            System.out.println("Are late:");
            for (Animal animal : areLate) {
                System.out.println(animal.getType() + "\n" +
                        "Name: " + animal.name + "\n" +
                        "Color: " + animal.color + "\n" +
                        "Age: " + animal.age);
            }
        }
    }
}
