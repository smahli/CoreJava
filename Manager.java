public class Manager {
    private  int Emp_id;   // data private

    public void setEmp_id(int emp_id) {   //setter
        Emp_id = emp_id;
    }

    public int getEmp_id() {            //getter
        return Emp_id;
    }

}
 class Company2 {
     public static void main(String[] args) {
         Manager m= new Manager();
         m.setEmp_id(101);
         System.out.println(m.getEmp_id());
     }

}

