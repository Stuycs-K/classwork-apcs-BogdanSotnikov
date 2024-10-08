import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    System.out.println("2d arrToString test:");
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}).equals(Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}})));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}, {2}}).equals(Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6}, {2}})));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {}, {}}).equals(Arrays.deepToString(new int[][] {{2, 3, 4}, {}, {}})));
    System.out.println(arrToString(new int[][] {{}, {}, {}}).equals(Arrays.deepToString(new int[][] {{}, {}, {}})));
    System.out.println(arrToString(new int[3][]).equals(Arrays.deepToString(new int[3][])));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}}).equals(Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6}})));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}, {2}, {}, {0, 2, 3}}).equals(Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6}, {2}, {}, {0, 2, 3}})));

    System.out.println("\n countZeros2D test:");
    int[][] tested = new int[3][3];
    System.out.println("countZeros2D("+Arrays.deepToString(tested)+") = "+countZeros2D(tested));
    tested = new int[][] {{1, 3, 4}, {0, 0, 0}, {1, 0, 9}};
    System.out.println("countZeros2D("+Arrays.deepToString(tested)+") = "+countZeros2D(tested));
    tested = new int[][] {{0}, {0, 0, 0}, {1, 0}};
    System.out.println("countZeros2D("+Arrays.deepToString(tested)+") = "+countZeros2D(tested));
    tested = new int[][] {{1, 3, 4}, {5, 5, 5}, {1, 2, 9}};
    System.out.println("countZeros2D("+Arrays.deepToString(tested)+") = "+countZeros2D(tested));
  }

  public static String arrToString(int[] ary){
    String s="[";
    for(int i=0; i<ary.length;i++){
      s+=ary[i];
      if(i<ary.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }

    public static String arrToString(int[][] ary){
      String s="[";
      for(int i=0; i<ary.length;i++){
        if (ary[i] == null)
          s+= "null";
        else
        {
          s+="[";
          for (int j = 0; j<ary[i].length; j++)
          {
            s+=ary[i][j];
            if(j<ary[i].length-1)
              s+=", ";
          }
          s+="]";
        }
        if (i<ary.length-1)
          s+=", ";
      }
      return s+"]";
    }

  public static int countZeros2D(int[][] nums){
    int count = 0;

    for(int i = 0; i<nums.length;i++)
    {
      for (int j = 0; j<nums[i].length; j++)
        if (nums[i][j]==0)
          count++;
    }

    return count;
  }


  public static int arr2DSum(int[][]nums){
    int out = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int j = 0; j < nums[i].length; j++)
      {
        out += nums[i][j];
      }
    }
    return out;
  }

  public static void replaceNegative(int[][] vals)
  {
    int[][] out = new int[vals.length][];

    for (int i = 0; i<vals.length; i++)
    {
      if (vals[i] == null)
        out[i] = null;
      else
      {
        out[i] = new int[vals[i].length];
        for (int j = 0; j<vals[i].length; j++)
        {
          if (vals[i][j]<0)
          {
            if (j == i)
            {
              out[i][j] = 1;
            }
            else
              out[i][j] = 0;
          }
          else
            out[i][j] = vals[i][j];
        }
      }
    }
    System.out.println(arrToString(out));
  }

  public static int[][] copy(int[][] nums){
    int[][] out = new int[nums.length][];

    for(int i = 0; i<nums.length;i++)
    {
      if (nums[i] == null)
        out[i] = null;
      else
      {
        out[i] = new int[nums[i].length];
        for(int j = 0; j<nums[i].length;j++)
        {
          out[i][j] = nums[i][j];
        }
      }
    }

    return out;
  }

  public static int[][] swapRC(int[][]nums){
    int [][] out = new int[nums[0].length][nums.length];

    for(int i = 0; i<nums.length; i++)
    {
      for (int j = 0; j < nums[i].length; j++)
      {
        out[j][i] = nums[i][j];
      }
    }

    return out;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
