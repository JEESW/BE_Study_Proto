import java.util.Objects;

public class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Member member)) return false;
    return age == member.age && Objects.equals(name, member.name);

    //    직접 equals 만들어 보기
    //    if (o instanceof Member) {
    //      Member member = (Member) o;
    //      return member.name.equals(this.name) && member.age == this.age;
    //    } else {
    //      return false;
    //    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);

    //    직접 hashCode 만들어 보기
    //    int i = name.hashCode() + age;
    //    System.out.println(i);
    //    return i;
  }
}
