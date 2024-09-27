public class MyArrays
{
  public static String arrayToString(int[] nums)
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

  public static int[] returnCopy(int[]ary)
  {
    int[] out = new int[ary.length];
    return out;
  }

  public static int[] concatArray(int[]ary1,int[]ary2)
  {
    int[] out = new int[ary1.length+ary2.length];
    return out;
  }

  public static void main(String[] args)
  {
    //returnCopy tests
    int[] arr = new int[] {1, 2, 3, 4, 5};
    System.out.println("returnCopy tests:");
    System.out.println(arrayToString(returnCopy(arr)).equals(arrayToString(arr)));
    arr = new int[0];
    System.out.println(arrayToString(returnCopy(arr)).equals(arrayToString(arr)));
    arr = new int[] {4, 4, 4, 4, 4};
    System.out.println(arrayToString(returnCopy(arr)).equals(arrayToString(arr)));
    arr = new int[] {0};
    System.out.println(arrayToString(returnCopy(arr)).equals(arrayToString(arr)));

    //concatArray tests
    int[] arr1 = new int[] {1, 2, 3};
    int[] arr2 = new int[] {4, 5, 6};
    System.out.println("concatArray tests:");
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(arrayToString(arr1)+arrayToString(arr2)));
    arr1 = new int[0];
    arr2 = new int[0];
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(arrayToString(arr1)+arrayToString(arr2)));
  }
}
