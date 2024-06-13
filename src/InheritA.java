public class InheritA {
  int field1;
  private int s1;

  public InheritA(int field1, int s1) {
    this.field1 = field1;
    this.s1 = s1;
  }

  void method1() {
    System.out.println("InheritA.method1 field1 = " + field1);
  }

  private void method3() {
    System.out.println("이것은 프라이빗");
  }
}
