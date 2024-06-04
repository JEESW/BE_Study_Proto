import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class for_2_240604 {
  public static void main(String[] args) {
    //    for (int i = 1; i <= 5; i++) {
    //      System.out.println("현재 i의 값은=" + i);
    //    }

    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      sum = (i % 2 == 0) ? sum + i : sum;
    //    }
    //    System.out.println(sum);
    //
    //    int sum1 = IntStream.rangeClosed(1, 100).filter(e->e%2==0).sum();
    //    System.out.println(sum1);

    //    int n = 20;
    //    int sum = 0;
    //    for (int i = 1; i <= n; i++) {
    //      if (i % 15 == 0) sum += i;
    //    }
    //    System.out.println(sum);
    //
    //    int sum1 = IntStream.rangeClosed(1, n).filter(i -> (i % 3 == 0) && ((i % 5) == 0)).sum();
    //    System.out.println(sum1);

    //    int[] fibo = new int[10];
    //    fibo[0] = 1;
    //    fibo[1] = 1;
    //    for (int i = 2; i < 10; i++) fibo[i] = fibo[i - 1] + fibo[i - 2];
    //    System.out.println(Arrays.toString(fibo));

    //    for (int i = 100; i >= 1; i--) System.out.println(i);

    //    for (int i = 0; i >= -100; i--) {
    //      if (i % 2 == 0) System.out.println(i);
    //    }
    //    IntStream.rangeClosed(-100, 0).filter(i -> i % 2 == 0).forEach(i -> System.out.println(i +
    // " "));

    //    int[] fibo = new int[100];
    //    //    fibo[0] = 1;
    //    //    fibo[1] = 1;
    //    //    for (int i = 2; i < 100; i++) {
    //    //      fibo[i] = fibo[i - 2] + fibo[i - 1];
    //    //      System.out.println(fibo[i]);
    //    //    }
    //    fibo[0] = 1;
    //    fibo[1] = 1;
    //    Arrays.setAll(fibo, i -> (i < 2) ? 1 : fibo[i - 1] + fibo[i - 2]);
    //    System.out.println(fibo[8]);

    //    for (int i = 1; i < 10; i++) {
    //      System.out.println("2 * " + i + " = " + i * 2);
    //    }
    //
    //    for (int i = 1; i < 10; i++) {
    //      for (int j = 1; j < 10; j++) {
    //        System.out.println(i + " * " + j + " = " + i * j);
    //      }
    //    }

    //    for (int i = 19; i > 0; i--) {
    //      for (int j = 19; j > 0; j--) {
    //        System.out.println(i + " * " + j + " = " + i * j);
    //      }
    //    }

    //    int num = 0;
    //    while(num < 10) {
    //      System.out.println("현재 숫자: " + num);
    //      if (num == 5) {
    //        System.out.println("5가 되었습니다.");
    //        break;
    //      }
    //      num++;
    //    }

    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("현재 i의 값은: " + i);
    //      for (int j = 0; j < 10; j++) {
    //        System.out.println("현재 j의 값은 = " + j);
    //        if (j == 5) {
    //          break;
    //        }
    //      }
    //    }

    //    for (int i = 1; i <= 100; i++) {
    //      if (i == 50) {
    //        System.out.println("i는 " + i + "입니다.");
    //        break;
    //      }
    //      for (int j = 2; j <= 100; j++) {
    //        if (j == 80) {
    //          System.out.println("j는 " + j + "입니다.");
    //          break;
    //        }
    //      }

    //    for (int i = 1; i <= 10; i++) {
    //      if (i == 4 || i == 7) continue;
    //      System.out.println(i);
    //    }

    //    int[] arr = {1, 2, 3, 4, 5};
    //
    //    for (int i = 0; i < arr.length; i++) {
    //      System.out.println(arr[i]);
    //    }
    //
    //    for (int i : arr) {
    //      System.out.println(i);
    //    }

    //    int[] scores = {1, 2, 3, 4, 5, 6};
    //    int sum = 0;
    //    double avg;
    //    for (int s : scores) {
    //      sum += s;
    //    }
    //    avg = (double) sum / scores.length;
    //    System.out.println("점수: " + sum);
    //    System.out.println("평균: " + avg);

    //    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    //    for (String str : arr) {
    //      if (str.length() >= 5) System.out.println(str);
    //    }
  }
}
