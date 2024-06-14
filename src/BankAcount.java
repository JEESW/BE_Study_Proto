public class BankAcount {
  private int balnace;

  public void withdraw(int amount) throws InsufficientBalanceException {
    if (balnace < amount) {
      throw new InsufficientBalanceException("잔액이 부족합니다.");
    }
    balnace -= amount;
  }
}
