package hometask20;
//
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

public class ManagementDepartment {
    static int employeeCounter = -1;
    static final int MAXDEPARTMENTSIZE = 15;
    Employee employers[] = new Employee[MAXDEPARTMENTSIZE];
    Employee employersByGender[] = new Employee[MAXDEPARTMENTSIZE];
    Employee youngEmployers[] = new Employee[MAXDEPARTMENTSIZE];
    Employee oldEmployers[] = new Employee[MAXDEPARTMENTSIZE];

    public void add(String name, int year, double salary, Employee.gender sex){
        employeeCounter++;
        if (employeeCounter < employers.length) {
                employers[employeeCounter] = new Employee(name, year, salary, sex);
                //System.out.print("number: " + employeeCounter);
            } else {
                System.out.println("You reached a limit for Employee");
            }
    }
   public Employee[] filterByGender(Employee.gender choosenGender){
       int counter = 0;
        for (int i = 0; i < MAXDEPARTMENTSIZE; i++) {
            if(employers[i].getSex() == choosenGender) {
                employersByGender[counter] = new Employee(employers[i].getName(), employers[i].getYear(), employers[i].getSalary(), employers[i].getSex());
                counter++;
           }
        }
       return employersByGender;
    }
    public Employee[] filterYounger(int age){
        int counter = 0;
        for (int i = 0; i < MAXDEPARTMENTSIZE; i++) {
            if(employers[i].getYear() <= age) {
                youngEmployers[counter] = new Employee(employers[i].getName(), employers[i].getYear(), employers[i].getSalary(), employers[i].getSex());
                counter++;
            }
        }
        return youngEmployers;
    }
    public Employee[] filterOlder(int age){
        int counter = 0;
        for (int i = 0; i < MAXDEPARTMENTSIZE; i++) {
            if(employers[i].getYear() >=age) {
                oldEmployers[counter] = new Employee(employers[i].getName(), employers[i].getYear(), employers[i].getSalary(), employers[i].getSex());
                counter++;
            }
        }
        return oldEmployers;
    }

public void showFilteredEmployers(Employee employArray[]){
    for (int i = 0; i < employArray.length; i++) {
        try{
//здесь код, который потенциально может привести к ошибке
        System.out.print( i + "\t" + employArray[i].getName()+ "\t");
        System.out.print(employArray[i].getYear() + "\t");
        System.out.print(employArray[i].getSalary() + "\t");
        System.out.println(employArray[i].getSex() + "\t");
    }
        catch(NullPointerException a){
            break;
////здесь описываются действия, направленные на обработку исключений
   }
    }
}
    public void showAllEmployers(ManagementDepartment depart){
        for (int i = 0; i < ManagementDepartment.employeeCounter + 1; i++) {
            if(ManagementDepartment.employeeCounter > ManagementDepartment.MAXDEPARTMENTSIZE){
                break;
            }
            System.out.print((i+1) + ":\t" +depart.employers[i].getName()+ "\t");
            System.out.print(depart.employers[i].getYear() + "\t");
            System.out.print(depart.employers[i].getSalary() + "\t");
            System.out.print(depart.employers[i].getSex() + "\t");
            System.out.println();
        }
    }
    public ManagementDepartment() {
    }
}
