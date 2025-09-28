package items;

// through libraryitem we are promoting Open close

public class Book implements LibraryItem {
    int uniqueID;
    int value;
    String title;
    String author;

    public Book(int uniqueID, int value, String title, String author) {
        this.uniqueID = uniqueID;
        this.value = value;
        this.title = title;
        this.author = author;
    }



    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public int getUniqueID() {
        return this.uniqueID;
    }

    @Override
    public int getCalculateLateFees(int days) {
        return days*10;
    }
}
