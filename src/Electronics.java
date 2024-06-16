public class Electronics extends Product {
  private String brand;

  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    if (this.brand.equals("Apple")) {
      return (int) (super.calculatePrice() * 1.2);
    }
    return super.calculatePrice();
  }
}
