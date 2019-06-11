public class DemoHorses
{
    public static void main(String[] args)
    {
        String name = "Chestnut";
        String color = "Chestnut";
        int birthYear = 2000;
        int raceCount = 69;

        Horse horse1 = new Horse(name, color, birthYear);
        horse1.display();

        RaceHorse horse2 = new RaceHorse(name, color, birthYear, raceCount);
        horse2.display();
    }
}
