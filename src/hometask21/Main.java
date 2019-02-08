package hometask21;

public class Main {
    public static void main(String[] args) {
        //Manager(String name, String surname, int age, String department, String departmentAdress, int cabinetNumber)
        Manager [] workers = new Manager[5];
        workers[0] = new Manager();
        workers[1] = new Manager("Anton","Petrov",27,"GosDuma","Kanatnaya 25",1);
        workers[2] = new Manager("Julia", "Ivanova", 18, "Hillel");

        System.out.println(workers[0].getName());

        System.out.print(workers[1].getName() + "\t");
        System.out.print(workers[1].getSurname() + "\t");
        System.out.print(workers[1].getAge() + "\t");
        System.out.print(workers[1].getDepartment() + "\t");
        System.out.print(workers[1].getDepartmentAdress() + "\t");
        System.out.println(workers[1].getCabinetNumber() + "\t");

        System.out.print(workers[2].getName() + "\t");
        System.out.print(workers[2].getSurname() + "\t");
        System.out.print(workers[2].getAge() + "\t");
        System.out.print(workers[2].getDepartment() + "\t");
    }
}
