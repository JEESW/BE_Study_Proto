import java.sql.SQLOutput;
import java.util.ArrayList;

public class codeTest1 {
  public static void main(String[] args) {
    System.out.println(getMiddleThree("Hello World"));

    System.out.println(barkingDogProblem(true, 3));

    String[] s =
        printCategory("these are category. category: books, category: electronics, and so on.");
    for (String str : s) System.out.println(str);

    String[] s2 = printString("물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.");
    String[] s3 = printReverseString("물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.");
    for (String str : s2) System.out.println(str);
    for (String str : s3) System.out.println(str);

    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(search(arr, 5));
  }

  //    주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
  //    예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
  //    만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.
  //
  //    예제
  //    입력: "Monitor"
  //    출력: "nit"
  //
  //    요구사항
  //    문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
  //    문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.

  public static String getMiddleThree(String str) {
    return (str.length() < 3)
        ? str
        : str.substring((str.length() - 3) / 2, (str.length() - 3) / 2 + 3);
  }

  //  여러분은 아주 크게 짖는 개를 키우고 있습니다.
  //  hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
  //  만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
  //  만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.
  //
  //  barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
  //  barkingDogProblem(true, 7) ==> "든든하군!"
  //  barkingDogProblem(false, 5) ==> "든든하군!"

  public static String barkingDogProblem(boolean isBark, int hour) {
    return (isBark && (hour < 7 || hour > 20)) ? "짖으면 안돼!!" : "든든하군!";
  }

  //  주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
  //   "When organizing items, always label each group with the appropriate
  //   category. category: books, category: electronics, category: clothing, category: kitchenware,
  //   and so on. "

  public static String[] printCategory(String s) {
    String[] answer;
    ArrayList<String> v = new ArrayList<>();

    int index = 0;
    while ((index = s.indexOf("category: ", index)) != -1) {
      v.add(s.substring(index, s.indexOf(",", index)));
      index++;
    }

    answer = v.stream().toArray(String[]::new);

    return answer;
  }

  // 다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.
  // 그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.

  public static String[] printString(String s) {
    String[] answer = new String[s.length()];
    for (int i = 0; i < s.length(); i++) {
      answer[i] = String.valueOf(s.charAt(i));
    }

    return answer;
  }

  public static String[] printReverseString(String s) {
    String[] answer = new String[s.length()];
    for (int i = s.length() - 1; i >= 0; i--) {
      answer[s.length() - i - 1] = String.valueOf(s.charAt(i));
    }

    return answer;
  }

  //  배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
  //  search(new int[] {1,2,3,4,5}, 5); ==> 4
  //  search(new int[] {1,2,3,4,5}, 6); ==> -1

  public static int search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) return i;
    }
    return -1;
  }
}
