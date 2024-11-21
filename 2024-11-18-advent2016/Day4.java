import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day4
{
  public static int RealRoom(String filename)
  {
    int sum = 0;

    try
    {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int current = 5;
      while(input.hasNextLine())
      {
        String line = input.nextLine();
        String name = line.split("\\[")[0];
        int[] alphabetValues = new int[26];
        for (int i = 0; i<name.length(); i++)
        {
          if(name.charAt(i) != '-' && Character.isLetter(name.charAt(i)))
            alphabetValues[name.charAt(i)-97]++;
        }
        String checksum = "" + (char)(highestIndex(alphabetValues)+97) + (char)(highestIndex(alphabetValues)+97) + (char)(highestIndex(alphabetValues)+97) + (char)(highestIndex(alphabetValues)+97) + (char)(highestIndex(alphabetValues)+97);
        if (line.split("\\[")[1].substring(0,5).equals(checksum))
          sum+=Integer.parseInt(name.split("-")[name.split("-").length-1]);
      }
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
    }
    return sum;
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
    System.out.println(RealRoom("InputDay4.txt"));
  }
}
