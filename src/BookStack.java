import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  // BookStack 생성자
  public BookStack() {
    this.books = new Stack<>();
  }

  // BookStack에 도서 push하기
  public void pushBook(Book<T> book) {
    books.push(book);
  }

  // BookStack에서 도서 pop하기, 단 스택이 비어있을 때 예외 던지기
  public Book<T> popBook() throws EmptyStackException {
    return books.pop();
  }

  // BookStack에서 도서의 peek를 반환하기, 단 스택이 비어있을 때 예외 던지기
  public Book<T> peekBook() throws EmptyStackException {
    return books.peek();
  }

  // BookStack이 비어있는지 확인하기
  public boolean isEmpty() {
    return books.isEmpty();
  }
}
