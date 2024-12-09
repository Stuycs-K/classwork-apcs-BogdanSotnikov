class Driver
{
  String[] names = String[]{"John", "Dave", "Bob"}

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    player Adventurer = new CodeWarrior(userName);
    enemy Adventurer = new Wizard((int)(Math.random*names.length));
    System.out.println(userName + " vs " + enemy);
    if ((int)Math.random*2)
        enemyTurn();
    while(player.getHP() > 0 && enemy.getHP() > 0)
    {
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport");
      String input = userInput.nextLine();
      while (input.equals("a") || input.equals("attack") || input.equals("sp") || input.equals("special") || input.equals("su") || input.equals("support"))
      {
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport");
        input = userInput.nextLine();
      }
      if (input.equals("a") || input.equals("attack"))
        player.attack(enemy);
      else if (input.equals("sp") || input.equals("special"))
        player.specialAttack(enemy);
      else if (input.equals("su") || input.equals("support"))
        player.support();

      enemyTurn();
      stats();
    }

  }

  public static void enemyTurn()
  {

  }

  public static void stats()
  {
    System.out.println("\n" + player + " has " + player.getHP() + " hit points and " + player.getSpecial() + " " + player.getSpecialName());
    System.out.println(enemy + " has " + enemy.getHP() + " hit points and " + enemy.getSpecial() + " " + enemy.getSpecialName()+"\n");
  }
}
