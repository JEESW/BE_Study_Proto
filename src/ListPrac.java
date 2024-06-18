import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListPrac {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<String>();
    List<String> linkedList = new LinkedList<String>();

    long startTime, endTime;
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린 시간: " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린 시간: " + (endTime - startTime));
  }
}
