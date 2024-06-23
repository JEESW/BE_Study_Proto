import java.util.List;

public interface BookManager<T> {
  // 도서 추가
  void addBook(Book<T> book);

  // 도서 제거
  void removeBook(Book<T> book);

  // 도서 제목으로 검색
  List<Book<T>> searchByTitle(String title);

  // 도서 저자로 검색
  List<Book<T>> searchByAuthor(String author);
}
