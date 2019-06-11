public class DemoCandles
{
    public static void main(String[] args)
    {
        String color = "Purple";
        double height = 10;
        String scent = "Lavender";

        Candle candle1 = new Candle(color, height);
        candle1.display();

        ScentedCandle candle2 = new ScentedCandle(color, height, scent);
        candle2.display();
    }
}
