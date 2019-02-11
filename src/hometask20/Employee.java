package hometask20;

public class Employee {
    enum gender {MALE, FEMALE}

   private String name;
    private int year;
    private double salary;
    private gender sex;

    public Employee(){ }

    public Employee(String name, int year, double salary, gender sex){
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public gender getSex() {
        return sex;
    }
    public void setSex(gender sex) {
        this.sex = sex;
    }
}
