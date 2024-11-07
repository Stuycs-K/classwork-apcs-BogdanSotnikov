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

    public static int countTrianglesB(String filename)
    {
      int count = 0;
      try
      {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNextLine() && input.hasNextInt())
        {
          int[] col1 = new int[3];
          int[] col2 = new int[3];
          int[] col3 = new int[3];
          col1[0] = input.nextInt();
          col2[0] = input.nextInt();
          col3[0] = input.nextInt();
          col1[1] = input.nextInt();
          col2[1] = input.nextInt();
          col3[1] = input.nextInt();
          col1[2] = input.nextInt();
          col2[2] = input.nextInt();
          col3[2] = input.nextInt();

          count += isTriangle(col1[0],col1[1],col1[2]);
          count += isTriangle(col2[0],col2[1],col2[2]);
          count += isTriangle(col3[0],col3[1],col3[2]);
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
      System.out.println("Number of triangles by countTrianglesA: "+countTrianglesA("inputTri.txt"));
      System.out.println("Number of triangles by countTrianglesB: "+countTrianglesB("inputTri.txt"));
    }
}
