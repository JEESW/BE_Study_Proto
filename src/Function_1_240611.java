import com.sun.tools.javac.Main;

public class Function_1_240611 {
  public static int mySum(int a, int b) {
    return a + b;
  }

  public static int mySub(int a, int b) {
    return a - b;
  }

  public static int myMul(int a, int b) {
    return a * b;
  }

  public static double myDiv(int a, int b) {
    return (double) a / b;
  }

  static void login(String email, String password) {

  }

  private void add() {
    System.out.println("add");
  }

  public static void main(String[] args) {
    System.out.println(mySum(1, 2));
    System.out.println(mySub(1, 2));
    System.out.println(myMul(1, 2));
    System.out.println(myDiv(1, 2));
  }
}
