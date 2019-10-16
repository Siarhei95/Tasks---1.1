package task1_1;

import java.util.ArrayList;
import java.util.List;

public class TestCatalog {
    private ArrayList<Book> booksArrayList = new ArrayList<>();

    public ArrayList<Book> getBooksArrayList() {
        return booksArrayList;
    }

    void addBooks(Book book) {
        booksArrayList.add(book);
    }

    public List<Book> getBookList() {
        List<Book> booksList = new ArrayList<>(booksArrayList);
        return booksList;
    }

    public List<Book> getNecessaryBook(String finder) {
        List<Book> list = new ArrayList<>(booksArrayList);
        for (Book c : booksArrayList) {
            if (c.getBook().equals(finder)) {
                list.add(c);
                System.out.println("Book: " + c.getBook() + "\t author: " + c.getAuthor() + "\t yearOfPublication: "
                        + c.getYearOfPublication() + "\tdescription: " + c.getDescription()+"\n");
            }
        }
        return list;
    }


    private ArrayList<UsersBase> usersBaseArrayList = new ArrayList<>();

    public ArrayList<UsersBase> getUsersBaseArrayList() {
        return usersBaseArrayList;
    }

    void addUsers(UsersBase usersBase) {
        usersBaseArrayList.add(usersBase);
    }

    public List<UsersBase> getUsersBaseList() {
        List<UsersBase> usersBaseList = new ArrayList<>(usersBaseArrayList);
        return usersBaseList;
    }
}
