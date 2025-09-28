package main;

import items.LibraryItem;

public class Library {
    LibraryItem[] items;

    public Library(LibraryItem[] items) {
        this.items = items;
    }
    // here parent can be replaced by any of its child and no risk is there
    // thus LSP
    public int calculateTotalValues(){
        int total = 0;
        for(LibraryItem item: items){
            total += item.getValue();
        }

        return total;
    }
}
