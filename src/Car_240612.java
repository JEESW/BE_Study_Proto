public class Car_240612 {
  private int speed = 100;
  private int gear;

  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  //  public Car_240612(int speed, int gear) {
  //    this.speed = speed;
  //    this.gear = gear;
  //  }

  public int getGear() {
    return gear;
  }

  public String getWheel() {
    return wheel;
  }

  public int getCc() {
    return cc;
  }

  public String getLogo() {
    return logo;
  }

  public String getEngine() {
    return engine;
  }

  public double getSpeed() {
    return this.speed * 1.6;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    }
    this.speed = speed;

    if (speed <= 30) {
      this.gear = 1;
    } else if (speed <= 70) {
      this.gear = 2;
    } else {
      this.gear = 3;
    }
  }

  public void checkSpeed() {
    System.out.println(this.speed);
  }
}
