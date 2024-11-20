import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2
{
  public static String Keycode(String filename)
  {
    String code = "";

    try
    {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int current = 5;
      while(input.hasNextLine())
      {
        String line =input.nextLine();
        for (int j = 0; j<line.length(); j++)
        {
          if (line.charAt(j) == 'U' && current < 7)
            current +=3;
          else if (line.charAt(j) == 'D' && current > 3)
            current -=3;
          else if (line.charAt(j) == 'L' && current != 4 && current != 1 && current != 7)
            current -= 1;
          else if (line.charAt(j) == 'R' && current != 6 && current != 3 && current != 9)
            current += 1;
        }
        code += ""+current;
      }
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
    }
    return code;
  }

  public static void main(String[] args)
  {
    System.out.println(Keycode("InputDay2.txt"));
  }
}
