public class Student extends Person {
  int studentNo;

  public Student(String name, String san, int studentNo) {
    super(name, san);
    this.studentNo = studentNo;
  }

  public void say(String name) {
    System.out.println("my name is " + name);
  }
}
