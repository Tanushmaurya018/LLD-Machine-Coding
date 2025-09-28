package items;

// through libraryitem we are promoting Open close

public class CD implements LibraryItem {
    int uniqueID;
    int value;
    String title;
    String artist;

    public CD(int uniqueID, int value, String title, String artist) {
        this.uniqueID = uniqueID;
        this.value = value;
        this.title = title;
        this.artist = artist;
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
        return days*20;
    }
}
