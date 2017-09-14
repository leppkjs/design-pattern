package iterator;

public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last;

    public BookShelf(int size) {
        this.books = new Book[size];
        last = 0;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    public Iterator<T> iterator() {
        return new BookShelfIterator(this);
    }

}
