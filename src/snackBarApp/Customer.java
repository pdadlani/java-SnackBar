package snackBarApp;

public class Customer
{
  // fields
  private static int maxID = 0;
  private int id;
  private String name;
  private double cashOnHand;

  // constructor
  public Customer(String name, double cashOnHand)
  {
    maxID++;

    id = maxID;

    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  // methods
  public double addCash(double amountDeposited)
  {
    return cashOnHand += amountDeposited;
  }

  public double buy(double amountWithdrawn)
  {
    return cashOnHand -= amountWithdrawn;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getCashOnHand()
  {
    return cashOnHand;
  }

}