/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.8*/


public class Employee {
	
	private String eName = "";				//Creates an instance variable for the employee name
	private double cSalary = 0;				//Creates an instance variable for the employee's current salary
	
	public Employee(){
		//Sets initial conditions to null and 0
	}
	
	public Employee(String employeeName, double currentSalary){
		
		eName = employeeName;			//Assigns the provided employee name to the instance variable eName
		cSalary = currentSalary;		//Assigns the provided employee salary to the instance variable cSalary
	}
	
	public String getName(){			//This method will return the name of the employee to the main method which can be assigned to a variable
		
		return eName;					
	}
	
	public double getSalary(){			//This method will return the salary of the employee to the main method which can be assigned to a variable	
		
		return cSalary;
	}
	
	public void raiseSalary(double byPercent){				//This method takes the employee's salary, and adds onto it a specified percentage of it
															//its value, then updates the current salary
		double percentDecimal = 1+(byPercent*(0.01));
		
		cSalary *= percentDecimal;
	}
	
	

}
