import items.Book;
import items.CD;
import items.DVD;
import items.LibraryItem;
import main.Library;
import main.CalculateLateFees;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, 100, "Book1", "Author A");
        Book book2 = new Book(2, 200, "Book2", "Author B");

        CD cd1 = new CD(3, 300, "CD1", "Artist X");
        DVD dvd1 = new DVD(4, 500, "DVD1", "Director Y");

        Library library1 = new Library(new LibraryItem[]{book1, book2, cd1, dvd1});

        System.out.println("===== Library Summary =====");
        System.out.println("Total Value of Library: " + library1.calculateTotalValues());

        System.out.println("\n===== Book Details =====");
        System.out.println("Book1 Title: " + book1.getTitle());
        System.out.println("Book1 Value: " + book1.getValue());
        System.out.println("Book1 UniqueID: " + book1.getUniqueID());
        System.out.println("Book1 Late Fee (5 days): " + book1.getCalculateLateFees(5));

        System.out.println("\n===== CD Details =====");
        System.out.println("CD1 Title: " + cd1.getTitle());
        System.out.println("CD1 Value: " + cd1.getValue());
        System.out.println("CD1 UniqueID: " + cd1.getUniqueID());
        System.out.println("CD1 Late Fee (10 days): " + cd1.getCalculateLateFees(10));

        System.out.println("\n===== DVD Details =====");
        System.out.println("DVD1 Title: " + dvd1.getTitle());
        System.out.println("DVD1 Value: " + dvd1.getValue());
        System.out.println("DVD1 UniqueID: " + dvd1.getUniqueID());
        System.out.println("DVD1 Late Fee (7 days): " + dvd1.getCalculateLateFees(7));

        System.out.println("\n===== Late Fees Across All Items =====");
        CalculateLateFees calc = new CalculateLateFees();
        int totalLateFees = calc.calculateLateFees(10, new LibraryItem[]{book1, book2, cd1, dvd1});
        System.out.println("Total Late Fees for 10 days (all items): " + totalLateFees);
    }
}
