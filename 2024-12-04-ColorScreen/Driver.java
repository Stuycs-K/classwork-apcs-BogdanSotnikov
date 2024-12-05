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

    if (rand.nextInt(99) == 0)
      Draw(Mood());
    else
      Draw(Smile());

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

  public static int[][] Smile()
  {
    return new int[][]{{18, 19, 20, 60, 61, 62, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62},{10, 10, 10, 10, 10, 10, 20, 21, 21, 22, 22, 23, 23, 23, 24, 25, 25, 26, 26, 26, 26, 26, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 27, 27, 27, 26, 26, 26, 26, 26, 25, 25, 24, 23, 23, 23, 22, 22, 21, 21, 20}};
  }

  public static int[][] Mood()
  {
    return new int[][]{{20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 22, 23, 24, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 31, 32, 33, 34, 35, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 41, 42, 43, 44, 45, 41, 42, 43, 44, 45, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 51, 52, 53, 54, 55, 55, 54, 53, 52, 51},{15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 16, 17, 18, 17, 16, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 15, 15, 15, 15, 24, 24, 24, 24, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 15, 15, 15, 15, 24, 24, 24, 24, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}};
  }
}
