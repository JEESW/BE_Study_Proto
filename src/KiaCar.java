public class KiaCar implements Car {

  @Override
  public String showEngine() {
    return "엄청난 엔진";
  }

  @Override
  public int amountNavi() {
    return 300000;
  }

  @Override
  public String getTire() {
    return "펑크 안 나는 타이어";
  }
}
