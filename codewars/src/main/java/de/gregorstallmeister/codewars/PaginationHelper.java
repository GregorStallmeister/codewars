package de.gregorstallmeister.codewars;

import java.util.List;

public class PaginationHelper<I> {
    private List<I> items;
    private int maxItemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        items = collection;
        maxItemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return items.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) items.size() / maxItemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex == 0 && items.size() > 0) {
            return Math.min(items.size(), maxItemsPerPage);
        }

        int itemsOnPage = items.size() - (maxItemsPerPage * (pageIndex));

        return itemsOnPage > 0 ? itemsOnPage : -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > items.size() - 1) {
            return -1;
        }

        return itemIndex / maxItemsPerPage;
    }
}
