package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class BookLibrary {


    private List<Book> books = new ArrayList();

    public void Add (Book newBook) {
        books.add(newBook);
    }

    public int getBookCount (){
        return books.size();
    }

    public List<Book> findBookByName (String newSearchByName) {
        List<Book>foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book newBook = books.get(i);
            String bookName = newBook.getBookName();
            if (bookName.equals(newSearchByName)) {foundBooks.add(newBook);}
        }
        return foundBooks;
    }

    public List<Book> findBookByAuthor (String newSearchByAuthor) {
        List<Book>foundBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book newBook = books.get(i);
            String bookAuthor = newBook.getBookAuthor();
            if (bookAuthor.equals(newSearchByAuthor)) {foundBooks.add(newBook);}
        }
        return foundBooks;
    }

    public int calculatePageCountByAuthor (String newPageCount) {
        int pageCountByAuthor = 0;
        for (int i = 0; i < books.size(); i++) {
            Book newBook = books.get(i);
            String bookAuthor = newBook.getBookAuthor();
            if (bookAuthor.equals(newPageCount)) {pageCountByAuthor += newBook.getPageCount();}
        }
        return pageCountByAuthor;
    }
}




