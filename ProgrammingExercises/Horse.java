public class Horse
{
    protected String horseName;
    protected String horseColor;
    protected int horseBirthYear;

    public Horse(String name, String color, int birthYear)
    {
        horseName = name;
        horseColor = color;
        horseBirthYear = birthYear;
    }

    public void display()
    {
        System.out.println("The horse named " + horseName + " is "
                + horseColor + " colored and born in " + horseBirthYear);
    }
}
