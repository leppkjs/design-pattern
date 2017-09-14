package iterator;

public class BookShelfIterator implements Iterator<T> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        T book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
