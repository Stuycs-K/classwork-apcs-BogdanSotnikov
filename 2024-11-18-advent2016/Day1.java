import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

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
      String[] values = input.nextLine().split(", ");
      int[] checked = new int[values.length];
      for (int i = 0; i<values.length; i++) {
        if (values[i].charAt(0) == 'R')
          facing += 90;
        else
          facing -=90;
        while (facing > 180)
          facing -= 360;
        while (facing < -180)
          facing += 360;
        if (facing == 0)
          y += Integer.parseInt(values[i].substring(1));
        else if (facing == 90)
          x += Integer.parseInt(values[i].substring(1));
        else if (facing == -90)
          x -= Integer.parseInt(values[i].substring(1));
        else
          y -= Integer.parseInt(values[i].substring(1));
        if (Arrays.asList(checked).contains(x+y))
          System.out.println(Math.abs(x)+Math.abs(y));
        checked[i] = x+y;
      }
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
    }
    return (Math.abs(x)+Math.abs(y));
  }

  public static void main(String[] args)
  {
    System.out.println(findDistance("InputDay1.txt"));
  }
}
