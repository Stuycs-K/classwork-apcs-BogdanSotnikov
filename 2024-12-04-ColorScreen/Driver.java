public class Driver
{
  public static void main(String[] args)
  {

  }

  public static void Border(x, y)
  {
    Text.color(Text.WHITE, background(Text.WHITE));
    for (int i = 0; i<=x; i++)
    {
      Text.go(i,0);
      System.out.print("H");
      Text.go(i,y);
      System.out.print("H");
    }
    for (int i = 0; i<=y; i++)
    {
      Text.go(0,i);
      System.out.print("H");
      Text.go(x,i);
      System.out.print("H");
    }
  }
}
