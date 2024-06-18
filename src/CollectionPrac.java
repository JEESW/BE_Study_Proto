import java.util.ArrayList;
import java.util.List;

public class CollectionPrac {
  public static void main(String[] args) {
    //    List<String> arrayList = new ArrayList<>();
    //
    //    arrayList.add("홍길동");
    //    arrayList.add(1, "홍길동2");
    //    arrayList.add(1, "홍길동3");
    //    arrayList.add(1, "홍길동4");
    //    arrayList.add(1, "홍길동5");
    //    arrayList.add(1, "홍길동6");
    //
    //    arrayList.removeIf((s) -> s.equals("홍길동"));
    //
    //    for (int i = 0; i < arrayList.size(); i++) {
    //      System.out.println(arrayList.get(i));
    //    }
    //    System.out.println("-----------------------------");
    //    for (String str : arrayList) {
    //      System.out.println(str);
    //    }

    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println("총 객체수: " + arrayList.size());

    System.out.println("=========================");

    System.out.println("두 번째 인덱스: " + arrayList.get(2));

    for (String str : arrayList) {
      System.out.println(str);
    }

    System.out.println(arrayList.contains("java"));

    ArrayList<Object> objects = new ArrayList<>();
    objects.add(null);
    System.out.println(objects.isEmpty());
    objects.clear();
    System.out.println(objects.isEmpty());
  }
}