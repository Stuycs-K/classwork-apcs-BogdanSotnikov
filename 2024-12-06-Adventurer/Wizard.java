public class Wizard extends Adventurer
{
  private int mana, maxMana;

  public Wizard(String name){
      super(name, 8);
      maxMana = 4;
      mana = 1;
  }

  public Wizard(String name, int hp){
      super(name, hp);
      maxMana = 4;
      mana = 1;
  }

  public String getSpecialName()
  {
    return "mana";
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
    if (getHP()>getmaxHP())
      setHP(getmaxHP());
    setSpecial(getSpecial()+2);
    return this + " heals self by 1 HP. Gains 2 "+getSpecialName();
  }

  public String specialAttack(Adventurer other)
  {
    if (getSpecial()>0)
    {
      other.applyDamage(4);
      setSpecial(getSpecial()-1);
      return this+" uses "+getSpecialName()+" to attack "+other+". Deals 4 damage.";
    }
    return "Not enough "+getSpecialName()+".";
  }
}
