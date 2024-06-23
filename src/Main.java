import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BookManager<String> bookShelf = new BookShelf<>();  // BookShelf 생성
    BookStack<Integer> bookStack = new BookStack<>(); // BookStack 생성

    // 입력을 위한 Scanner 객체 생성
    Scanner scanner = new Scanner(System.in);

    // 도서 개수 입력
    System.out.println("추가 할 도서 개수를 입력하세요");
    int cnt = scanner.nextInt();
    scanner.nextLine();

    // 도서 정보 입력부
    for (int i = 0; i < cnt; i++) {
      // 타입이 잘못 입력되는 경우를 대비한 예외 처리
      try {
        System.out.println("도서 제목을 입력하세요!");
        String title = scanner.nextLine();

        System.out.println("도서 저자를 입력하세요!");
        String author = scanner.nextLine();

        System.out.println("문자열로 된 도서 식별자를 입력하세요! (BookShelf용)");
        String shelfIdentifier = scanner.nextLine();

        System.out.println("정수로 된 도서 식별자를 입력하세요! (BookStack용)");
        Integer stackIdentifier = scanner.nextInt();
        scanner.nextLine();

        // 생성자를 이용하여 입력한 Book을 각각 bookShelf와 bookStack에 추가
        bookShelf.addBook(new Book<>(title, author, shelfIdentifier));
        bookStack.pushBook(new Book<>(title, author, stackIdentifier));
      } catch (InputMismatchException e) {
        System.out.println("올바른 타입을 입력을 하셔야죠!");
        i--;  // 다시 입력하게 유도
        scanner.nextLine();
      }
    }

    // 도서 검색
    System.out.println("제목으로 검색할 도서를 입력하세요!");
    String searchedTitle = scanner.nextLine();
    System.out.println("저자로 검색할 도서를 입력하세요!");
    String searchedAuthor = scanner.nextLine();

    // 검색한 도서 목록 저장
    List<Book<String>> searchedBooksByTitle = bookShelf.searchByTitle(searchedTitle);
    List<Book<String>> searchedBooksByAuthor = bookShelf.searchByAuthor(searchedAuthor);

    // 정보 출력
    // 제목으로 검색한 도서 정보 출력
    System.out.println("제목으로 검색한 도서 목록");
    System.out.println();
    for (Book<String> book : searchedBooksByTitle) {
      System.out.println("도서 제목: " + book.getTitle());
      System.out.println("도서 저자: " + book.getAuthor());
      System.out.println("도서 식별자: " + book.getIdentifier());
      System.out.println();
    }

    // 저자로 검색한 도서 정보 출력
    System.out.println("저자로 검색한 도서 목록");
    System.out.println();
    for (Book<String> book : searchedBooksByAuthor) {
      System.out.println("도서 제목: " + book.getTitle());
      System.out.println("도서 저자: " + book.getAuthor());
      System.out.println("도서 식별자: " + book.getIdentifier());
      System.out.println();
    }

    // bookStack이 비어있을 때, pop, peek 하는 부분 예외 처리
    try {
      // bookStack에서 도서 꺼내기
      System.out.println("도서 꺼내기!");
      System.out.println();
      Book<Integer> poppedBook = bookStack.popBook(); // 도서 꺼내고 꺼낸 도서 poppedBook에 저장
      // 꺼낸 도서 정보 출력
      System.out.println("꺼낸 도서의 제목: " + poppedBook.getTitle());
      System.out.println("꺼낸 도서의 저자: " + poppedBook.getAuthor());
      System.out.println("꺼낸 도서의 식별자: " + poppedBook.getIdentifier());
      System.out.println();

      // bookStack에서 맨 위의 도서 정보 출력하기
      System.out.println("현재 맨 위의 도서!");
      System.out.println();
      Book<Integer> peekedBook = bookStack.peekBook();  // 도서를 꺼내지 않고 peekedBook에 저장
      // peek(맨 위)의 도서 정보 출력
      System.out.println("맨 위 도서의 제목: " + peekedBook.getTitle());
      System.out.println("맨 위 도서의 저자: " + peekedBook.getAuthor());
      System.out.println("맨 위 도서의 식별자: " + peekedBook.getIdentifier());
      System.out.println();
    } catch (EmptyStackException e) {
      System.out.println("스택이 비어있어서 꺼낼 도서가 없어요!");
    } finally{
      // 예외 상황과 상관 없이 실행되는 부분
      // bookStack이 비어 있는지 확인
      System.out.println("도서가 비어있나?");
      System.out.println(bookStack.isEmpty() ? "비어있음!" : "비어있지 않음!");

      // scanner 닫기
      scanner.close();
    }
  }
}
