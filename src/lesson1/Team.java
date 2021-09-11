package lesson1;

public class Team {
    private String teamName;
    Animal[] myTeam = new Animal[4];
    public Team(String name) {
        this.teamName = name;
        Cat teamCat = new Cat("Vasilij", "black", 2);
        teamCat.setSwimmingSpeed(6);
        myTeam[0] = teamCat;
        Turtle teamTurtle = new Turtle("Tortilla", "green", 154);
        teamTurtle.setSwimmingSpeed(15);
        myTeam[1] = teamTurtle;
        Wolf teamWolf1 = new Wolf("Willy", "red", 4);
        teamWolf1.setSwimmingSpeed(7);
        myTeam[2] = teamWolf1;
        Wolf teamWolf2 = new Wolf("Akella", "white", 5);
        teamWolf2.setSwimmingSpeed(8);
        myTeam[3] = teamWolf2;
    }
    public void printTeam () {
        System.out.println("Our team: " + teamName);
        for (int i = 0; i < myTeam.length; i++) {
            System.out.println("Name: " + myTeam[i].name + "\n" +
                    "Color: " + myTeam[i].color + "\n" +
                    "Age: " + myTeam[i].age);
        }
    }

}
