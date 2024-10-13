public class Main { 
    public static void main(String[] args) { 
        Company company = new Company(); 
        company.addEmployee(new Employee("Alice", 70000, 30)); 
        company.addEmployee(new Employee("Bob", 50000, 45)); 
        company.addEmployee(new Employee("Charlie", 60000, 25)); 
 
        Iterator<Employee> iterator = company.createIterator(); 
 
        double totalSalary = 0; 
        double maxSalary = Double.NEGATIVE_INFINITY; 
        double minSalary = Double.POSITIVE_INFINITY; 
        Employee oldestEmployee = null; 
 
        while (iterator.hasNext()) { 
            Employee employee = iterator.next(); 
            totalSalary += employee.getSalary(); 
 
            if (employee.getSalary() > maxSalary) { 
                maxSalary = employee.getSalary(); 
            } 
            if (employee.getSalary() < minSalary) { 
                minSalary = employee.getSalary(); 
            } 
            if (oldestEmployee == null || employee.getAge() > oldestEmployee.getAge()) { 
                oldestEmployee = employee; 
            } 
        } 
 
        double averageSalary = totalSalary / company.getEmployees().size(); 
 
        System.out.println("Average Salary: " + averageSalary); 
        System.out.println("Max Salary: " + maxSalary); 
        System.out.println("Min Salary: " + minSalary); 
        System.out.println("Oldest Employee: " + (oldestEmployee != null ? oldestEmployee.getName() : "N/A")); 
    } 
}