package Lesson_08.HomeWork.Task1;

public class Book {
    private String bookTitle;
    private String author;

    public Book(String bookTitle, String author) {
        setBookTitle(bookTitle);
        setAuthor(author);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  "'" + bookTitle + '\'' +
                " " + author +
                '.';
    }
}
