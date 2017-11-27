import java.util.ArrayList;
import java.util.Collections;

public class Employee {
 
public Employee(int id, String name, int salary) {
	    this.name = name;
	    this.id = id;
	    this.salary = salary;
	 }
   private int id;
   private String name;   
   private int salary; 
   public int getId() {
      return id;
   }
   public String getName() {
	      return name;
	   }
   public int getSalary() {
	      return salary;
	   }
   public void setId( int id ) {
      this.id = id;
   }
 public void setName( String name ) {
      this.name = name;
   }
   public void setSalary( int salary )
   {
      this.salary = salary;
   }
   @Override
   public boolean equals(Object obj)
   {
	Employee Employee2 =(Employee)obj;
	if((this.id==Employee2.id)&&(this.name==Employee2.name)&&(this.salary==Employee2.salary))
	{
return true;
   }
   return false;
}
	
	  public static void main(String args[]) 
		{
		  
		 ArrayList<Employee> list =new ArrayList<Employee>();
		Employee Employee1=new Employee(1,"Vijay",2300);  
		Employee Employee2=new Employee(2,"sam",2400);  
		Employee Employee3=new Employee(5,"adi",2100); 
		Employee Employee4=new Employee(6,"Gk",2600);
		Employee Employee5=new Employee(7,"new",2500); 
		 list.add(Employee1);
		 list.add(Employee3);
		 list.add(Employee5);
		 list.add(Employee4);
		 list.add(Employee2);
		 Collections.sort(list,new Employeecomparator());
		 
	  for (Employee Employee:list)
	  {
		  System.out.println("id:"+Employee.getId());
		  System.out.println("name:"+Employee.getName());
		  System.out.println("salary:"+Employee.getSalary());
		  
	  }
}


private class number implements Comparable<Employee>{
	int id;
	String name;   
	int salary;

	public int compareto(Employee id1, Employee id2) {
	if(id1.getId() < id2.getId()){
			return 1;
		} else {
			return -1;
		}
	}	
}
}








		