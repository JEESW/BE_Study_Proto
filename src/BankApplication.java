public class BankApplication {
  public static void main(String[] args) {
    BankAcount account = new BankAcount();
    try {
      account.withdraw(10000);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
