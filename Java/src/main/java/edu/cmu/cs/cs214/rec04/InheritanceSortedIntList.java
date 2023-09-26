package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a   that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    private int size;

    public InheritanceSortedIntList () { 
        super(); 
        size = 0;
    }

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean addWorks = super.add(num);
        if (addWorks) {
            size++;
        }
        return addWorks;
    }

     /**
     * Adds all of the elements of the IntegerList to the list.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll (IntegerList list) {
        return super.addAll(list);
    }

     /**
     * Returns number of elements added to the list.
     *
     * @return number of elements added to list
     */
    public int getTotalAdded() {
        return size;
    }
}