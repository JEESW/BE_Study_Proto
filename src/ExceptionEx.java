import java.util.Scanner;

public class ExceptionEx {
  public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
    //
    //    try {
    //      int i = scanner.nextInt();
    //      System.out.println(i);
    //    } catch (InputMismatchException e) {
    //      System.out.println("문자열을 입력하시면 안됩니다.");
    //      int i = scanner.nextInt();
    //      System.out.println(i);
    //    }
    //
    //    scanner.close();

    //    try {
    //      //      int result = 10 / 0;
    //      //      System.out.println(result);
    //      System.out.println(divide(10, 0));
    //    } catch (ArithmeticException e) {
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    } finally {
    //      System.out.println("finally는 항상 실행됩니다.");
    //    }
    //    System.out.println("정상적으로 종료되었습니다.");

    //    Scanner sc = new Scanner(System.in);
    //    try {
    //      int i = sc.nextInt();
    //      int result = i / 0;
    //      System.out.println(result);
    //    } catch (NullPointerException e) {
    //      System.out.println("0으로 나눌 수 있습니다.");
    //    } finally {
    //      sc.close();
    //    }

    //    try {
    //      int[] numbers = {1, 2, 3};
    //      System.out.println(numbers[5]);
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("배열의 인덱스를 벗어났습니다.");
    //    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
