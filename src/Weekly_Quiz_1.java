import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Weekly_Quiz_1 {
  static boolean breakBtn = false;

  public static void printCalculator(int md, double firstVal, double secondVal) {
    switch (md) {
      case 1:
        System.out.println(firstVal + " + " + secondVal + " = " + (firstVal + secondVal));
        break;
      case 2:
        System.out.println(firstVal + " - " + secondVal + " = " + (firstVal - secondVal));
        break;
      case 3:
        System.out.println(firstVal + " * " + secondVal + " = " + (firstVal * secondVal));
        break;
      case 4:
        System.out.println(firstVal + " / " + secondVal + " = " + ((double) firstVal / secondVal));
        break;
      case 0:
        breakBtn = true;
        break;
      default:
        System.out.println("올바른 입력이 아닙니다.");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mode = 1;
    double a = 0, b = 0;
    boolean isDigit = true;

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");

      try {
        mode = sc.nextInt();
        sc.nextLine();
      } catch (InputMismatchException e) {
        sc.nextLine();
        System.out.println("숫자를 입력하세요!");
        isDigit = false;
      }

      if (!isDigit) {
        isDigit = true;
        continue;
      }

      if (mode >= 1 && mode <= 4) {
        try {
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
          a = sc.nextDouble();
          sc.nextLine();
          System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
          b = sc.nextDouble();
          sc.nextLine();
        } catch (InputMismatchException e) {
          sc.nextLine();
          System.out.println("숫자를 입력하세요!");
          isDigit = false;
        }
      }

      if (!isDigit) {
        isDigit = true;
        continue;
      }

      printCalculator(mode, a, b);

      if (breakBtn) break;
    }
  }

}
