package hometask21;

public class Manager extends Employee {
    private  int cabinetNumber;

    public Manager(String name, String surname, int age, String department, String departmentAdress, int cabinetNumber) {
        super(name, surname, age, department, departmentAdress);
        this.cabinetNumber = cabinetNumber;
    }

    public Manager(String name, String surname, int age, String department) {
        super(name, surname, age, department);
    }

    public Manager() {
    }

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }
}
