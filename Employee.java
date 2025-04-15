public class Employee
{
    int empID;
    String ename;
    double sal;
    
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.empID=3581;
        e1.ename="M Srinu";
        e1.sal=75000;
        e2.empID=4567;
        e2.ename="B Pavan";
        e2.sal=80000;
        e3.empID=1234;
        e3.ename="M Ashok";
        e3.sal=85000;
        System.out.println("EmpId: "+e1.empID+"\nEname: "+e1.ename+"\nSal: "+e1.sal+"\n");
        System.out.println("\nEmpId: "+e2.empID+"\nEname: "+e2.ename+"\nSal: "+e2.sal+"\n");
        System.out.println("\nEmpId: "+e3.empID+"\nEname: "+e3.ename+"\nSal: "+e3.sal+"\n");
    }
}