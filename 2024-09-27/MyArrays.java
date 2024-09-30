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

    for(int i = 0; i<ary.length;i++)
    {
      out[i] = ary[i];
    }

    return out;
  }

  public static int[] concatArray(int[]ary1,int[]ary2)
  {
    int[] out = new int[ary1.length+ary2.length];

    for(int i = 0; i<out.length;i++)
    {
      if(i<ary1.length)
        out[i] = ary1[i];
      else
        out[i] = ary2[i-ary1.length];
    }

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
    String expected = arrayToString(arr1).substring(0,arrayToString(arr1).length()-1)+", "+arrayToString(arr2).substring(1);
    if (arr1.length == 0)
    {
      expected = arrayToString(arr2).substring(1);
    }
    System.out.println("concatArray tests:");
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(expected));
    arr1 = new int[0];
    arr2 = new int[0];
    expected = arrayToString(arr1).substring(0,arrayToString(arr1).length()-1)+", "+arrayToString(arr2).substring(1);
    if (arr1.length == 0)
    {
      expected = arrayToString(arr2);
    }
    else if (arr2.length == 0)
    {
      expected = arrayToString(arr1);
    }
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(expected));
    arr1 = new int[0];
    arr2 = new int[] {2,3,4,5};
    expected = arrayToString(arr1).substring(0,arrayToString(arr1).length()-1)+", "+arrayToString(arr2).substring(1);
    if (arr1.length == 0)
    {
      expected = arrayToString(arr2);
    }
    else if (arr2.length == 0)
    {
      expected = arrayToString(arr1);
    }
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(expected));
    arr1 = new int[] {2,3,4,5};
    arr2 = new int[0];
    expected = arrayToString(arr1).substring(0,arrayToString(arr1).length()-1)+", "+arrayToString(arr2).substring(1);
    if (arr1.length == 0)
    {
      expected = arrayToString(arr2);
    }
    else if (arr2.length == 0)
    {
      expected = arrayToString(arr1);
    }
    System.out.println(arrayToString(concatArray(arr1, arr2)).equals(expected));
  }
}
