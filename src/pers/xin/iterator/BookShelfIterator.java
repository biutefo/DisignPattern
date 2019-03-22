package pers.xin.iterator;

import pers.xin.iterator.pojo.Book;

import java.util.Iterator;

public class BookShelfIterator implements MyIterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getBookNumbers()) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index++);
        return book;
    }
}
