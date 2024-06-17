public class SamsungPhone implements Phone {

  @Override
  public String call() {
    return "삼성 폰이 전화를 겁니다.";
  }

  @Override
  public String answerThePhone() {
    return "삼성 폰이 전화를 받습니다.";
  }
}
