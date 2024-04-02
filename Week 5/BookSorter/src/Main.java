import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Kitapları tutmak için bir TreeSet oluşturuldu.
        TreeSet<Book> bookSetByName = new TreeSet<>();

        //Kitap nesneleri oluşturuldu
        Book book1 = new Book("LOTR", "J.R.R. Tolkien",531,1954);
        Book book2 = new Book("Dune", "Frank Herbert",688,1965);
        Book book3 = new Book("Wheel of Time", "Robert Jordan",819,1990);
        Book book4 = new Book("Le Città Invisibili", "Italo Calvino",204,1972);
        Book book5 = new Book("Sputnik Sweetheart", "Haruki Murakami",244,1999);

        //Kitaplar TreeSete eklendi.
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        // Kitap adına göre alfabetik sıra
        System.out.println("Kitapların isme göre sıralanışı");
        for (Book book : bookSetByName) {
            System.out.println(" " + book);
        }

        System.out.println("###############################");

        TreeSet<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getPage(), b2.getPage());
            }
        });

        bookSetByPageCount.addAll(bookSetByName);

        // Sayfa sayısına göre sıralama
        System.out.println("Kitapların sayfa sayısına göre sıralanışı");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }

    }
}