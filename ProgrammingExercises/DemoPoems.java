public class DemoPoems
{
    public static void main(String[] args)
    {
        Couplet poem1 = new Couplet("A couplet");
        Limerick poem2 = new Limerick("A Limerick");
        Haiku poem3 = new Haiku("A Haiku");

        poem1.display();
        poem2.display();
        poem3.display();
    }
}
