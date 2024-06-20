import java.util.Arrays;
import java.util.List;

public class StreamPrac {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //    List<Integer> num = numbers.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
    //    System.out.println(num);

    //    numbers.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.println(i));

    List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
    words.stream().filter(s -> s.length() <= 5).forEach(s -> System.out.println(s));
  }
}
