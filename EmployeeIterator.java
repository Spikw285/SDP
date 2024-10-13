public class EmployeeIterator implements Iterator<Employee> { 
  private Company company; 
  private int currentIndex = 0; 
 
  public EmployeeIterator(Company company) { 
      this.company = company; 
    } 
 
  @Override 
  public boolean hasNext() { 
      return currentIndex < company.getEmployees().size(); 
  } 
 
  @Override 
  public Employee next() { 
      return company.getEmployees().get(currentIndex++); 
  } 
}