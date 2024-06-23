public class Book<T> {
  private String title;
  private String author;
  private T identifier;

  // 생성자
  public Book(String title, String author, T identifier) {
    this.title = title;
    this.author = author;
    this.identifier = identifier;
  }

  // title getter
  public String getTitle() {
    return title;
  }

  // author getter
  public String getAuthor() {
    return author;
  }

  // identifier getter
  public T getIdentifier() {
    return identifier;
  }
}
