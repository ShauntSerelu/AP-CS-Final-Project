package src.logic.armor;

public class Armor
{
  private int durability, armorClass;
  private String name;
  
  public Armor(int dur, int aC, String str)
  {
    durability = dur;
    armorClass = aC;
    name = str;
  }
  
  public int getDurability()
  {
    return durability;
  }
  
  public int getArmorClass()
  {
    return armorClass;
  }
  
  public void setDurability(int dur)
  {
    durability = dur;
  }
  
  public void setArmorClass(int aC)
  {
    armorClass = aC;
  }
  
  public Armor[] armorArray = {};
}
