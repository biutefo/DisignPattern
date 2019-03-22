package pers.xin.iterator.test;

import pers.xin.iterator.BookShelf;
import pers.xin.iterator.MyIterator;
import pers.xin.iterator.pojo.Book;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("《环游世界80天》"));
        bookShelf.addBook(new Book("《圣经》"));
        bookShelf.addBook(new Book("《灰姑娘》"));
        bookShelf.addBook(new Book("《长腿爸爸》"));
        MyIterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
