package hometask16;

public class Main {
    public static void main(String[] args) {
       // Book(String bookName, int letters, String authorName, String surname, int date)
        Bookshelf shelfForBook = new Bookshelf();
        Book book1 = new Book("left4dead1", 48, "Sergey", "Polyanskiy", 1948);
        Book book2 = new Book("Kashtanka2", 500, "Viktor", "Mazur", 2019);
        Book book3 = new Book("left4dead3", 48, "Petya", "Polyanskiy", 1948);
        Book book4 = new Book("Holy Bible4", 500, "Volodya", "Mazur", 2019);
        Book book5 = new Book("Terrorism for Kettle5", 48, "Antuan", "Polyanskiy", 1948);
        Book book6 = new Book("Stop Boil my Brain6", 500, "Edgar", "Mazur", 2019);
        Book book7 = new Book("left4dead7", 48, "Kolya", "Polyanskiy", 1948);
        Book book8 = new Book("Kashtanka8", 500, "Polina", "Mazur", 2019);

        System.out.println(book8.author.getDate());
        shelfForBook.add(book1);
        shelfForBook.add(book2);
        shelfForBook.add(book3);
        shelfForBook.add(book4);
        shelfForBook.add(book5);
        shelfForBook.add(book6);
        shelfForBook.add(book7);
        shelfForBook.add(book8);
        shelfForBook.showAllBooks();
    }
}
