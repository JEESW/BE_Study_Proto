import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
  private List<Book<T>> books;

  // BookShelf 생성자
  public BookShelf() {
    this.books = new ArrayList<>();
  }

  // 도서 추가
  public void addBook(Book<T> books) {
    this.books.add(books);
  }

  // 도서 제거
  public void removeBook(Book<T> books) {
    if (this.books.contains(books)) {
      this.books.remove(books);
    }
  }

  // 도서 제목으로 검색
  public List<Book<T>> searchByTitle(String title) {
    List<Book<T>> searchResult = new ArrayList<>();
    String lowerCaseTitle = title.toLowerCase();  // 검색할 제목을 소문자로 변경
    for (Book<T> book : this.books) {
      // 만약 도서 제목과 검색한 제목이 소문자로 바꿨을 때 같다면, 반환할 도서 리스트에 저장
      if (book.getTitle().toLowerCase().contains(lowerCaseTitle)) {
        searchResult.add(book);
      }
    }
    return searchResult;  // 검색된 도서 리스트 반환
  }

  // 도서 저자로 검색
  public List<Book<T>> searchByAuthor(String author) {
    List<Book<T>> searchResult = new ArrayList<>();
    String lowerCaseAuthor = author.toLowerCase();  // 검색할 저자를 소문자로 변경
    for (Book<T> book : this.books) {
      // 만약 도서 저자와 검색한 저자가 소문자로 바꿨을 때 같다면, 반환할 도서 리스트에 저장
      if (book.getAuthor().toLowerCase().contains(lowerCaseAuthor)) {
        searchResult.add(book);
      }
    }
    return searchResult;  // 검색된 도서 리스트 반환
  }
}
