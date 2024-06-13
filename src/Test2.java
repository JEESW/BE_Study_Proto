public class Test2 {
  public static void main(String[] args) {
    Dog dog = new Dog(10);
    dog.setName("용팔이");
    dog.sleep();
    dog.sleep(100);

    Student student = new Student("SeungJo", "a", 1);
    System.out.println(student.name);
    System.out.println(student.ssn);
    System.out.println(student.studentNo);

    Child child = new Child();

    child.method1();
    child.method2();
    child.method3();
  }
}
