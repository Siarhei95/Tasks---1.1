package task1_1;

public class Book {
    private String book;
    private String author;
    private int yearOfPublication;
    private String description;
    private String nameLibrary;


    public Book(String nameLibrary){
        this.nameLibrary = nameLibrary;
    }

    public Book(String book, String author, int yearOfPublication, String description){
        this.book = book;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.description = description;
    }
    public String getNameLibrary(){
        return nameLibrary;
    }

    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getDescription(){
        return description;
    }


    public String toString() {
        return  String.format("\tBook: " + book + " \t author: " + author + " \t  yearOfPublication: "
                + yearOfPublication + "\t  description: " + description +"\n");
    }
}
