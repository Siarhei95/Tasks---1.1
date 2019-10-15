//создать консольное приложение “Учет книг в домашней библиотеке”
// •  Система учитывает книги как в электронном, так и в бумажном варианте.
// •  Существующие роли: пользователь, администратор.
// •  Пользователь может просматривать книги в каталоге книг, осуществлять поиск
//  книг в каталоге.
// •  Администратор может модифицировать каталог.
// •  *При добавлении описания книги в каталог оповещение о ней рассылается на
//    e-mail всем пользователям
// •  **При просмотре каталога желательно реализовать постраничный просмотр
// •  ***Пользователь может предложить добавить книгу в библиотеку, переслав её
//    администратору на e-mail.
// •  Каталог книг хранится в текстовом файле.
// •  Данные аутентификации пользователей хранятся в текстовом файле. Пароль
//    не хранится в открытом виде


package task1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good afternoon! Are you an administrator or user?");
        String nameUser = scanner.next();

        TestCatalog catalog = new TestCatalog();
        Admin admin = new Admin("Сергей");
        User user = new User(nameUser);
        Logic logic = new Logic();
        Book book = new Book("Home library");
        catalog.addBooks(new Book("Радуга","Лоуренс", 2001,"Книга о становлении личности"));
        catalog.addBooks(new Book("Престиж","Прист", 1998,"Экранизированная книга"));
        catalog.addBooks(new Book("Замок","Кафка", 2003,"Книга, название которой состоит из одного слова"));
        catalog.addBooks(new Book("Кафедра","Грекова", 2009,"Книга, которую не читал, но у меня она есть"));
        catalog.addBooks(new Book("Общепит","Глущенко", 2011,"Недочитанная книга"));

        logic.getName(nameUser);
        System.out.println("\nYou can see the list of books:\n");
        System.out.println(catalog.getBookList());
        System.out.print("\nEnter the desired book(enter the name of book): \n");
        String finder = scanner.next();
        catalog.getNecessaryBook(finder);
        logic.getModification(nameUser, book);
    }
}
