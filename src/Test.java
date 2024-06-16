public class Test {
  public static void main(String[] args) {
    ShoppingMall shoppingMall = new ShoppingMall(2);

    Clothing c1 = new Clothing("한복", 300000, 5, "XL");
    Clothing c2 = new Clothing("무난한 셔츠", 35000, 31, "M");

    Electronics e1 = new Electronics("모니터", 420000, 11, "Apple");
    Electronics e2 = new Electronics("냉장고", 860000, 2, "Samsung");

    Food f1 = new Food("햄", 3000, 30, 7);
    Food f2 = new Food("치즈", 4000, 45, 10);

    shoppingMall.addProduct(c1);
    shoppingMall.addProduct(c2);
    shoppingMall.displayProducts();
    shoppingMall.addProduct(e1);
    shoppingMall.displayProducts(1 );
    shoppingMall.addProduct(e2);
    shoppingMall.displayProducts();
    shoppingMall.removeProduct(c1);
    shoppingMall.removeProduct(c2);
    shoppingMall.removeProduct(e1);
    shoppingMall.displayProducts();
    shoppingMall.addProduct(f1);
    shoppingMall.addProduct(f2);
    shoppingMall.displayProducts(2, 3);
  }
}
