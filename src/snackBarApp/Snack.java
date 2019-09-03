package snackBarApp;

public class Snack
{
  // fields - state of object and information it knows
  private static int maxID = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // constructor - must have EXACT same name as class
  public Snack(String name, int quantity, double cost, int vendingMachineId)
  {
    maxID++;

    id = maxID;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // methods
  // set and get id; set done in constructor
  public int getId()
  {
    return id;
  }

  // set and get name
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  // set and get cost
  public double getCost()
  {
    return cost;
  }

  public void setCost(int cost)
  {
    this.cost = cost;
  }

  // set and get vending machine id
  public int getVendingMachingId()
  {
    return vendingMachineId;
  }

  public void setVendingMachineId(int vendingMachineId)
  {
    this.vendingMachineId = vendingMachineId;
  }

  // get quantity
  public int getQuantity()
  {
    return quantity;
  }

  // add quantity when given how many to add
  public int addQuantity(int quantity)
  {
    return this.quantity += quantity;
  }

  // buy snack when given how many to buy
  public int buySnack(int quantity)
  {
    return this.quantity -= quantity;
  }

  // get total cost given a quantity
  public double getTotalCost(int quantity)
  {
    return quantity * cost;
  }

  @Override
  public String toString()
  {
    String rtnStr = "ID: " + id + "\n" +
      "Name: " + name + "\n" +
      "Quantity: " + quantity + "\n" +
      "Cost: " + cost + "\n" +
      "Vending Machine ID: " + vendingMachineId + "\n";

    return rtnStr;
  }
}