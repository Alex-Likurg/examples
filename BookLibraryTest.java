package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_3;


import java.util.List;

public class BookLibraryTest {

    public static void main(String[] args) {

        BookLibraryTest test = new BookLibraryTest();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();

    }
        public void test1() {
            BookLibrary libraryZero = new BookLibrary();
            int bookCount = libraryZero.getBookCount();
            checkResultNumber(bookCount, 0, "Library is empty");
        }
        public void test2() {
            BookLibrary libraryWithBook = new BookLibrary();
            Book book = new Book("Gosudar", "Nicollo Makiavelli", 556);
            libraryWithBook.Add(book);
            int bookCount = libraryWithBook.getBookCount();
            checkResultNumber(bookCount,1, "Library have books");
        }
        public void test3() {
            BookLibrary booksByTitleZero = new BookLibrary();
            List<Book>foundBooks  = booksByTitleZero.findBookByName("Gosudar");
            checkResultNumber(foundBooks.size(), 0, "No book with such Name");

        }
        public void test4() {
            BookLibrary booksByTitleExists = new BookLibrary();
            Book book = new Book("Gosudar", "Nicollo Makiavelli", 556);
            booksByTitleExists.Add(book);
            List<Book>foundBooks = booksByTitleExists.findBookByName("Gosudar");
            checkResultNumber(foundBooks.size(), 1, "There are some books with this Title");
        }
        public void test5() {
            BookLibrary booksByAuthorZero = new BookLibrary();
            List<Book>foundBooks = booksByAuthorZero.findBookByAuthor("Niccolo");
            checkResultNumber(foundBooks.size(), 0, "No such Author in library");

        }
        public void test6() {
            BookLibrary booksByAuthorExists = new BookLibrary();
            Book book = new Book("Gosudar", "Nicollo Makiavelli", 556 );
            booksByAuthorExists.Add(book);
            List<Book>foundBooks = booksByAuthorExists.findBookByAuthor("Nicollo Makiavelli");
            checkResultNumber(foundBooks.size(), 1, "There is such Author in Library");

        }
        public void test7() {
            BookLibrary pageCountByAuthorZeroFound = new BookLibrary();
            int pageCount = pageCountByAuthorZeroFound.calculatePageCountByAuthor("Nicollo Makiavelli");
            checkResultNumber(pageCount, 0, "No such Author was find. Zero Pages");

        }
        public void test8() {
            BookLibrary pageCountTwoBooksByAuthor = new BookLibrary();
            Book book = new Book("Gosudar", "Nicollo Makiavelli", 556 );
            pageCountTwoBooksByAuthor.Add(book);
            Book book1 = new Book("War Tactics", "Nicollo Makiavelli", 243 );
            pageCountTwoBooksByAuthor.Add(book1);
            int pageCount = pageCountTwoBooksByAuthor.calculatePageCountByAuthor("Nicollo Makiavelli");
            checkResultNumber(pageCount, 799, "There are books. We can count pages");
        }


        private void checkResultNumber(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
