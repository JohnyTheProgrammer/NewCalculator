package hometask20;
//        Создать класс ManagementDepartment позволяющий хранить не более 15 сотрудников Employee.
//        А также реализуйте следующие методы для класса ManagementDepartment:
//        void add(name, year, salary, gender); // добавить нового сотрудника в массив
//        Employee[] filter(Gender gender); // отбор сотрудников определенного пола
//        Employee[] filterOlder(int age); //  отбор сотрудников старше возраста age
//        Employee[] filterYounger(int age); // отбор сотрудников младше возраста age
// name; // имя; тип данных String
////        year; // год рождения; тип данных int
////        salary; // тип данных double
////        gender
//        Для вычисления возраста используем текущий год - 2019.

public class ManagementDepartment extends Employee {
    static int employeeCounter;
   static Employee employers[] = new Employee[150];

    public static void add(String name, int year, double salary){
        employeeCounter++;

            if (employeeCounter < 13) {
//                employers[employeeCounter].setName(name);
//                employers[employeeCounter].setYear(year);
//                employers[employeeCounter].setSalary(salary);
                System.out.println("number");
            } else {
                System.out.println("You reached a limit for Employee");
            }

    }
}
