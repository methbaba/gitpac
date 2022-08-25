package project_1;

public class emplpoyee {



	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	public void  setter(String id , String name, int salary, int bonus,int joblevel) {
		this.employeeId=id;
		this.employeeName=name;
		this.salary=salary;
		this.bonus=bonus;
		this.jobLevel=joblevel;
	}
	
	
	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}

	public void get_attri() {
		System.out.println("Employee Details");
		System.out.println("Employee Id: " +employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Salary: " + salary);
	}
}
