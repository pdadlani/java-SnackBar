package snackBarApp;

public class Main
{
  public static void workWithData()
  {
    // instantiate anything you want here
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    Vendingmachine food = new Vendingmachine("Food");
    Vendingmachine drink = new Vendingmachine("Drink");
    Vendingmachine office = new Vendingmachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolatebar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    // processing
    System.out.println("*** Data ***");
    System.out.println("1.");
    soda.buySnack(3);
    jane.buy(soda.getTotalCost(3));
    System.out.println("Jane cash on hand after buying 3 sodas $" + jane.getCashOnHand());
    System.out.println("Soda quantity after 3 bought " + soda.getQuantity());
    
    System.out.println("2.");
    pretzel.buySnack(1);
    jane.buy(pretzel.getTotalCost(1));
    System.out.println("Jane cash on hand after buying 1 pretzel $" + jane.getCashOnHand());
    System.out.println("Pretzel quantity after 1 bought " + pretzel.getQuantity());

    System.out.println("3.");
    soda.buySnack(2);
    bob.buy(soda.getTotalCost(2));
    System.out.println("Bob cash on hand after buying 2 sodas $" + bob.getCashOnHand());
    System.out.println("Soda quantity after 2 bought " + soda.getQuantity());

    System.out.println("4.");
    jane.addCash(10);
    System.out.println("Jane found $10; her new balance is $" + jane.getCashOnHand());

    System.out.println("5.");
    chocolatebar.buySnack(1);
    jane.buy(chocolatebar.getTotalCost(1));
    System.out.println("Jane cash on hand after buying 1 chocolate bar $" + jane.getCashOnHand());
    System.out.println("Chocolate bar quantity after 1 bought " + chocolatebar.getQuantity());

    System.out.println("6.");
    pretzel.addQuantity(12);
    System.out.println("12 more pretzels added; new quantity is " + pretzel.getQuantity());

    System.out.println("7.");
    pretzel.buySnack(3);
    bob.buy(pretzel.getTotalCost(3));
    System.out.println("Bob cash on hand after buying 3 pretzels $" + bob.getCashOnHand());
    System.out.println("Pretzel quantity after 3 bought " + pretzel.getQuantity());

  }

  public static void main(String[] args)
  {
    workWithData();
  }
}