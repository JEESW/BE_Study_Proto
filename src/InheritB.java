public class InheritB extends InheritA {
  String field2;

  public InheritB(int field1, int s1) {
    super(field1, s1);
  }

  void method2() {
    System.out.println("InheritB.method2 field2 = " + field2);
  }
}
