package hometask20;
//Спроектировать класс Employee со следующим набором полей:
//        name; // имя; тип данных String
//        year; // год рождения; тип данных int
//        salary; // тип данных double
//        gender //  enum с двумя возможными значениями {MALE, FEMALE}
//
//        Создать класс ManagementDepartment позволяющий хранить не более 15 сотрудников Employee.
//        А также реализуйте следующие методы для класса ManagementDepartment:
//        void add(name, year, salary, gender); // добавить нового сотрудника в массив
//        Employee[] filter(Gender gender); // отбор сотрудников определенного пола
//        Employee[] filterOlder(int age); //  отбор сотрудников старше возраста age
//        Employee[] filterYounger(int age); // отбор сотрудников младше возраста age
//
//        Для вычисления возраста используем текущий год - 2019.


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {

            ManagementDepartment.add("hhh", 45, 33.56);
            System.out.println(ManagementDepartment.employeeCounter);
            if(ManagementDepartment.employeeCounter> 10){
                break;
            }
        }
    }
}
