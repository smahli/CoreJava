public class Employee {
    String EmpName;
    int EmpID;
    Employee(String Emp_Name,int Emp_id){
        this.EmpName= Emp_Name;
        this.EmpID=Emp_id;

    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shambhu Kumar",105);           // If we don't initialize EmpName and ImpID Default value of all employees
                                                                                  // will be same

        Employee e2 = new Employee("Shiwshankar",101);
        Employee e3 = new Employee("Gurpreet",102);

        System.out.println(e1.EmpID);
        System.out.println(e1.EmpName);
    }
}
