public class Employee {
    public String firstName;
    public String lastName;
    public int monthlySalary;

    public Employee(String firstName, String lastName, int monthlySalary){

        if (monthlySalary < 0){
            monthlySalary = 0;
        }

        this.monthlySalary = monthlySalary;
        System.out.println("your monthly salary is " + monthlySalary);

        int yearlySalary = monthlySalary * 12;
        System.out.println("your yearly salary is " +yearlySalary);

        double raiseYearlySalary = yearlySalary * 1.1;
        System.out.println("your yearly salary after the raise is " + raiseYearlySalary);


    }
}
