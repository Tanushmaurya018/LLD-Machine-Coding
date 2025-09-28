package items;

// here we are following SRP Library item is only having
// methods related to lib items
// we separated late fees to another interface thus ISP

import main.LateFeeCalculator;

// here
public interface LibraryItem extends LateFeeCalculator {
    String getTitle();
    int getValue();
    int getUniqueID();
}
