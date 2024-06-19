import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrac {
  public static void main(String[] args) {
    //    Set<Integer> hashSet = new HashSet<>();
    //
    //    hashSet.add(1);
    //    hashSet.add(2);
    //    hashSet.add(3);
    //    hashSet.add(4);
    //    hashSet.add(5);
    //
    //    Iterator<Integer> iter = hashSet.iterator();
    //
    //    System.out.println("Iterator와 while문으로 출력!");
    //    while (iter.hasNext()) {
    //      System.out.println(iter.next());
    //    }
    //
    //    System.out.println();
    //
    //    System.out.println("향상된 for문으로 출력!");
    //    for (Integer num : hashSet) {
    //      System.out.println(num);
    //    }
    //
    //    System.out.println();
    //
    //    iter = hashSet.iterator();
    //    while (iter.hasNext()) {
    //      iter.next();
    //      iter.remove();
    //      //      hashSet.remove(iter.next());와 동일
    //      System.out.println("삭제");
    //    }
    //    System.out.println("Set 크기: " + hashSet.size());

    Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println(stringSet.size());

    stringSet.remove("Java");

    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println(stringSet.size());

    stringSet.clear();
    System.out.println(stringSet.size());

    if (stringSet.isEmpty()) {
      System.out.println("비어있습니다.");
    } else {
      System.out.println("비지 않았습니다.");
    }
  }
}