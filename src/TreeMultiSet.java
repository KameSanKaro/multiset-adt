public class TreeMultiSet extends MultiSet {

    private Tree tree;

    @Override
    void add(Integer item) {
        // TODO complete this method
        this.tree.add(item);

    }
    @Override
    void remove(Integer item) {
        // TODO complete this method
        this.tree.delete_item(item);

    }
    @Override
    void contains(Integer item) {
        // TODO complete this method
        this.tree.includes(item);

    }
    @Override
    void is_empty(Integer item) {
        return this.tree.is_empty();

    }
    @Override
    void count(Integer item) {
        this.tree.count(item);

    }
    @Override
    void size(Integer item) {
        return len(this.tree);

    }
}
