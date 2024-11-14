import java.util.ArrayList;

public class ArrayListPractice
{
  public static ArrayList<String> createRandomArray(int size)
  {
    ArrayList<String> Random = new ArrayList<String>(size);

    for (int i = 0; i<size; i++)
    {
      Random.add(""+((int)(21*Math.random())));
      if (Random.get(i) == "0")
        Random.set(i, "");
    }

    return Random;
  }

  public static void main(String[] args) {
    System.out.println(createRandomArray(5));
  }
}
