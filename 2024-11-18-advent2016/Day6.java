import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day6
{
  public static String Decode(String filename)
  {
    String message = "";

    try
    {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String line = input.nextLine();
      String[] columns = new String[line.length()];
      Arrays.fill(columns, "");
      while (input.hasNextLine())
      {
        for (int i = 0; i<line.length(); i++)
        {
          columns[i] += line.charAt(i);
        }
        line = input.nextLine();
      }
      for (int i = 0; i<line.length(); i++)
      {
        columns[i] += line.charAt(i);
      }
      for (int i = 0; i<columns.length; i++)
      {
        int[] alphabetValues = new int[26];
        for (int j = 0; j<columns[i].length(); j++)
        {
          alphabetValues[columns[i].charAt(j)-97]++;
        }
        message += (char)(highestIndex(alphabetValues)+97);
      }
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
    }
    return message;
  }

  public static int highestIndex(int[] nums)
  {
    int max = 0;
    for (int i = 1; i<nums.length; i++)
    {
      if (nums[i] > nums[max])
        max = i;
    }
    nums[max] = 0;
    return max;
  }

  public static void main(String[] args)
  {
    System.out.println(Decode("InputDay6.txt"));
  }
}
