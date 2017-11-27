import java.util.Comparator;

public class Employeecomparator implements Comparator<Employee>{
	int id;
	String name;   
	int salary; 
	public int compare(Employee salary1,Employee salary2) {
		if (salary1.getSalary()>salary2.getSalary())
		{
		return 1;
		}else if (salary1.getSalary()< salary2.getSalary()) {
			return -1;
		}
		else if (salary1.getSalary()==salary2.getSalary())
		
		return 0;
		return 0;
		
		
	}
	
}