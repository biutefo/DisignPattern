package pers.xin.iterator.impl;

import pers.xin.iterator.inter.MyIterator;
import pers.xin.iterator.pojo.Book;

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
