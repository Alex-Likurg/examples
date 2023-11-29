package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_3;

class Book {

    String bookName;
    String bookAuthor;
    int pageCount;

    public Book (String bookName, String bookAuthor, int pageCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageCount = pageCount;
    }

    public String getBookName() {return bookName;}
    public String getBookAuthor() {return bookAuthor;}
    public int getPageCount() {return pageCount;}



}
