package hometask16;
//Класс Author должен содержать информацию о человеке написавшем книгу:
//        имя и фамилия автора;
//        год рождения;

public class Author {
    String name;
    String surname;
    int date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
