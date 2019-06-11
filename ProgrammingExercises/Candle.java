public class Candle
{
    protected String candleColor;
    protected double candleHeight;
    protected double candlePrice;

    public Candle(String color, double height)
    {
        candleColor = color;
        candleHeight = height;
        candlePrice = height * 2;
    }

    public void display()
    {
        System.out.println("The " + candleColor + " colored, "
                + candleHeight + " inch tall candle will cost $" + candlePrice);
    }
}
