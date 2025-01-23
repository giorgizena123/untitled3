import java.util.Objects;

class Book {
    private String title;
    private int pages;
    private String genre;
    private Writer author;

    public Book(String title, int pages, String genre, Writer author) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, pages, genre, author);
    }


    @Override
    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + ", genre='" + genre + "', author=" + author + "}";
    }
}
