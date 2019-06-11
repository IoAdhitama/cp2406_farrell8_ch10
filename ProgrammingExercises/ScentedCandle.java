public class ScentedCandle extends Candle
{
    protected String candleScent;

    ScentedCandle(String color, double height, String scent)
    {
        super(color, height);
        candleScent = scent;
        candlePrice = height * 3;
    }

    public void display()
    {
        System.out.println("The " + candleColor + " colored, "
                + candleHeight + " inch tall " + candleScent
                + " scented candle will cost $" + candlePrice);
    }

}
