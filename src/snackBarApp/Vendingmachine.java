package snackBarApp;

public class Vendingmachine
{
  // fields
  private static int maxID = 0;
  private int id;
  private String name;

  // constructor
  public Vendingmachine(String name)
  {
    maxID++;

    id = maxID;

    this.name = name;
  }

  // methods
  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}