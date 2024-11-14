import java.util.ArrayList;

public class ArrayListPractice
{
  public static ArrayList<String> createRandomArray(int size)
  {
    ArrayList<String> Random = new ArrayList<String>(size);

    for (int i = 0; i<size; i++)
    {
      Random.add(""+((int)(21*Math.random())));
      if (Random.get(i).equals("0"))
        Random.set(i, "");
    }

    return Random;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size() ; i ++ ) {
      if(original.get(i).equals("")){
        original.set(i,"Empty");
      }
    }
  }

  public static void main(String[] args) {
    /*
    System.out.println(createRandomArray(5));
    System.out.println(createRandomArray(1));
    System.out.println(createRandomArray(0));
    System.out.println(createRandomArray(100));
    */

    //test replaceEmpty
    ArrayList<String> a1 = createRandomArray(100);
    System.out.println(a1);
    replaceEmpty(a1);
    System.out.println(a1);
  }
}
