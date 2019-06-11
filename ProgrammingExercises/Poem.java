public class Poem
{
    protected String poemTitle;
    protected int lineNumber;

    public String getPoemTitle() {
        return poemTitle;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    Poem(String title, int lineAmount)
    {
        poemTitle = title;
        lineNumber = lineAmount;
    }

    public void display()
    {
        System.out.println(getPoemTitle() + " is a poem with " + getLineNumber() + " lines.");
    }
}
