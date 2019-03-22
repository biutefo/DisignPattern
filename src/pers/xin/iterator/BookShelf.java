package pers.xin.iterator;

import pers.xin.iterator.pojo.Book;

public class BookShelf implements MyIterable<Book> {
    //要迭代的类型
    private Book[] books;
    private int bookNumbers = 0;

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        this.books[bookNumbers] = book;
        bookNumbers++;
    }

    public int getBookNumbers() {
        return bookNumbers;
    }

    @Override
    public MyIterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
