public class DailyQuizMySelf {
  String name;
  int age;
  String gender;
  String status;

  DailyQuizMySelf(String status) {
    name = "Ji Seungwoo";
    age = 27;
    gender = "Male";
    this.status = status;
  }

  public void infoI() {
    System.out.println("이름은 " + name + "입니다.");
    System.out.println("나이는 " + age + "이고요.");
    System.out.println("성별은 " + gender + "이랍니다.");
    System.out.println("현재 " + status + "합니다!");
  }

  public void bothering(DailyQuizFriend dqf) {
    dqf.upStress();
  }
}
