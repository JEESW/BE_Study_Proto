public class Test {
  public static void main(String[] args) {
    ShoppingMall shoppingMall = new PremiumShoppingMall(2);

    Clothing c1 = new Clothing("한복", 300000, 5, "XL");
    Clothing c2 = new Clothing("무난한 셔츠", 35000, 31, "M");

    Electronics e1 = new Electronics("모니터", 420000, 11, "Apple");
    Electronics e2 = new Electronics("냉장고", 860000, 2, "Samsung");

    Food f1 = new Food("햄", 3000, 30, 7);
    Food f2 = new Food("치즈", 4000, 45, 10);

    System.out.println("c1과 c2 추가 후 전체 배열 출력!");
    shoppingMall.addProduct(c1);
    shoppingMall.addProduct(c2);
    shoppingMall.displayProducts();

    System.out.println();
    System.out.println("e1 추가 후 첫 번째 인덱스 부터 출력!");
    shoppingMall.addProduct(e1);
    shoppingMall.displayProducts(1);

    System.out.println();
    System.out.println("e2 추가 후 전체 배열 출력!");
    shoppingMall.addProduct(e2);
    shoppingMall.displayProducts();

    System.out.println();
    System.out.println("한복, 무난한 셔츠, e1 삭제 후 전체 배열 출력!");
    shoppingMall.removeProduct("한복");
    shoppingMall.removeProduct("무난한 셔츠");
    shoppingMall.removeProduct(e1);
    shoppingMall.displayProducts();

    System.out.println();
    System.out.println("f1, f2 추가 후 2번 인덱스 출력!");
    shoppingMall.addProduct(f1);
    shoppingMall.addProduct(f2);
    shoppingMall.displayProducts(2, 3);

    System.out.println();
    System.out.println("checkOrderAvailability c1?");
    System.out.println(shoppingMall.checkOrderAvailability(c1));
    System.out.println("checkOrderAvailability c2?");
    System.out.println(shoppingMall.checkOrderAvailability(c2));
  }
}
