//1. Patrick Tang: patrickt74@nycstudents.net    Bogdan Sotnikov: bogdans2789@nycstudents.net
public class ArrayMethods{
  public static void main(String[]args){
    System.out.println("2d arrToString test:");
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}).equals("[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}, {2}}).equals("[[2, 3, 4], [5, 6], [2]]"));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {}, {}}).equals("[[2, 3, 4], [], []]"));
    System.out.println(arrToString(new int[][] {{}, {}, {}}).equals("[[], [], []]"));
    System.out.println(arrToString(new int[3][]).equals("[null, null, null]"));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}}).equals("[[2, 3, 4], [5, 6]]"));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}, {2}, {}, {0, 2, 3}}).equals("[[2, 3, 4], [5, 6], [2], [], [0, 2, 3]]"));

    System.out.println("arr2DSum test:");
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}}) == 27);
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {5, 6}, {2}}) == 22);
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {}, {}}) == 9);
    System.out.println(arr2DSum(new int[][] {{}, {}, {}}) == 0);
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {5, 6}}) == 20);
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {5, 6}, {2}, {}, {0, 2, 3}}) == 27);

    System.out.println("swapRC test:");
    System.out.println(arrToString(swapRC(new int [4][3])).equals(arrToString(new int[3][4])));
    System.out.println(arrToString(swapRC(new int [][] {{1, 2, 3, 4}, {5, 6, 7, 8}})).equals(arrToString(new int[][]{{1, 5}, {2, 6}, {3, 7}, {4, 8}})));
    System.out.println(arrToString(swapRC(new int [][] {{1, 2, 3}, {5, 6, 7}, {8, 9, 10}})).equals(arrToString(new int[][]{{1, 5, 8}, {2, 6, 9}, {3, 7, 10}})));
    System.out.println(arrToString(swapRC(new int [][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}})).equals(arrToString(new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}})));

    System.out.println("replaceNegative tests:");
    int[][] tested = new int[][] {{74}, {5}, {-2}, {-4}, {3}};
    System.out.println("Result of replaceNegative("+arrToString(tested)+"):");
    replaceNegative(tested);
    tested = new int[][] {{-2, 3, 4, -6}, {5, -59, 2746, -444}, {-2, 3, -50, 488}, {-4, 1, 1, -1}};
    System.out.println("Result of replaceNegative("+arrToString(tested)+"):");
    replaceNegative(tested);
    tested = new int[][] {{74, 0, 0, 0, 0, 2434, -4}, {5}, {-2, 3, -999}, {-4}, {3}};
    System.out.println("Result of replaceNegative("+arrToString(tested)+"):");
    replaceNegative(tested);
    tested = new int[4][];
    System.out.println("Result of replaceNegative("+arrToString(tested)+"):");
    replaceNegative(tested);

    System.out.println("copy tests:");
    int[][] orig = new int[0][];
    int[][] copy = copy(orig);
    System.out.println("original: "+arrToString(orig));
    System.out.println("copy: "+arrToString(copy));
    orig = new int[9999][];
    System.out.println("copy after editing original: "+arrToString(copy));
  }

  public static String arrToString(int[] nums){
    String s="[";
    for(int i=0; i<nums.length;i++){
      s+=nums[i];
      if(i<nums.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }

    public static String arrToString(int[][] nums){
      String s="[";
      for(int i=0; i<nums.length;i++){
        if (nums[i] == null)
          s+= "null";
        else
        {
          s+="[";
          for (int j = 0; j<nums[i].length; j++)
          {
            s+=nums[i][j];
            if(j<nums[i].length-1)
              s+=", ";
          }
          s+="]";
        }
        if (i<nums.length-1)
          s+=", ";
      }
      return s+"]";
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

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] out = new int[nums.length][];

    for(int i = 0; i<nums.length;i++)
    {
      if (nums[i] == null)
        out[i] = null;
      else
      {
        for(int j = 0; j<nums[i].length;j++)
        {
          out[i][j] = nums[i][j];
        }
      }
    }

    return out;
  }
}
