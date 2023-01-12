package encapsulation;

public class demo 
{
 private String empName;
 private double salary;
 private int empID;
 
 
 public demo(String name, double salary, int id)
 {
  this.empName = name;
  this.salary = salary;
  this.empID = id;
  
 
}
  public String getEmpName(){
	return empName;  
  }
  public double getsalary(){
		return salary;  
	  }
  public int getEmpId(){
		return empID;  
	  }
  public String setEmpName(String name){
		return empName;  
	  }
  public double setsalary(double  d){
		return salary;  
	  }
  public int setEmpId(int id){
		return empID;  
	  }

}