package hometask16;
//Класс Author должен содержать информацию о человеке написавшем книгу:
//        имя и фамилия автора;
//        год рождения;

public class Author {
    private String authorName;
    private String surname;
    private int date;
public Author(){

}
    public Author( String authorName, String surname, int date){
        this.authorName = authorName;
        this.surname = surname;
        this.date = date;
    }
    public String getName() {
        return authorName;
    }

    public void setName(String authorName) {
        this.authorName = authorName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
