/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.8*/


public class EmployeeTester {						//Tests the employee class

	public static void main(String[] args) {
		
		Employee harry = new Employee("Harry Potter", 50000);		//Creates the employee harry with name Harry Potter and salary 50,000
		
		String name = harry.getName();								//Gets the name of the harry employee and assigns it to a string
		double salary = harry.getSalary();							//Gets the salary of the harry employee and assigns it to a double
		
		harry.raiseSalary(50);										//Raises the harry salary by 50%
		
		double newSalary = harry.getSalary();						//Assigns the new salary to another double
		
		System.out.println("The employee's name is: "+name+
				"\nThe employee's salary before raise is: $"+salary+
				"\nThe employee's salary  50% raise is: $"+newSalary);	//Outputs all values collected to th
		
		
	}

}
