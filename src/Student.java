public class Student {
  int level;

  public Student() {
    this.level = 1;
  }

  public void levelUp() {
    this.level++;
    System.out.println("레벨이 1 상승했습니다!");
  }

  public void levelDown() {
    this.level--;
    System.out.println("레벨이 1 하락했습니다.");
  }
}
