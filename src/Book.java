import java.util.Objects;

public class Book {
    private String bookname;
    private int agepublication;
    private Author author;


    public Book(String bookname, Author author, int agepublication) {
        this.bookname = bookname;
        this.agepublication = agepublication;
        this.author = author;
    }

    public String getBookname() {
        return this.bookname;
    }

    public int getAgepublication() {
        return this.agepublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String setBookname(String bookname) {
        return this.bookname = bookname;
    }

    public void setAgepublication(int agepublication) {
        this.agepublication = agepublication;
    }
    public String toString(){
        return "Книгу с названием "+bookname+" написал автор "+author+". Книга была выпущена "+agepublication+" Году";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return agepublication == book.agepublication && bookname.equals(book.bookname) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookname, agepublication, author);
    }
}

