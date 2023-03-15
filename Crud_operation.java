import java.util.*;

class Employee{
    private int empno;
    private String ename;
    private int salary;

    public Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public int getEmpno(){
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public int getSalary(){
        return salary;
    }
    public String toString(){
        return empno+"  "+ename+"  "+salary;
    }
}




public class Crud_operation {
    public static void main(String[] args) {
        List<Employee> c = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter your Choice : ");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter Empno : ");
                    int eno = sc.nextInt();

                    System.out.println("Enter EmpName : ");
                    String name = s.nextLine();

                    System.out.println("Enter Salary : ");
                    int sal = sc.nextInt();

                    c.add(new Employee(eno,name, sal));
                    break;
                case 2:
                    System.out.println("--START--");
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("--END--");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Empno to Search : ");
                    int empno = sc.nextInt();
                    System.out.println(" ----- ");
                    i = c.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        if (e.getEmpno() == empno){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println(" ---- ");
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter Empno to Delete");
                    empno = s.nextInt();
                    System.out.println(" ----- ");
                    i = c.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        if (e.getEmpno() == empno){
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    else {
                        System.out.println("Record is Deleted Successfully");
                    }
                    System.out.println(" ------ ");
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter Empno to Update :");
                    empno = s.nextInt();
                    System.out.println(" ----- ");
                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()){
                        Employee e = li.next();
                        if (e.getEmpno() == empno){
                            System.out.println("Enter new Name : ");
                            name = sd.nextLine();

                            System.out.println("Enter new Salary : ");
                            sal = s.nextInt();
                            li.set(new Employee(empno, name , sal));
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record is Updated Successfully...!");
                    }
                    System.out.println(" ----- ");
                    break;

            }
        }while (ch!=0);
    }
}
