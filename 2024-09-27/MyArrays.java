public class MyArrays
{
  public String arrayToString(int[] nums)
  {
    String s = "[";

    for (int i = 0; i<nums.length; i++)
    {
      s += nums[i];
      if (i<nums.length-1)
        s += ", ";
    }
    return s+"]";
  }

  public static void main(String[] args)
  {
    
  }
}
