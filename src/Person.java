public class Person {
  String name;
  String phoneNum;
  int age;
  int money;
  String address;

  public Person(String name, String phoneNum) {
    this.name = name;
    this.phoneNum = phoneNum;
  }

  public Person(String name, String phoneNumber, int age, String address) {
    this.name = name;
    this.phoneNum = phoneNumber;
    this.age = age;
    this.address = address;
  }

  public Person(String name, String phoneNumber, int age, int money) {
    this.name = name;
    this.phoneNum = phoneNumber;
    this.age = age;
    this.money = money;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + name);
  }

  public void teaching(Student student) {
    student.levelUp();
  }

  public void cheating(Student student) {
    student.levelDown();
  }

  public void sayMoney() {
    System.out.println("money: " + money * 10000);
  }
}
