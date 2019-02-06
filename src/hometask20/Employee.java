package hometask20;

public class Employee {
    //Спроектировать класс Employee со следующим набором полей:
//        name; // имя; тип данных String
//        year; // год рождения; тип данных int
//        salary; // тип данных double
//        gender //  enum с двумя возможными значениями {MALE, FEMALE}

    String name;
    int year;
    double salary;
    public Employee(){

    }
    public Employee(String name, int year, double salary){
        setName(name);
        setYear(year);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
