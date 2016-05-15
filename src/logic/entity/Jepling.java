package src.logic.entity;

public class Jepling extends Entity
{
  public Jepling()
  {
    super(1, 88.88, 250, 25, new Equipment());
  }
  
  @override
  public int getTotalArmorClass()
  {
    return 10;
  }
}
