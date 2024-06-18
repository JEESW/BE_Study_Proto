public abstract class ShoppingMall {
  private Product[] p;
  private int last;
  private int len;

  public ShoppingMall(int len) {
    this.p = new Product[len];
    this.last = -1;
    this.len = len;
  }

  public void addProduct(Product p) {
    this.last++;

    if (this.last >= len) {
      this.len *= 2;
      Product[] tmp = new Product[len];
      for (int i = 0; i < last; i++) {
        tmp[i] = this.p[i];
      }
      this.p = tmp;
    }

    this.p[last] = p;
  }

  public void removeProduct(Product p) {
    if (this.p.length == 0) {
      return;
    }

    boolean isDeleted = false;

    for (int i = 0; i <= this.last; i++) {
      if (this.p[i] == p) {
        this.p[i] = null;
        isDeleted = true;
        continue;
      }

      if (isDeleted) {
        this.p[i - 1] = this.p[i];
      }
    }
    if (isDeleted) {
      this.p[this.last] = null;
      this.last--;
    } else {
      System.out.println("해당하는 물품이 없습니다.");
    }
  }

  public void removeProduct(String name) {
    if (this.p.length == 0) {
      return;
    }

    int idx = 0;
    boolean isDeleted = false;

    for (int i = 0; i <= this.last; i++) {
      if (this.p[i].getName().equals(name)) {
        this.p[i] = null;
        idx = i + 1;
        isDeleted = true;
        break;
      }
    }
    if (isDeleted) {
      for (int i = idx; i <= this.last; i++) {
        this.p[i - 1] = this.p[i];
      }
      this.p[this.last] = null;
      this.last--;
    } else {
      System.out.println("해당하는 물품이 없습니다.");
    }
  }

  public void displayProducts() {
    System.out.println();
    System.out.println("------------------------------------------------");
    for (int i = 0; i <= this.last; i++) {
      System.out.println("제품 이름: " + this.p[i].getName());
      System.out.println("제품 가격: " + this.p[i].getPrice());
      System.out.println("재고량: " + this.p[i].getStock() + "개");
      System.out.println("행사 판매 가격: " + this.p[i].calculatePrice() + "원");
      System.out.println("------------------------------------------------");
    }
    System.out.println();
  }

  public void displayProducts(int start) {
    System.out.println();

    if (start < 0 || start > this.last) {
      System.out.println("올바른 범위의 값을 입력하세요!");
      System.out.println();
      return;
    }
    System.out.println("------------------------------------------------");
    for (int i = start; i <= this.last; i++) {
      System.out.println("제품 이름: " + this.p[i].getName());
      System.out.println("제품 가격: " + this.p[i].getPrice());
      System.out.println("재고량: " + this.p[i].getStock() + "개");
      System.out.println("행사 판매 가격: " + this.p[i].calculatePrice() + "원");
      System.out.println("------------------------------------------------");
    }

    System.out.println();
  }

  public void displayProducts(int start, int end) {
    System.out.println();

    if (start < 0 || start >= end || end > this.last + 1) {
      System.out.println("올바른 범위의 값을 입력하세요!");
      System.out.println();
      return;
    }

    System.out.println("------------------------------------------------");
    for (int i = start; i < end; i++) {
      System.out.println("제품 이름: " + this.p[i].getName());
      System.out.println("제품 가격: " + this.p[i].getPrice());
      System.out.println("재고량: " + this.p[i].getStock() + "개");
      System.out.println("행사 판매 가격: " + this.p[i].calculatePrice() + "원");
      System.out.println("------------------------------------------------");
    }

    System.out.println();
  }

  public abstract boolean checkOrderAvailability(Product product);
}
