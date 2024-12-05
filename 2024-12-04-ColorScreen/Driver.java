import java.util.Random;

public class Driver
{
  public static void main(String[] args)
  {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Border(80, 30);

    Random rand = new Random();
    DisplayNumbers(new int[]{rand.nextInt(99), rand.nextInt(99), rand.nextInt(99)}, 80);

    int[][] smile = new int[][]{{18, 19, 20, 60, 61, 62},{5, 5, 5, 5, 5, 5}};
    Draw(smile);

    Text.go(31, 0);
    System.out.print(Text.RESET);
  }

  public static void Border(int x, int y)
  {
    Text.color(Text.WHITE, Text.background(Text.WHITE));
    for (int i = 0; i<=x; i++)
    {
      Text.go(0,i);
      System.out.print("H");
      Text.go(y,i);
      System.out.print("H");
    }
    for (int i = 0; i<=y; i++)
    {
      Text.go(i,0);
      System.out.print("H");
      Text.go(i,x);
      System.out.print("H");
    }
  }

  public static void DisplayNumbers(int[] arr, int sizeX)
  {
    for (int i = 0; i<arr.length; i++)
    {
      Text.go(2, (((sizeX-2)/(arr.length+1))*(i+1))+1);
      if (arr[i]<25)
        Text.color(Text.RED+60);
      else if (arr[i]>75)
        Text.color(Text.GREEN+60);
      else
        Text.color(Text.WHITE);
      System.out.print(arr[i]);
    }
    Text.color(Text.WHITE);
    for (int i = 2; i<=sizeX-1; i++)
    {
      Text.go(3,i);
      System.out.print(".");
    }
  }

  public static void Draw(int[][] coords)
  {
    Text.color(Text.YELLOW, Text.background(Text.YELLOW));
    for (int i = 0; i<coords[0].length; i++)
    {
      Text.go(coords[1][i], coords[0][i]);
      System.out.print("H");
    }
  }
}
