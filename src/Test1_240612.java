import p1.Person_240612;

public class Test1_240612 {
  public static void main(String[] args) {
    Person_240612 person1 = new Person_240612("승조", 25);
    Person_240612.counting();
    Person_240612 person2 = new Person_240612("max", 21);
    Person_240612.counting();
    Person_240612 person3 = new Person_240612("kite", 24, "final");
    Person_240612.counting();

    System.out.println(person1.test);
    System.out.println(person3.test);
    System.out.println(Person_240612.PI);

    person1.sayHello();
    person1.introduce();

    person2.sayHello();
    person2.introduce();

    //    person3.testMethod(); // protected라 자식이 아니거나 같은 패키지가 아니라면 접근 불가

    System.out.println(person3.deposit(100));
  }
}
