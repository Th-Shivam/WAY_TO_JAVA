import java.util.* ;
public class E1 {
    double emp_id ;
    String emp_name ;
    double basic_sal ;
    double gross_sal ;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        emp_id = sc.nextDouble();
        System.out.print("Enter Employee Name : ");
        emp_name = sc.next();
        System.out.print("Enter Employee Basic Salary : ");
        basic_sal = sc.nextDouble();
        sc.close();

    }

    public void calculateGross(){
        double hra = 0.25 * basic_sal ;
        double da = 0.10 * basic_sal ;
        gross_sal = basic_sal + hra + da ;
    }

    public void display(){
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee Basic Salary : " + basic_sal);
        System.out.println("Employee Gross Salary : " + gross_sal);
    }

    public static void main(String[] args) {
        E1 emp = new E1() ;
        emp.getDetails();
        emp.calculateGross();
        emp.display();
    }
}
