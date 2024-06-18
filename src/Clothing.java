public class Clothing extends Product {
    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        if (this.size.equals("L")
                || this.size.equals("XL")
                || this.size.equals("XXL")
                || this.size.equals("XXXL")) {
            return (int) (super.calculatePrice() * 1.1);
        }
        return super.calculatePrice();
    }
}