import java.util.List;
import java.util.ArrayList;

public class GenericPrac {
  public static void main(String[] args) {
    //    List list = new ArrayList<>();
    //    String o = (String) list.get(0);
    //
    //    List<Animal> animalList = new ArrayList<>();
    //    animalList.add(new Lion());

    //    Box<String> stringBox = new Box<>();
    //    Box<Integer> integerBox = new Box<>();
    //
    //    integerBox.set(6);
    //    int i = integerBox.get();

    //    Car2<String> stringCar2 = new Car2<>();
    //
    //    stringCar2.set("Hyundai");
    //    System.out.println(stringCar2.get());
    //    System.out.println(stringCar2.isIns());

    Box<Integer> boxing = Util.boxing(100);
  }
}
