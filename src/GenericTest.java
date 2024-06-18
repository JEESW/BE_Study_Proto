import java.util.Arrays;

public class GenericTest {
  public static void main(String[] args) {
    //    System.out.println(compare(1, 2));
    //    System.out.println(compare("a", "b"));
    //    System.out.println(compare("a", "a"));

    //    Course<Person> personCourse = new Course<>("일반인", 5);
    //    personCourse.add(new Person("일반인"));
    //    personCourse.add(new Worker("직장인"));
    //    personCourse.add(new Student("학생"));
    //    personCourse.add(new HighStudent("고등학생"));
    //
    //    Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
    //    workerCourse.add(new Worker("직장인"));
    //
    //    Course<Student> studentCourse = new Course<>("학생 과정", 5);
    //    studentCourse.add(new Student("학생"));
    //    studentCourse.add(new HighStudent("고등학생"));
    //
    //    Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
    //    highStudentCourse.add(new HighStudent("고등학생"));
    //
    //    registerCourse(personCourse);
    //    registerCourse(workerCourse);
    //    registerCourse(studentCourse);
    //    registerCourse(highStudentCourse);
    //
    //    System.out.println("========================");
    //
    //    registerCourseStudent(studentCourse);
    //    registerCourseStudent(highStudentCourse);
    //
    //    System.out.println("========================");
    //
    //    registerCourseWorker(personCourse);
    //    registerCourseWorker(workerCourse);

    ChildProduct<Tv, String, String> product = new ChildProduct<>();
    product.setKind(new Tv());
    product.setModel("smart TV");
    product.setCompany("Samsung");

    StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
    tvStorage.add(new Tv(), 0);
  }

  public static <T extends Number> int compare(T t1, T t2) {
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
  }

  public static <T extends String> String compare(T t1, T t2) {
    return t1.equals(t2) ? "okay" : "no";
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }
}
