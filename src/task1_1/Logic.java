package task1_1;


import java.util.ArrayList;
import java.util.List;

public class Logic {

    public void getName(String user, String passwordAdmin){
        if(user.equals("Сергей")){
            if(passwordAdmin.equals("1111")) {
                System.out.println("Hello, admin");
            }
        }
        else{
            if(passwordAdmin.equals("1")) {
                System.out.println("Hello, user");
            }
            else {
                System.out.println("Invalid Password!");
                System.out.println("\nWe show only the trial version: ");

            }
        }
    }

    public void getModification(String user, Book book){
        if(user.equals("Сергей")){
            System.out.println("\nYou own administrator rights! What will you do?");
            String changeNameLibrary = book.getNameLibrary(); //дадим новое название библиотеке!
            changeNameLibrary = "My big library";
            System.out.println("\nWe change the names of the libraries: it was a "+book.getNameLibrary()+"," +
                    " it became "+changeNameLibrary);
        }
        else{
            System.out.println("\nNo admin rights, user");
        }
    }


    public List<Book> getDescription(String user, String findDescription, TestCatalog catalog) {
        List<Book> list = new ArrayList<>(catalog.getBooksArrayList());  //найдем конкретное описание, в которое что-либо дабавим.
        if (user.equals("Сергей")) {                                     //права только у admin
            for (Book c : catalog.getBooksArrayList()) {                 //ввести название книги, для вывода описания
                if (c.getBook().equals(findDescription)) {
                    list.add(c);
                    System.out.println("\nModified description: " + c.getDescription() + ". Стоит прочитать!");
                }
            }

        }
        return list;
    }

    public List<Book> getNewsletterEmail(String user, String findDescription, TestCatalog catalog,UsersBase usersBase) {
        List<Book> list = new ArrayList<>(catalog.getBooksArrayList());  //найдем конкретное описание, в которое что-либо дабавим.
        if (user.equals("Сергей")) {                                     //права только у admin
            for (Book c : catalog.getBooksArrayList()) {                 //ввести название книги, для вывода описания
                if (c.getBook().equals(findDescription)) {
                    list.add(c);
                    List<UsersBase> list2 = new ArrayList<>(catalog.getUsersBaseArrayList()); //отправим текст на емайл!
                    for (UsersBase d : catalog.getUsersBaseArrayList()) {
                        list2.add(d);
                        System.out.println("\n"+d.getEmail() + " sent: " + c.getDescription()+". Стоит прочитать!");
                    }
                }
            }

        }
        return list;
    }
}
