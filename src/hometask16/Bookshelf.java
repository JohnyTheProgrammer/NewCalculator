package hometask16;

//        Класс книга должен содержать минимальный набор полей:
//        название книги;
//        кол-во страниц;
//        информацию об авторе книги.
//
//        Класс Author должен содержать информацию о человеке написавшем книгу:
//        имя и фамилия автора;
//        год рождения;
//
//        Создайте класс Bookshelf, который может хранить максимальное кол-во книг 10.
//        Класс Bookshelf должен содержать только 2 метода:

//        При попытке добавить 11-ю книгу, вы должны вывести сообщение от невозможности добавления новой книги на книжную
//        полку в связи с тем, что она уже полностью заполнена.
//        Метод showAllBooks() выводит в консоль все имеющиеся книги на данный момент в формате:
//        Название книги - Имя автора
//        Название книги - Имя автора
//        и т.д.
//        Следите чтобы свойства класса имели спецификатор доступа private, а методы - public.

public class Bookshelf {
    public static int bookShelfCapacity = -1;
    private static int bookshelfSize = 10;
   static Book [] booksArray = new Book[bookshelfSize];

   public Bookshelf(){

}

  public static void add(Book book) {
      bookShelfCapacity++;
            if(bookShelfCapacity < booksArray.length){
                booksArray[ bookShelfCapacity] = book;

            }
            else {
                System.out.println("На этой полке помещается только 10 книг и вы достигли предела!");
            }
        }

    public static  void showAllBooks() {
     for (int i = 0; i <= bookShelfCapacity; i++) {
        System.out.print(booksArray[i].author.getName() + "\t");
         System.out.print(booksArray[i].author.getSurname() + "\t");
         System.out.print(booksArray[i].author.getDate() + "\t");
        System.out.println(booksArray[i].getBookName());
       //System.out.println(booksArray[i].getLetters());
     }
    }
}
