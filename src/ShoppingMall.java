public abstract class ShoppingMall {
  private Product[] p;
  private int last;
  private int len;

  public ShoppingMall(int len) {
    this.p = new Product[len];
    this.last = -1;
    this.len = len;
  }

  public void addProduct(Clothing c) {
    this.last++;

    if (this.last >= len) {
      this.len *= 2;
      Product[] tmp = new Product[len];
      for (int i = 0; i < last; i++) {
        tmp[i] = this.p[i];
      }
      this.p = tmp;
    }

    this.p[last] = c;
  }

  public void addProduct(Electronics e) {
    this.last++;

    if (this.last >= len) {
      this.len *= 2;
      Product[] tmp = new Product[len];
      for (int i = 0; i < last; i++) {
        tmp[i] = this.p[i];
      }
      this.p = tmp;
    }

    this.p[last] = e;
  }

  public void addProduct(Food f) {
    this.last++;

    if (this.last >= len) {
      this.len *= 2;
      Product[] tmp = new Product[len];
      for (int i = 0; i < last; i++) {
        tmp[i] = this.p[i];
      }
      this.p = tmp;
    }

    this.p[last] = f;
  }

  public void removeProduct(Clothing c) {
    if (this.p.length == 0) {
      return;
    }

    boolean isDeleted = false;

    for (int i = 0; i <= this.last; i++) {
      if (this.p[i] == c) {
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

  public void removeProduct(Electronics e) {
    if (this.p.length == 0) {
      return;
    }

    boolean isDeleted = false;

    for (int i = 0; i <= this.last; i++) {
      if (this.p[i] == e) {
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

  public void removeProduct(Food f) {
    if (this.p.length == 0) {
      return;
    }

    boolean isDeleted = false;

    for (int i = 0; i <= this.last; i++) {
      if (this.p[i] == f) {
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

  public void displayProducts() {
    System.out.println();
    for (int i = 0; i <= this.last; i++) {
      System.out.println(this.p[i].getName() + " (판매 가격: " + this.p[i].calculatePrice() + "원)");
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

    for (int i = start; i <= this.last; i++) {
      System.out.println(this.p[i].getName() + " (판매 가격: " + this.p[i].calculatePrice() + "원)");
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

    for (int i = start; i < end; i++) {
      System.out.println(this.p[i].getName() + " (판매 가격: " + this.p[i].calculatePrice() + "원)");
    }

    System.out.println();
  }

  public abstract boolean checkOrderAvailability(Product product);
}
