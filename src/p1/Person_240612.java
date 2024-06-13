package p1;

public class Person_240612 {
  private String name2;
  String name;
  int age;
  public final String test;
  int gold = 999999999;
  public static final double PI = 3.14159;
  private static int cnt = 0;

  public Person_240612(String name, int age) {
    this.name = name;
    this.age = age;
    this.test = "123";
  }

  public Person_240612(String name, int age, String test) {
    this.name = name;
    this.age = age;
    this.test = test;
  }

  private String checkAmount(int amount) {
    if (amount > this.gold) {
      return "요청하신 금액이 너무 큽니다.";
    }
    return "정상처리되었습니다.";
  }

  public String deposit(int amount) {
    return checkAmount(amount);

  }

  public static void counting() {
    cnt++;
    System.out.println(cnt);
  }

  public void sayHello() {
    System.out.println(getName2());
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  protected void testMethod() {
    System.out.println("test");
  }

  private String getName2() {
    return this.name2;
  }
}
