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
  }

  //2. Copy your arrToString method from before.
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
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
  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    return 0;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

}
