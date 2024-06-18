public class PremiumShoppingMall extends ShoppingMall {
    public PremiumShoppingMall(int len) {
        super(len);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        if (product.getStock() >= 10) {
            return true;
        }
        return false;
    }
}