abstract class Employee {
    
    String name;
    int id;
    String department;

    abstract double calculatePay();
}

class FullTimeEmployee extends Employee {

    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {

        this.name = name;
        this.id = id;
        this.department = department;
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculatePay() {
        
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {

        this.name = name;
        this.id = id;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {

        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {

    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {

        this.name = name;
        this.id = id;
        this.department = department;
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    double calculatePay() {

        return contractAmount;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Alice", 1, "HR", 50000);
        Employee e2 = new PartTimeEmployee("Bob", 2, "Support", 200, 25);
        Employee e3 = new ContractEmployee("Charlie", 3, "IT", "ProjectX", 30000);

        System.out.println("FullTimeEmployee Pay: " + e1.calculatePay());
        System.out.println("PartTimeEmployee Pay: " + e2.calculatePay());
        System.out.println("ContractEmployee Pay: " + e3.calculatePay());
    }
}