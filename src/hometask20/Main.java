package hometask20;
//Спроектировать класс Employee со следующим набором полей:

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
        ManagementDepartment generalDepartment = new ManagementDepartment();
        //ManagementDepartment chuhan = new ManagementDepartment();
        generalDepartment.add("Bomj", 29, 33.56 , Employee.gender.FEMALE); //0
        generalDepartment.add("Julia", 27, 33.56 , Employee.gender.FEMALE); //1
        generalDepartment.add("Vanya", 22, 33.56 , Employee.gender.MALE); //2
        generalDepartment.add("Yura", 43, 33.56 , Employee.gender.MALE); //3
        generalDepartment.add("Stan", 21, 33.56 , Employee.gender.FEMALE); //4
        generalDepartment.add("Boba", 12, 65.56 , Employee.gender.FEMALE); //5
        generalDepartment.add("Julia", 36, 33.56 , Employee.gender.FEMALE); //6
        generalDepartment.add("Bomj", 32, 33.56 , Employee.gender.FEMALE); //7
        generalDepartment.add("Julia", 23, 98.56 , Employee.gender.FEMALE); //8
        generalDepartment.add("Vanya", 32, 70.56 , Employee.gender.MALE); //9
        generalDepartment.add("Yura", 34, 33.56 , Employee.gender.MALE); //10
        generalDepartment.add("Stan", 16, 33.56 , Employee.gender.FEMALE); //11
        generalDepartment.add("Boba", 45, 3444.56 , Employee.gender.FEMALE); //12
        generalDepartment.add("Julia", 42, 33.56 , Employee.gender.FEMALE); //13
        generalDepartment.add("SugrobAbhazov", 22, 2000.0, Employee.gender.MALE); //14
        generalDepartment.showAllEmployers(generalDepartment);
        generalDepartment.filterByGender(Employee.gender.MALE);
        System.out.println("-------------------------------Мужики--------------------------------------------");
        generalDepartment.showFilteredEmployers(generalDepartment.filterByGender(Employee.gender.MALE));
        System.out.println("------------------------------Бабы---------------------------------------------");
        generalDepartment.showFilteredEmployers(generalDepartment.filterByGender(Employee.gender.FEMALE));
        System.out.println("------------------------------------Младшенький---------------------------------------");
        generalDepartment.showFilteredEmployers(generalDepartment.filterYounger(22));
        System.out.println("------------------------------------Под сраку лет---------------------------------------");
        generalDepartment.showFilteredEmployers(generalDepartment.filterOlder(22));


    }
}
