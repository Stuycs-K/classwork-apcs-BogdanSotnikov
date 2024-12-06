public class Wizard extends Adventurer
{
  private int maxMana = 30;
  private int mana = maxMana;

  public Wizard(String name){
      super(name, 8);
  }

  public Wizard(String name, int hp){
      super(name, hp);
  }

  public String getSpecialName()
  {
    return "fireball";
  }

  public int getSpecial()
  {
    return mana;
  }

  public void setSpecial(int n)
  {
    if (n < maxMana)
      mana = n;
    else
      mana = maxMana;
    if (mana < 0)
      mana = 0;
  }

  public int getSpecialMax()
  {
    return maxMana;
  }

  public String attack(Adventurer other)
  {
    other.applyDamage(2);
    return this+" attacks "+other+" for 2 damage.";
  }

  public String support(Adventurer other)
  {
    other.setHP(getHP()+2);
    return this + " heals " + other + " by 2 HP.";
  }

  public String support()
  {
    setHP(getHP()+1);
    return this + " heals self by 1 HP.";
  }

  public String specialAttack(Adventurer other)
  {
    if (getSpecial()>0)
    {
      other.applyDamage(4);
      setSpecial(getSpecial()-1);
      return this+" uses "+getSpecialName()+" on "+other+". Deals 4 damage.";
    }
    return "Not enough mana to use "+getSpecialName()+".";
  }
}
