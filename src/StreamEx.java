import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 1, 10, 9, 5);

    //    numbers.stream().filter(i -> i % 2 == 0);
    //    numbers.stream().map(i -> i * 2);
    //    numbers.stream().sorted();

    numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
    List<Integer> list = numbers.stream().map(i -> i *= 2).collect(Collectors.toList());
    System.out.println(list);
    numbers.stream().sorted().forEach(i -> System.out.println(i));
  }
}
