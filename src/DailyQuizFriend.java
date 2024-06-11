import java.util.Random;

public class DailyQuizFriend {
  String name;
  int stress;

  DailyQuizFriend(String name, int stress) {
    this.name = name;
    this.stress = stress;
  }

  public void upStress() {
    Random rand = new Random();
    stress += rand.nextInt(80);
    System.out.println(name + "의 스트레스 수치는 " + stress + "입니다!");
    if (stress > 100) {
      System.out.println(name + "이 매우 빡쳤습니다! 충격에 대비하세요!");
    }
    else if (stress > 30) {
      System.out.println(name + "이 빡쳤습니다! 달래주시는 걸 추천드립니다!");
    }
  }
}
