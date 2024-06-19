import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapEx {
  public static void main(String[] args) {
    Map<Student, Integer> score = new HashMap<Student, Integer>();
    Student student1 = new Student(1, "aa");
    Student student2 = new Student(2, "bb");
    Student student3 = new Student(1, "aa");
    
    score.put(student1, 70);
    score.put(student2, 80);
    score.put(student3, 90);

    Set<Entry<Student, Integer>> entries = score.entrySet();
    for (Entry<Student, Integer> entry : entries) {
      Student key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("이름: " + key.getName() + ", 키: " + value);
    }
  }
}
