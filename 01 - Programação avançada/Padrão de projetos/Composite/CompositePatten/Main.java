class Main {
  public static void main(String[] args) 
    {
        try {
          // Creating a component tree
          Component component = new CompositeAccount();
  
          // Adding all accounts of a customer to component
          component.add(new DepositAccount("DA001", 100));
          component.add(new DepositAccount("DA002", 150));

          Component subComponent = new CompositeAccount();
          component.add(subComponent);
          subComponent.add(new SavingsAccount("SA001", 200));
  
          // getting composite balance for the customer
          float totalBalance = component.getBalance();
          System.out.println("Total Balance : " + totalBalance);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }
}