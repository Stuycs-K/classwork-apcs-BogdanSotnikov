class Driver
{
  public static void main(String[] args) {
    Adventurer john = new Wizard("John");
    Adventurer paul = new Wizard("Paul", 5);
    System.out.println(john+"("+john.getHP()+" HP) vs. "+paul+"("+paul.getHP()+" HP)");
    System.out.println(john.attack(paul));
    System.out.println(paul+" now has "+paul.getHP()+" HP.");
    System.out.println(paul.specialAttack(john));
    System.out.println(john+" now has "+john.getHP()+" HP.");
    System.out.println(john.support());
    System.out.println(john+" now has "+john.getHP()+" HP.");
    System.out.println(paul.specialAttack(paul));
    System.out.println(paul+" now has "+paul.getHP()+" HP.");
  }
}
