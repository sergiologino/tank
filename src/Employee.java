public class Employee {
    String name, position;
    int salary;
    private static int numberId=0;

    public Employee(){
        this("no name", "-", 0);
    }
    public Employee(String name){
        this(name,"-",0);
    }
    public Employee(String name, String position){
        this(name,position,0);
    }
    public Employee(String name, String position, int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
        numberId++;
    }
    public void ChangeEmployeeSalary(int i){
        salary=i;
    }
    public void ChangeEmployeePosition(String p){
        position=p;
    }
    public void printEmployee() {
        System.out.println("The Employee " + name + " (" + numberId + ")  have position " + position + " and his salary is " + salary);
    }
}
