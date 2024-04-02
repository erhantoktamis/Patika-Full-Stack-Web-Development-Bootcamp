public class Book implements Comparable<Book>{
    private String bookName;
    private String author;
    private int page;
    private int relaseDate;

    public Book(String bookName, String author, int page, int relaseDate) {
        this.bookName = bookName;
        this.author = author;
        this.page = page;
        this.relaseDate = relaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(int relaseDate) {
        this.relaseDate = relaseDate;
    }

    @Override
    public String toString() {
        return " " +
                "Book Name: " + bookName +
                "\t Author Name: " + author +
                "\t Page Number: " + page +
                "\t Publish Date: " + relaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
