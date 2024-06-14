public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0) {
            throw new InvalidAgeException("나이는 자연수여야 합니다.");
        }
        this.age = age;
    }
}
