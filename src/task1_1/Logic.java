package task1_1;

import java.util.ArrayList;

public class Logic {

    public void getName(String user){
        if(user.equals("Сергей")){
            System.out.println("Hello, admin");
        }
        else{
            System.out.println("Hello, user");
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


}
