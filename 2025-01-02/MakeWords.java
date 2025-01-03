class MakeWords
{
  public static void main(String[] args)
  {
    makeWords(Integer.parseInt(args[0]),"",args[1]);
  }

  public static void makeWords(int len, String result, String alphabet)
  {
    if (len == 0)
      System.out.println(result);
    else
      for (int i = 0; i <alphabet.length(); i++)
      {
        makeWords(len-1, result+alphabet.charAt(i), alphabet);
      }
  }
}
