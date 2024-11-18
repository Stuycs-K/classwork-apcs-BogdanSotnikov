import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1
{
  public static int findDistance(String filename)
  {
    int x = 0;
    int y = 0;
    int facing = 0;

    try
    {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String[] values = input.NextLine().split(", ");
      for (int i = 0; i<values.length; i++) {
        if (values[i].charAt(0) == 'R')
          facing += 90;
        else
          facing -=90;
        while (facing > 180)
          facing -= 90;
        while (facing < -180)
          facing += 90;
        if (facing == 0)
          y += (int)values[i].substring(1);
        else if (facing == 90)
          x += (int)values[i].substring(1);
        else if (facing == -90)
          x -= (int)values[i].substring(1);
        else
          y -= (int)values[i].substring(1);
      }
      return (Math.abs(x)+Math.abs(y));
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
    }
  }

  public static void main(String[] args)
  {
    System.out.println("inputDay1");
  }
}
