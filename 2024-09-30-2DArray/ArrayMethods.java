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

}
