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
    public String setBookname(String bookname){
        return this.bookname=bookname;
    }

    public void setAgepublication(int agepublication) {
        this.agepublication = agepublication;
    }
}
