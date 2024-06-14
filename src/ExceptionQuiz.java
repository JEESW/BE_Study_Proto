import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionQuiz {
  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //
    //    int a = sc.nextInt();
    //    sc.nextLine();
    //    int b = sc.nextInt();
    //    sc.nextLine();
    //
    //    try {
    //      System.out.println(divide(a, b));
    //    } catch (ArithmeticException e) {
    //      System.out.println("두 번째 인자로 0을 입력하지 마세요");
    //    } finally {
    //      sc.close();
    //    }

    //    Scanner sc = new Scanner(System.in);
    //
    //    int len = sc.nextInt();
    //    sc.nextLine();
    //
    //    int[] arr = new int[len];
    //
    //    String s = sc.nextLine();
    //    String[] tmp = s.split(" ");
    //    try {
    //      for (int i = 0; i < tmp.length; i++)  arr[i] = Integer.parseInt(tmp[i]);
    //      for (int num : arr) System.out.println(num);
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("배열의 범위를 초과했습니다.");
    //    } finally {
    //      sc.close();
    //    }

    //    Scanner sc = new Scanner(System.in);
    //    String name = sc.nextLine();
    //    int age = sc.nextInt();
    //    sc.nextLine();
    //
    //    try {
    //      Person person = new Person(name, age);
    //    } catch (InvalidAgeException e) {
    //      System.out.println(e.getMessage());
    //    } finally {
    //      sc.close();
    //    }

    //    Scanner sc = new Scanner(System.in);
    //
    //    String str = sc.nextLine();
    //
    //    try {
    //      System.out.println(Integer.parseInt(str));
    //    } catch (NumberFormatException e) {
    //      System.out.println("문자열이 정수로 변환 될 수 없습니다.");
    //    } finally {
    //      sc.close();
    //    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
