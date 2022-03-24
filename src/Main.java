public class Main {


    public static void main(String[] args) {
/*
Make (add code to class Tank),
which can turn around
*/
        Employee Ivanov = new Employee("Иванов Иван");
        Ivanov.ChangeEmployeePosition("Директор");
        Ivanov.ChangeEmployeeSalary(100000);

        Employee Petrov = new Employee("Петров Вася");
        Petrov.ChangeEmployeePosition("Заместитель директора");
        Petrov.ChangeEmployeeSalary(50000);

        Employee Kuzya = new Employee("Кузя");
        Kuzya.ChangeEmployeePosition("слесарь");
        Kuzya.ChangeEmployeeSalary(1000);

        Employee Bro = new Employee("Бро","блогер", 10000000);

        Ivanov.printEmployee();
        Petrov.printEmployee();
        Kuzya.printEmployee();
        Bro.printEmployee();

/*
Must be output

The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.

*/
    }

}
