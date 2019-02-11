package hometask21;

public class Employee extends Person {
private String department;
private String departmentAdress;

    public Employee(String name, String surname, int age, String department, String departmentAdress) {
        super(name, surname, age);
        this.department = department;
        this.departmentAdress = departmentAdress;
    }

    public Employee(String name, String surname, int age, String department) {
        super(name, surname, age);
        this.department = department;
    }

    public Employee() {
    }
    public String getDepartmentAdress() {
        return departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
