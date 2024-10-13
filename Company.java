import java.util.ArrayList; 
import java.util.List; 
 
public class Company implements Aggregate<Employee> { 
  private List<Employee> employees = new ArrayList<>(); 
 
  public void addEmployee(Employee employee) { 
      employees.add(employee); 
    } 
 
  public void removeEmployee(Employee employee) { 
      employees.remove(employee); 
    } 
 
  @Override 
  public Iterator<Employee> createIterator() { 
      return new EmployeeIterator(this); 
    } 
 
  public List<Employee> getEmployees() { 
      return employees; 
    } 
}