public class Animal {
  String name;
  String gender;

  public Animal(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzz...");
  }
}
