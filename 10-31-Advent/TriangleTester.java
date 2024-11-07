import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester
{
    public static int countTrianglesA(String filename)
    {
      int count = 0;
      try
      {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine() && input.hasNextInt())
        {
          count += isTriangle(input.nextInt(),input.nextInt(),input.nextInt());
        }
        input.close();
      }
      catch (FileNotFoundException ex)
      {
        System.out.println("File not found");
      }
      return count;
    }



    public static int isTriangle(int a, int b, int c)
    {
      if (a+b>c && a+c>b && b+c>a)
        return 1;
      return 0;
    }

    public static void main (String[] args)
    {
      System.out.println(countTrianglesA("inputTri.txt"));
    }
}
