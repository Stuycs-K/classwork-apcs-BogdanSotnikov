//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{

  public static void main(String[] args)
  {
    //2 Opening a file requires a try/catch
    try
    {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      while(input.hasNextLine())
      {
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i ++)
        {
          if (line.charAt(i) == ('{'))
          {
            System.out.println(line);
            break;
          }
        }
      }
      input.close();
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
      return;
    }
  }
}
