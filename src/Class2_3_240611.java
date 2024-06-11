public class Class2_3_240611 {
  public static void main(String[] args) {
    Person person1 = new Person("나", "01012345678");
    Person person2 = new Person("너", "01112345678", 30, "Pogo");
    Person person3 = new Person("우리", "01234567890", 20, 22);
    Student student = new Student();

    System.out.println(student.level);
    person1.teaching(student);
    System.out.println(student.level);

    person3.sayMoney();

    System.out.println(student.level);
    person2.cheating(student);
    System.out.println(student.level);
  }
}
