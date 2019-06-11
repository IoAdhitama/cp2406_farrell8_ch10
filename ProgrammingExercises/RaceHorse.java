public class RaceHorse extends Horse
{
    protected int horseRaceCount;

    RaceHorse(String name, String color, int birthYear, int raceCount)
    {
        super(name, color, birthYear);
        horseRaceCount = raceCount;
    }

    public void display()
    {
        System.out.println("The horse named " + horseName + " is "
                + horseColor + " colored, born in " + horseBirthYear
                + ", and has competed in " + horseRaceCount + " races.");
    }
}
