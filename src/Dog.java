public class Dog extends Animal {
  int age;

  public Dog(int age) {
    super("okay", "남");
    this.age = age;
  }

  void sleep(int times) {
    super.setName("asdoas");
    System.out.println(name + "zzz... " + times + "hours");
  }
}
