public class FixDebugPlay
{
   protected String title;
   protected String author;

   public FixDebugPlay(String playTitle, String playAuthor)
   {
      title = playTitle;
      author = playAuthor;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}