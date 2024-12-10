import java.util.Scanner;

class Game
{
  static String[] names = new String[]{"John", "Dave", "Bob", "Jimmy"};
  static Adventurer player, enemy;

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    player = new CodeWarrior(userName);
    enemy = new Wizard(names[(int)(Math.random()*names.length)]);
    System.out.println(userName + " vs " + enemy);
    if ((int)(Math.random()*2) == 0)
        enemyTurn();
        stats();
    while(player.getHP() > 0 && enemy.getHP() > 0)
    {
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport");
      String input = userInput.nextLine();
      while (!(input.equals("quit") || input.equals("a") || input.equals("attack") || input.equals("sp") || input.equals("special") || input.equals("su") || input.equals("support")))
      {
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport");
        input = userInput.nextLine();
      }
      if (input.equals("a") || input.equals("attack"))
        System.out.println(player.attack(enemy));
      else if (input.equals("sp") || input.equals("special"))
        System.out.println(player.specialAttack(enemy));
      else if (input.equals("su") || input.equals("support"))
        System.out.println(player.support());
      else if (input.equals("quit"))
        System.exit(0);

      enemyTurn();
      stats();
    }

  }

  public static void enemyTurn()
  {
    if (enemy.getHP()>3)
      if (player.getHP()>3 && enemy.getSpecial()>0)
        System.out.println(enemy.specialAttack(player));
      else
        System.out.println(enemy.attack(player));
    else
      System.out.println(enemy.support());
  }

  public static void stats()
  {
    System.out.println("\n" + player + " has " + player.getHP() + " hit points and " + player.getSpecial() + " " + player.getSpecialName());
    System.out.println(enemy + " has " + enemy.getHP() + " hit points and " + enemy.getSpecial() + " " + enemy.getSpecialName()+"\n");
  }
}
