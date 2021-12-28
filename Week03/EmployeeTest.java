public class EmployeeTest {
    public static void main(String[] args) {
        byte raiseFactor = 110;
        Employee emp1 = new Employee("Sandushi","weraduwa",50000);
        Employee emp2 = new Employee("waruna","wickramasinghe",40000);
        System.out.println(emp1.getFirstName()+" 's salary is "+ emp1.getSalary());
        System.out.println(emp2.getFirstName()+" 's salary is "+ emp2.getSalary());
        System.out.println("\nIncreaasing salary by 10%\n");
        emp1.setSalary(emp1.getSalary()/100* raiseFactor);
        emp2.setSalary(emp2.getSalary()/100* raiseFactor);
        System.out.println("Yearly salary of "+emp1.getFirstName()+" is "+emp1.getSalary()*12);
        System.out.println("Yearly salary of "+emp2.getFirstName()+" is "+emp2.getSalary()*12);
    }
}
