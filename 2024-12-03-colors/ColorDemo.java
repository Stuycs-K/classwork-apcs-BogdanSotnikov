class ColorDemo
{
  public static void main(String[] args)
  {
    System.out.print("\u001b[?25l");
    System.out.print("\u001b[2J");
    go(0, 0);
    color(34, 34);
    go(5, 0);
    color(34, 34);
    go(6, 7);
    color(34, 34);
    System.out.print("\u001b[?25h");
  }

  public static void go(int r,int c)
  {
    System.out.print("\u001b[" + r + ";" + c + "f");
  }


  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }
}
