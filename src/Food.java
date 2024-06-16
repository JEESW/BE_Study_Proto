public class Food extends Product {
  private int expirationDate;

  public Food(String name, int price, int stock, int expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice() {
    if (expirationDate <= 7) {
      return (int) (super.calculatePrice() * 0.8);
    }
    return super.calculatePrice();
  }
}
