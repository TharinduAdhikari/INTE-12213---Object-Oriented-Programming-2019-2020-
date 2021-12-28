public class Employee {
    private String firstName ;
    private String lastName ;
    private double monthlySalary ;

    public Employee (String fName , String Lname , double msalary ) {
        firstName = fName;
        lastName = Lname ;

        if (msalary > 0) {
            monthlySalary = msalary;

        } else {
            monthlySalary = 0.0 ;
        }
    }

    public void setFirstName (String name ) {
        firstName = name ;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setLastName (String name ) {
        lastName = name ;
    }

    public String getLastName () {
        return lastName;
    }

    public void setSalary (Double salary ) {
        if (salary > 0) {
            monthlySalary = salary;
        } else {
            monthlySalary = 0.0 ;
        }
    }

    public Double getSalary () {
        return monthlySalary;
    }
}
