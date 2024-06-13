public class Person {
  String name;
  String ssn;

  public Person(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }

  public void say() {
    System.out.println("my name is = " + this.name);
  }
}
