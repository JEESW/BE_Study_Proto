import java.util.*;
import java.util.Map.Entry;

public class MapPrac {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    List<String> stringList = new ArrayList<>();
    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");
    stringList.add("홍길동");

    map.put("홍길동", stringList);
    map.put("고길동", stringList);

    //    Set<String> keySet = map.keySet();
    //    System.out.println(map.size());
    //    System.out.println(keySet.size());

    //    System.out.println(map.remove("홍길동"));
    //    System.out.println(stringList);
    //    System.out.println(map.get("홍길동"));

    //    Iterator<String> iterator = keySet.iterator();
    //    while (iterator.hasNext()) {
    //      String next = iterator.next();
    //      List<String> list = map.get(next);
    //      System.out.println(list);
    //    }

    Set<Entry<String, List<String>>> entries = map.entrySet();
    for (Entry<String,List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println(key);
      System.out.println(value);
    }
  }
}
