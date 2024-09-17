/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset. yay
     *
     * @param item the item to add
     */
    abstract void add(Integer item);
    abstract void remove(Integer index);
    abstract Boolean contains(Integer item);
    abstract Boolean is_empty();
    abstract Integer count(Integer item);
    abstract void size();

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
}
