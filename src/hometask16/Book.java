package hometask16;
//Класс Book должен содержать минимальный набор полей:
//        название книги;
//        кол-во страниц;
//        информацию об авторе книги.

public class Book {
private String bookName;
private int letters;
public Author author;

public Book(){

}
public Book(String bookName, int letters, String authorName, String surname, int date){
    this.author = new Author(authorName,surname,date);
    this.bookName = bookName;
    this.letters = letters;
}

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getLetters() {
        return letters;
    }
    public void setLetters(int letters) {
        this.letters = letters;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}
