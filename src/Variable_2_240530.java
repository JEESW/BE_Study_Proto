public class Variable_2_240530 {
  public static void main(String[] args) {
    char c1 = 'A';  // 문자 직접 저장
    char c2 = 65; // 10진수
    char c3 = '\u0041'; // 16진수

    char c4 = '가';
    char c5 = 44032;
    char c6 = '\uac00';

    int uniCode = c1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);

    short sVal = 10;
    short result = (short)(sVal + 10);
    System.out.println(result);

    float myFloat = 9.75f;
    float anotherFloat = myFloat * 2;

    System.out.println("Original Float Value: " + myFloat);
    System.out.println("Calculated Float Value: " + anotherFloat);

    boolean isTrue = true;
    if (isTrue) {
      System.out.println("이건 트루입니다.");
    }
    else {
      System.out.println("이건 펄스입니다.");
    }
  }
}
